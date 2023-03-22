package com.manuel.proyectointegrador.controller;

import com.manuel.proyectointegrador.envio.Envio;
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

    @PostMapping("/envios")
    public String crearEnvio(@RequestBody Envio envio){
        return "numero guia: estado envio:";
        //retorna el numero guia y el estadoEnvio
    }

    @GetMapping("/envios/{numeroGuia}")
    public Envio obtenerEnvio(@PathVariable("numeroGuia") int numeroGuia){
        return new Envio();
    }

    @PatchMapping("/envios")
    public void actualizarEstadoEnvio(@RequestBody Envio envio){
        //recibe numero guia, estadoEnvio, cedulaEmpleado
        //tener en cuenta las validaciones para actualizar el paquete.
    }

    @GetMapping("/envios")
    public List<Envio> filtrarEnvios(@RequestParam String estadoEnvio, @RequestParam int cedulaEmpleado){
        //tener en cuenta las validaciones.
        return new ArrayList<>();
    }

}
