package com.brandonsoberanis.webapp.biblioteca.service;

import java.util.List;


import com.brandonsoberanis.webapp.biblioteca.model.Empleado;


public interface IEmpleadoService {
    public List<Empleado> listarEmpleado();
    
    public Categoria buscarEmpleadoId(Long id);
    
    public void guardarEmpleado(Empleado empleado);

    public void eliminarEmpleado(Empleado empleado);

}
