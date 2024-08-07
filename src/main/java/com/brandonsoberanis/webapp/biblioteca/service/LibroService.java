package main.java.com.brandonsoberanis.webapp.biblioteca.service;

import java.util.List;

import com.brandonsoberanis.webapp.biblioteca.repository.CategoriaRepository;
import com.brandonsoberanis.webapp.biblioteca.service.ICategoriaService;

public class LibroService implements ILibroService {


    @Service
        public class CategoriaService implements ICategoriaService{

    @Autowired
    CategoriaRepository categoriaRepository;

     @Override
     public List<Categoria> listaLibros() {
         return LibroRepository.findAll();
        }

        @Override
        public void guardarLibro(Categoria categoria) {
            LibroRepository.save(categoria);
        }

        @Override
        public Categoria buscarLibroPorId(Long id) {
            return LibroRepository.findById(id).orElse(null);

        }

        @Override
        public void eliminarLibro(Categoria categoria) {
            LibroRepository.delete (Libro);
        }
    
    }
}
