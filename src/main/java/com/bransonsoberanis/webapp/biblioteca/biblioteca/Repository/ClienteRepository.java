package com.bransonsoberanis.webapp.biblioteca.biblioteca.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bransonsoberanis.webapp.biblioteca.Model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
