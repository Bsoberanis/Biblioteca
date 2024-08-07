package com.brandonsoberanis.webapp.biblioteca.controller;

import com.brandonsoberanis.webapp.biblioteca.controller.Controller;
import com.brandonsoberanis.webapp.biblioteca.controller.RequestMapping;
import com.brandonsoberanis.webapp.biblioteca.controller.RestController;

@Controller
@RestController
@RequestMapping("")
public class LibroController {
    @Autowired
    LibroService LibroService;
    @GetMapping("/libro")
    public ResponseEntity<List<Libro>>listarLibro (){
        try{
            return ResponseEntity.ok(LibroService.listLibro());
        }catch(Exception e){
            return ResponseEntity.badRequest().body(null);
        }
    }

    @GetMapping("/Libbro")
    public ResponseEntity<Map<String, String>> editarLibro(@RequestParam long id, @RequestBody Libro libro){
        try{
            libro.libro =
            libro.setAutor(libroNuevo.getAutor());
            libro.setCategoria(libroNuevo.getCategoria());
            libro.setCluster(libroNuevo. getCluster());
            libro.setDiponibilida(libroNuevo.getDisponibilida());
            libro.setEditorial(libroNuevo.getEditorial());
            libro.setIsbn(LibroNuevo.getIsbn());
            libro.setNombre(libroNuevo.getNombre());
            libro.setNumeroEstanteria(libroNuevo.getNumeroEstanteria());
            libro.setSinopsis(libroNuevo.getSinopsis());
            libroService.guardarLibro(libro);
            response.put("message", "libro modificado");

        }catch(Exception e){
            response.put("message", "Error");
            response.put("err", "Hubo un error al modificar el libro");
            return ResponseEntity.badRequest().body(response);

        }

    }

    @DeleteMapping("/libro")
    public ResponseEntity<Map<String , String>> eliminarLibro(@RequestParam long id){
        Map<String, String> resopnse = new HashMap<>();
        try{
            Libro libro = libroSevice.buscarLibroPorId(id);
            libroService.eliminarLibro(libro);
            resopnse.put("message", "Libro eliminado con éxito");
            return ResponseEntity.ok(resopnse);
        }catch(Exception e){
            response.put("message" , "Error");
            resopnse.put("err", "Hubo un error al eliminar el libro");
            return ResponseEntity.badRequest().body(resopnse);

        }
    }



    @PostMapping
    public ResponseEntity<Map<String, String>> agregarLibro(@RequestBody Libro libro){
        try{
            libroService.guardarLibro(Libro);
            response.put("message", "Libro creado con éxito");
            return ResponseEntity.ok(response);
        }catch(Exception e){
            response.put("mesaage", "Error");
            response.put("err", "Hubo un error al crear el libro.");
            return ResponseEntity.badRequest().body(response);
        }

}
}