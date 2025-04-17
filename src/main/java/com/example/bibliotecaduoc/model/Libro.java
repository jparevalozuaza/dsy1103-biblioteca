package com.example.bibliotecaduoc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Genera getters, setters, toString, equals, hashCode y un constructor con los campos requeridos
@AllArgsConstructor // Genera un constructor con todos los campos
@NoArgsConstructor  // Genera un constructor vacío
public class Libro {
    
    private int id;
    private String isbn;    
    private String titulo;
    private String editorial;
    private int fechaPublicacion;
    private String autor;

    public Libro(int id, String isbn, String titulo, String editorial, int fechaPublicacion, String autor) {
        this.id = id;
        this.isbn = isbn;
        this.titulo = titulo;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor; 
    }

public Libro() {
    // Constructor vacío

}