package com.bransonsoberanis.webapp.biblioteca.biblioteca.Service;

import java.util.List;

import com.bransonsoberanis.webapp.biblioteca.Model.Cliente;

public interface IClienteService {
    public List<Cliente> listarCliente();

    public Cliente guardarCliente(Cliente cliente);

    public Cliente buscarClientePorId(Long nit);

    public void eliminarCliente(Cliente cliente);
}
