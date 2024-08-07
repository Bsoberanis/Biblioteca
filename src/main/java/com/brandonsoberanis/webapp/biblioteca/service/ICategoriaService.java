package com.brandonsoberanis.webapp.biblioteca.service;

import java.util.List;


import com.brandonsoberanis.webapp.biblioteca.model.Categoria;

public interface ICategoriaService {

    public List<Categoria> listaCategorias();

    public void guardarCategoria(Categoria categoria);

    public Categoria buscarCategoriaPorId(Long id);

    public void eliminarCategoria(Categoria categoria);

}



