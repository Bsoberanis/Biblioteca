package main.java.com.brandonsoberanis.webapp.biblioteca.model;



import java.lang.annotation.Inherited;

import javax.annotation.processing.Generated;

@Entit
@Data
@Table(name = "Libro")

public class Libro {
    @Inherited
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String isbn;
    private String Mombre;
    @Column(columnDefinition = "TEXT")
    private String sinopsis;
    private String autor;
    private String editorial;
    private Boolean disponibilida;
    private String numeroEstanteria;
    private String cluster;
    @ManyToOne
    private Categoria categoria ;

}
