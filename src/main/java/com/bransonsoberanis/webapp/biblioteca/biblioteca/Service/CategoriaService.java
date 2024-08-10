package com.bransonsoberanis.webapp.biblioteca.biblioteca.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bransonsoberanis.webapp.biblioteca.Model.Categoria;
import com.bransonsoberanis.webapp.biblioteca.Repository.CategoriaRepository;

@Service
public class CategoriaService implements ICategoriaService{

    @Autowired
    CategoriaRepository categoriaRepository;

    @Override
    public Categoria buscarCategoriaPorId(Long id) {
        return categoriaRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminarCategoria(Categoria categoria) {
    }

    @Override
    public Categoria guardarCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public List<Categoria> listarCategoria() {

        return categoriaRepository.findAll();
    }
    
}
