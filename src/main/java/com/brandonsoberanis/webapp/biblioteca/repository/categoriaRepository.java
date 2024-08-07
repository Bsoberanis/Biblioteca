package com.brandonsoberanis.webapp.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brandonsoberanis.webapp.biblioteca.model.categoria;

public interface CategoriaRepository extends JpaRepository<categoria,long>{
    
}



