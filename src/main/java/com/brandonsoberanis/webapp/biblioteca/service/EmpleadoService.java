package com.brandonsoberanis.webapp.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brandonsoberanis.webapp.biblioteca.model.Empleado;
import com.brandonsoberanis.webapp.biblioteca.repository.EmpleadoRepository;



import org.springframework.stereotype.Service;


@Service
public class EmpleadoService implements IEmpleadoService{

    @Autowired
    EmpleadoRepository empleadoRepository;

    @Override
    public List<Empleado> listaEmpleado() {
        return EmpleadoRepository.findAll();
    }

    @Override
    public void guardarEmpleado(Empleado empleado) {
        empleadoRepository.save(empleado);
    }

    @Override
    public Empleado buscarEmpleadoPorId(Long id) {
        return empleadoRepository.findById(id).orElse(null);

    }

    @Override
    public void eliminarEmpleado(Empleado empleado) {
        empleadoRepository.delete (empleado);
    }
    
}
