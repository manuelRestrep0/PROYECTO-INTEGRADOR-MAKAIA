package com.manuel.proyectointegrador.service;

import com.manuel.proyectointegrador.dto.EnvioDTO;
import com.manuel.proyectointegrador.exception.ApiRequestException;
import com.manuel.proyectointegrador.model.Cliente;
import com.manuel.proyectointegrador.model.Envio;
import com.manuel.proyectointegrador.model.Paquete;
import com.manuel.proyectointegrador.repository.ClienteRepository;
import com.manuel.proyectointegrador.repository.EmpleadoRepository;
import com.manuel.proyectointegrador.repository.EnvioRepository;
import com.manuel.proyectointegrador.repository.PaqueteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

@Service
public class EnvioService {

    private EnvioRepository envioRepository;
    private ClienteRepository clienteRepository;
    private EmpleadoRepository empleadoRepository;
    private PaqueteRepository paqueteRepository;

    @Autowired
    public EnvioService(EnvioRepository envioRepository, ClienteRepository clienteRepository, EmpleadoRepository empleadoRepository, PaqueteRepository paqueteRepository) {
        this.envioRepository = envioRepository;
        this.clienteRepository = clienteRepository;
        this.empleadoRepository = empleadoRepository;
        this.paqueteRepository = paqueteRepository;
    }

    public String crearEnvio(EnvioDTO envioDTO){
        if(envioDTO.getCedulaCliente()==null || envioDTO.getCiudadDestino()==null ||
            envioDTO.getCiudadOrigen()==null || envioDTO.getDireccionDestino()==null
                || envioDTO.getNombreRecibe()==null || envioDTO.getNumRecibe()==null
                || envioDTO.getValorDeclaradoPaquete()==null || envioDTO.getPeso()==null){
            throw new ApiRequestException("Hace falta llenar todos los campos");
        }
        Optional<Cliente> cliente = Optional.of(this.clienteRepository.getById(envioDTO.getCedulaCliente()));
        if(cliente.isPresent()){
            Paquete paquete = new Paquete(asignarTipoPaquete(envioDTO.getPeso()),envioDTO.getPeso(),envioDTO.getValorDeclaradoPaquete());
            this.paqueteRepository.save(paquete);
            Envio envio = new Envio(
                cliente.get(),envioDTO.getCiudadOrigen(),envioDTO.getCiudadDestino(),envioDTO.getDireccionDestino(),
                    envioDTO.getNombreRecibe(),envioDTO.getNumRecibe(),asignarHora(),"RECIBIDO",asignarPrecioEnvio(paquete.getTipoPaquete())
                    ,paquete
            );
            this.envioRepository.save(envio);
            return envio.toString();
        } else{
            throw new ApiRequestException("El cliente con cedula "+envioDTO.getCedulaCliente()+" debe de estar registrado para poder enviar el paquete.");
        }
    }

    public String asignarTipoPaquete(Integer peso){
        if(peso<2){
            return "LIVIANO";
        } else if(peso>=2 && peso<5){
            return "MEDIANO";
        }
        return "GRANDE";
    }
    public Double asignarPrecioEnvio(String tipo){
        if(tipo.equals("GRANDE")){
            return 50000.0;
        } else if(tipo.equals("MEDIANO")){
            return 40000.0;
        }
        return 30000.0;
    }
    public String asignarHora(){
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
