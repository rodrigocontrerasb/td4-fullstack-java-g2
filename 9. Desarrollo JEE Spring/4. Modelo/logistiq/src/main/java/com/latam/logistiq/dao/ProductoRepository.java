package com.latam.logistiq.dao;

import java.util.List;

import com.latam.logistiq.modelo.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductoRepository extends CrudRepository<Producto, Integer>, PagingAndSortingRepository<Producto, Integer>  {

    @Query(value = "select * from Producto p where p.nombre like %?1%",
            countQuery = "SELECT count(*) FROM Producto WHERE nombre like %?1%",
            nativeQuery = true)
    public Page<Producto> findAllByNombre(String nombre, Pageable pageable);
    
}