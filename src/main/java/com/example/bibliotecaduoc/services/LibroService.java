package com.example.bibliotecaduoc.services;
import com.example.bibliotecaduoc.model.Libro;  
import com.example.bibliotecaduoc.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    // Método para obtener todos los libros
    public List<Libro> getLibros() {
        return libroRepository.obtenerLibros();
    }

    // Método para buscar un libro por su id
    public Libro buscarPorId(int id) {
        return libroRepository.buscarPorId(id);
    }

    // Método para buscar un libro por su ISBN
    public Libro buscarPorIsbn(String isbn) {
        return libroRepository.buscarPorIsbn(isbn);
    }

    // Método para guardar un nuevo libro
    public Libro guardar(Libro lib) {
        return libroRepository.guardar(lib);
    }
}