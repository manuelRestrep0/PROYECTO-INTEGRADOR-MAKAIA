package com.manuel.proyectointegrador.controller;

import com.manuel.proyectointegrador.service.ClienteService;
import com.manuel.proyectointegrador.usuario.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class ClienteController {
    ClienteService clienteService;
    @Autowired
    public void ClienteController(ClienteService clienteService){
        this.clienteService = clienteService;
    }

    @PostMapping("/clientes")
    public void crearCliente(@RequestBody Cliente cliente){

    }

    @PatchMapping("/clientes")
    public void actualizarCliente(@RequestBody Cliente cliente){

    }

    @DeleteMapping("/clientes/{cedula}")
    public String eliminarCliente(@PathVariable("cedula") int cedula){
        return "Se elimino correctamente";
    }

    @GetMapping("/clientes/{cedula}")
    public Cliente obtenerCliente(@PathVariable("cedula") int cedula){
        return new Cliente();
    }

}
