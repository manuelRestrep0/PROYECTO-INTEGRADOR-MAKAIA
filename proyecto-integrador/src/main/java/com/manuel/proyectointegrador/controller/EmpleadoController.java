package com.manuel.proyectointegrador.controller;

import com.manuel.proyectointegrador.service.EmpleadoService;
import com.manuel.proyectointegrador.usuario.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/empleados")
public class EmpleadoController {
    EmpleadoService empleadoService;

    @Autowired public void EmpleadoController(EmpleadoService empleadoService){
        this.empleadoService = empleadoService;
    }

    @PostMapping()
    public void crearEmpleado(@RequestBody Empleado empleado){

    }

    @PatchMapping()
    public void actualizarEmpleado(@RequestBody Empleado empleado){

    }

    @DeleteMapping("/{cedula}")
    public String eliminarEmpleado(@PathVariable("cedula") int cedula){
        return "Empleado eliminado";
    }

    @GetMapping("/{cedula}")
    public void obtenerEmpleado(@PathVariable("cedula") int cedula){

    }
}
