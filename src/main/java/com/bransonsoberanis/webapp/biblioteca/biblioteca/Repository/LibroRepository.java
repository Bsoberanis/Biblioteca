package com.bransonsoberanis.webapp.biblioteca.biblioteca.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bransonsoberanis.webapp.biblioteca.Model.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long>{

}
