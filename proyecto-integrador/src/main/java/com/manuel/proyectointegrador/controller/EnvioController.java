package com.manuel.proyectointegrador.controller;

import com.manuel.proyectointegrador.envio.Envio;
import com.manuel.proyectointegrador.service.EnvioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/envios")
public class EnvioController {
    EnvioService envioService;
    @Autowired
    public void EnvioController(EnvioService envioService){
        this.envioService = envioService;
    }

    @PostMapping
    public String crearEnvio(@RequestBody Envio envio){
        return "numero guia: estado envio:";
        //retorna el numero guia y el estadoEnvio
    }

    @GetMapping("/{numeroGuia}")
    public Envio obtenerEnvio(@PathVariable("numeroGuia") int numeroGuia){
        return new Envio();
    }

    @PatchMapping
    public void actualizarEstadoEnvio(@RequestBody Envio envio){
        //recibe numero guia, estadoEnvio, cedulaEmpleado
        //tener en cuenta las validaciones para actualizar el paquete.
    }

    @GetMapping
    public List<Envio> filtrarEnvios(@RequestBody Envio envio){
        //tener en cuenta las validaciones.
        return new ArrayList<>();
    }

}
