package com.bransonsoberanis.webapp.biblioteca.biblioteca.Service;

import java.util.List;

import com.bransonsoberanis.webapp.biblioteca.Model.Empleado;

public interface IEmpleadoService {
    
    public List<Empleado> listarEmpleados();

    public Empleado guardarEmpleado(Empleado empleado);

    public Empleado buscarEmpleadoPorId(Long nit);

    public void eliminarEmpleado(Empleado empleado);    
}
