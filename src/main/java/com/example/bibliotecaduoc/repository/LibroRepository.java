package com.example.bibliotecaduoc.repository;

import com.example.bibliotecaduoc.model.Libro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LibroRepository {

    // Arreglo que guardara todos los libros
    private List<Libro> listalibros = new ArrayList<>();

    // Metodo que retorna todos los libros

    public List<Libro> obtenerLibros() {
        return listalibros;
    }

    // Buscar un libro por su id

    public Libro buscarPorId(int id) {
        for (Libro libro : listalibros) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null; // Retorna null si no se encuentra el libro
    }

    // Buscar libro por su isbn
    public Libro buscarPorIsbn(String isbn) {
        for (Libro libro : listalibros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null; // Retorna null si no se encuentra el libro
    }

    public Libro guardar(Libro lib) {
        listalibros.add(lib);
        return lib;
    }

    public Libro actualizar(Libro lib) {
        int id = 0; 
        int idPosicion = 0; // Variable para almacenar la posición del libro a actualizar
            
        for (int i = 0; i < listalibros.size(); i++) {  
            if (listalibros.get(i).getId() == lib.getId()) {
                id = lib.getId();
                idPosicion = i; // Guardamos la posición del libro a actualizar
            }
        }

        Libro libro1 = new Libro();
        libro1.setId(id);
        libro1.setTitulo(lib.getTitulo());
        libro1.setAutor(lib.getAutor());
        libro1.setFechaPublicacion(lib.getFechaPublicacion());        
        libro1.setEditorial(lib.getEditorial());
        libro1.setIsbn(lib.getIsbn());

        
        listalibros.set(idPosicion, libro1); // Actualizamos el libro en la posición encontrada
        return libro1; // Retornamos el libro actualizado
    }

    public void eliminar(int id) {
        // alternativa 1
        Libro libro = buscarPorId(id);
        if (libro != null) {
            listalibros.remove(libro);
        }

        // alternativa 2
        int idPosicion = 0; // Variable para almacenar la posición del libro a eliminar
        for (int i = 0; i < listalibros.size(); i++) {
            if (listalibros.get(i).getId() == id) {
                idPosicion = i; // Guardamos la posición del libro a eliminar
            }
        }

        if (idPosicion > 0) {
            listalibros.remove(idPosicion); // Eliminamos el libro en la posición encontrada
        }

        // otra alternativa
        listalibros.removeIf(x -> x.getId() == id); // Elimina el libro si se encuentra    
    }

}