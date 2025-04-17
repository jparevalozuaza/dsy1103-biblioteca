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






    public void addLibro(Libro libro) {
        libros.add(libro);
    }

    public void removeLibro(int id) {
        libros.removeIf(libro -> libro.getId() == id);
    }

    public void updateLibro(int id, Libro libroActualizado) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getId() == id) {
                libros.set(i, libroActualizado);
                break;
            }
        }
    }
}