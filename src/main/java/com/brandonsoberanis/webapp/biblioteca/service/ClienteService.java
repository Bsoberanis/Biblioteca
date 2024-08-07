import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brandonsoberanis.webapp.biblioteca.model.Categoria;
import com.brandonsoberanis.webapp.biblioteca.repository.CategoriaRepository;



import org.springframework.stereotype.Service;


@Service
public class ClienteService implements ICategoriaService{

    @Autowired
    CategoriaRepository categoriaRepository;

    @Override
    public List<Categoria> listaCategorias() {
        return categoriaRepository.findAll();
    }

    @Override
    public void guardarCategoria(Categoria categoria) {
        categoriaRepository.save(categoria);
    }

    @Override
    public Categoria buscarCategoriaPorId(Long id) {
        return categoriaRepository.findById(id).orElse(null);

    }

    @Override
    public void eliminarCategoria(Categoria categoria) {
        categoriaRepository.delete (categoria);
    }
    
}