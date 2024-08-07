package main.java.com.brandonsoberanis.webapp.biblioteca.service;



import java.util.List;

public interface ILibroService {
    public List<Categoria> listarLibro();
    
    public Categoria buscarLibroId(Long id);
    
    public void guardarLibro(Libro libro);

    public void eliminarLibro(Libro libro);

}
