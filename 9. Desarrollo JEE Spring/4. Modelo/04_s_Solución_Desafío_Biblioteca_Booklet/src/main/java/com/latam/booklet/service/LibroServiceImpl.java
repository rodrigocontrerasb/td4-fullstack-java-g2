package com.latam.booklet.service;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.latam.booklet.dao.LibroDAO;
import com.latam.booklet.modelo.Libro;
import com.latam.booklet.vo.LibroVO;

@Service
public class LibroServiceImpl implements LibroService {

    @Autowired
    LibroDAO dao;

    LibroVO respuesta;

    @Override
    public LibroVO findAll() {
        respuesta = new LibroVO(new ArrayList<Libro>(), "Ha ocurrido un error", "101" );
        try {
            respuesta.setLibros(new ArrayList<>(dao.findAll()));
            respuesta.setMensaje(String.format("Se ha/n encontrado %d registro/s", respuesta.getLibros().size()));
            respuesta.setCodigo("0");
        } catch (Exception e) {
            System.err.print(e);
        }
        return respuesta;
    }

    @Override
    public LibroVO findById(Integer idLibro) {
        respuesta = new LibroVO(new ArrayList<Libro>(), "Ha ocurrido un error", "102" );
        try {

            respuesta.setLibros(new ArrayList<>());
            respuesta.getLibros().add(dao.findById(idLibro));
            respuesta.setMensaje(String.format("Se ha/n encontrado %d registro/s", respuesta.getLibros().size()));
            respuesta.setCodigo("0");
        } catch (Exception e) {
            System.err.print(e);
        }
        return respuesta;
    }



    @Override
    public LibroVO add(Libro usuario) {
        respuesta = new LibroVO(new ArrayList<Libro>(), "Ha ocurrido un error", "103" );
        try {
            int registrosActualizados = dao.add(usuario);
            respuesta.setMensaje(registrosActualizados == 1 ? "Se ha creado el libro correctamente" : "No se ha podido crear el libro");
            respuesta.setCodigo(registrosActualizados == 1 ? "0" : "104");
        } catch (Exception e) {
            System.err.print(e);
        }
        return respuesta;
    }

    @Override
    public LibroVO update(Libro libro) {
        respuesta = new LibroVO(new ArrayList<Libro>(), "Ha ocurrido un error", "104" );
        try {
            int registrosActualizados = dao.update(libro);
            respuesta.setMensaje(String.format("Se ha/n actualizado correctamente %d libro/s", registrosActualizados));
            respuesta.setCodigo("0");
        } catch (Exception e) {
            System.err.print(e);
        }
        return respuesta;
    }

    @Override
    public LibroVO delete(Libro libro) {
        respuesta = new LibroVO(new ArrayList<Libro>(), "Ha ocurrido un error", "105" );
        try {
            int registrosActualizados = dao.delete(libro);
            respuesta.setMensaje(String.format("Se ha eliminado correctamente el libro", registrosActualizados));
            respuesta.setCodigo("0");
        } catch (Exception e) {
            System.err.print(e);
        }
        return respuesta;
    }


    @Override
    public LibroVO changeAvailability(Integer idLibro) {
        respuesta = new LibroVO(new ArrayList<Libro>(), "Ha ocurrido un error", "106" );
        try {
            respuesta.setLibros(new ArrayList<>());
            Libro libro = dao.findById(idLibro);
            libro.setDisponibilidad(libro.getDisponibilidad() == 1 ? 0 : 1);
            dao.update(libro);
            respuesta.setMensaje(String.format("Se ha cambiado la disponibilidad correctamente"));
            respuesta.setCodigo("0");
        } catch (Exception e) {
            System.err.print(e);
        }
        return respuesta;
    }

    @Override
    public LibroVO findByTituloOrAutor(String textoBuscado) {
        respuesta = new LibroVO(new ArrayList<Libro>(), "Ha ocurrido un error", "107" );
        try {
            respuesta.setLibros(new ArrayList<>(dao.findByTituloOrAutor(textoBuscado)));
            respuesta.setMensaje(String.format("Se ha/n encontrado %d registro/s", respuesta.getLibros().size()));
            respuesta.setCodigo("0");
        } catch (Exception e) {
            System.err.print(e);
        }
        return respuesta;
    }

}