package com.bransonsoberanis.webapp.biblioteca.biblioteca.Service;

import java.util.List;

import com.bransonsoberanis.webapp.biblioteca.Model.Libro;

public interface ILibroService {
    public List<Libro> listarLibro();
    
    public Libro buscarLibroPorId(Long id);

    public Libro guardarLibro(Libro libro);

    public void eliminarLibro(Libro libro);
}
