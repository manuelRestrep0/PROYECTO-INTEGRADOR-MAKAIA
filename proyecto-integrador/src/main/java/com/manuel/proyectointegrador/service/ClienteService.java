package com.manuel.proyectointegrador.service;

import com.manuel.proyectointegrador.dto.ClienteDTO;
import com.manuel.proyectointegrador.exception.ApiRequestException;
import com.manuel.proyectointegrador.model.Cliente;
import com.manuel.proyectointegrador.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public ClienteDTO crearCliente(ClienteDTO clienteDTO){
        if(clienteDTO.getNombre()==null){
            throw new ApiRequestException("Se requiere el nombre");
        } else if(clienteDTO.getApellido()==null){
            throw new ApiRequestException("Se requiere el apellido");
        } else if(clienteDTO.getCedula()==null){
            throw new ApiRequestException("Se requiere una identificacion valida");
        }
        Cliente cliente = new Cliente(
                clienteDTO.getCedula(),
                clienteDTO.getNombre(),
                clienteDTO.getApellido(),
                clienteDTO.getCelular(),
                clienteDTO.getCorreo(),
                clienteDTO.getDireccionResidencial(),
                clienteDTO.getCiudad());
        this.clienteRepository.save(cliente);
        return clienteDTO;
    }

    public ClienteDTO obtenerCliente(Integer cedula){
        Optional<Cliente> cliente = this.clienteRepository.findById(cedula);
        if(cliente.isPresent()){
            ClienteDTO clienteDTO = new ClienteDTO(
                    cliente.get().getCedula(),
                    cliente.get().getNombre(),
                    cliente.get().getApellido(),
                    cliente.get().getCelular(),
                    cliente.get().getCorreoElectronico(),
                    cliente.get().getDireccionResidencial(),
                    cliente.get().getCiudad()
                    );
            return clienteDTO;
        }
        throw new ApiRequestException("Este cliente no se encuentra registrado");
    }

    public void eliminarCliente(Integer cedula){
        this.clienteRepository.deleteById(cedula);
    }
}
