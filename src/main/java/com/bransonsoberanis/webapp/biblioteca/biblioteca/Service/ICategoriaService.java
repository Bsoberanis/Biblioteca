package com.bransonsoberanis.webapp.biblioteca.biblioteca.Service;

import java.util.List;

import com.bransonsoberanis.webapp.biblioteca.Model.Categoria;

public interface ICategoriaService {

    public List<Categoria> listarCategoria();

    public Categoria guardarCategoria(Categoria categoria);

    public Categoria buscarCategoriaPorId(Long id);

    public void eliminarCategoria(Categoria categoria);
}
