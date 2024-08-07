package com.brandonsoberanis.webapp.biblioteca.repository;

import org.springframework.data.jpa.respository.JpaRepository;
import org.brandonsoberanis.webapp.biblioteca.model.Libro;

public interface LibroRepocitory extends JpaRepository<Libro, long>{

}
