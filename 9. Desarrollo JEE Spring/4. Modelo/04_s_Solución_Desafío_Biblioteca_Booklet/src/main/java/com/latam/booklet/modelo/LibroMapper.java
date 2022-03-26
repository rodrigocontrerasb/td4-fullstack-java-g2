package com.latam.booklet.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class LibroMapper implements RowMapper<Libro> {

    public Libro mapRow(ResultSet resultSet, int i) throws SQLException {
        Libro libro = new Libro();
        libro.setIdLibro(resultSet.getInt("id_libro"));
        libro.setAnho(resultSet.getInt("anho"));
        libro.setTitulo(resultSet.getString("titulo"));
        libro.setAutor(resultSet.getString("autor"));
        libro.setImprenta(resultSet.getString("imprenta"));
        libro.setDisponibilidad(resultSet.getInt("disponible"));
        return libro;
    }
}