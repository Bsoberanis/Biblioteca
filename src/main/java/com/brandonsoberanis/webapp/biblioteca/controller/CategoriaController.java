package com.brandonsoberanis.webapp.biblioteca.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brandonsoberanis.webapp.biblioteca.model.Categoria;
import com.brandonsoberanis.webapp.biblioteca.service.CategoriaService;

@Controller 
@RestController 
@RequestMapping("")
public class CategoriaController {

    @Autowired
    CategoriaService categoriaService;

    @GetMapping("/categorias")
    public List<Categoria> listaCategorias(){
        return categoriaService.listaCategorias();
    }

    @GetMapping("/categoria")
    public ResponseEntity<Categoria> buscarCategoriaPorId(@RequestParam long id){
            try{
                Categoria categoria = categoriaService.buscarCategoriaPorId(id);
                return ResponseEntity.ok(categoria);

            }catch(Exception e){
                return ResponseEntity.badRequest().body(null);
            }
    }

    @PostMapping("/categoria")
    public ResponseEntity<Map<String, String>> agregarCategoria(@RequestBody Categoria categoria){
        Map<String, String> response = new HashMap<>();
       try{
            categoriaService.guardarCategoria(categoria);
            response.put("message", "Categoria creada con exito");
            return ResponseEntity.ok(response);
       }catch (Exception e){
            response.put("message!", "Error");
            response.put("error", "Hubo un error al crear la categoria");
            return ResponseEntity.badRequest().body(response);
       }
    }

    
    @PutMapping("/categoria")
    public ResponseEntity<Map<String, String >> editarCategoria(@RequestParam long id , @RequestBody Categoria categoriaNueva){
        Map<String, String> reponse = new HashMap<>();

        try{
            Categoria categoria = categoriaService.buscarCategoriaPorId(id);
            categoria.setNombreCategoria(categoriaNueva.getNombreCategoria());
            categoriaService.guardarCategoria(categoria);
            reponse.put("message", "la categoria se ha modificado con éxito.");
            return ResponseEntity.ok(reponse);
        }catch(Exception e){
            reponse.put("message", "Error");
            reponse.put("error", "Hubo un error al intentar modificar la categoria");
            return ResponseEntity.badRequest().body(reponse);
            
        }
            
        
            

    }
        
    


    @DeleteMapping("/categoria")
    public ResponseEntity<Map<String , String>> eliminarCategoria(@RequestParam long id){
        Map<String, String> response = new HashMap<>();
        try{
            Categoria categoria = categoriaService.buscarCategoriaPorId(id);
            categoriaService.eliminarCategoria(categoria);
            response.put("message", "la categoria se ha eliminado con éxito");
            return ResponseEntity.ok(response);
        }catch(Exception e){
            response.put("message", "Error");
            response.put("err", "la categoria no se ha eliminado con éxito.");
            return ResponseEntity.badRequest().body(response);
        }
        

    
    }

    

}



