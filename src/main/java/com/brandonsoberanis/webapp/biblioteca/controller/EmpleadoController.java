package com.brandonsoberanis.webapp.biblioteca.controller;

import java.util.List;

import com.brandonsoberanis.webapp.biblioteca.controller.Controller;
import com.brandonsoberanis.webapp.biblioteca.controller.RequestMapping;
import com.brandonsoberanis.webapp.biblioteca.controller.RestController;

import main.java.com.brandonsoberanis.webapp.biblioteca.model.Libro;
import main.java.com.brandonsoberanis.webapp.biblioteca.service.LibroService;

@Controller
@RestController
@RequestMapping("")
public class EmpleadoController {
     @Autowired
    EmpleadoSer EmpleadoService;
    @GetMapping("empleado")
    public ResponseEntity<List<Empleado>>listarEmpleado (){
        try{
            return ResponseEntity.ok(EmpleadoService.listEmpleado());
        }catch(Exception e){
            return ResponseEntity.badRequest().body(null);
        }
    }

}
