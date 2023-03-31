package com.manuel.proyectointegrador.controller;

import com.manuel.proyectointegrador.dto.EnvioDTO;
import com.manuel.proyectointegrador.model.Envio;
import com.manuel.proyectointegrador.service.EnvioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class EnvioController {
    EnvioService envioService;
    @Autowired
    public void EnvioController(EnvioService envioService){
        this.envioService = envioService;
    }

    // crear envio
    @PostMapping("/envio")
    public String crearEnvio(@RequestBody EnvioDTO envio){
        return "numero guia: estado envio:";
        //retorna el numero guia y el estadoEnvio
    }

    // obtener envio numero guia
    @GetMapping("/envio/{numeroGuia}")
    public EnvioDTO obtenerEnvio(@PathVariable("numeroGuia") int numeroGuia){
        return new EnvioDTO();
    }

    // actualizar estado envio
    @PatchMapping("/envio")
    public void actualizarEstadoEnvio(@RequestParam("guia") Integer numGuia, @RequestParam("estado") String estadoEnvio, @RequestParam("empleado") Integer cedulaEmpleado){
        //recibe numero guia, estadoEnvio, cedulaEmpleado
        //tener en cuenta las validaciones para actualizar el paquete.
    }


    @GetMapping("/envio")
    public List<EnvioDTO> filtrarEnvios(@RequestParam String estadoEnvio, @RequestParam int cedulaEmpleado){
        //tener en cuenta las validaciones.
        return new ArrayList<>();
    }

}
