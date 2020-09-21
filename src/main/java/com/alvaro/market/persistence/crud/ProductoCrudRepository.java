package com.alvaro.market.persistence.crud;

import com.alvaro.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    //Con sql
    /*@Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)*/

    //Con query methods
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int CantidadStock, boolean estado);

}
