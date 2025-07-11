package com.ApiAppInventario.service;

import com.ApiAppInventario.model.Producto;

import java.util.List;

public interface ProductoService {

    void crearProducto(Producto producto);
    void deleteProducto(Long id);
    void updateProducto(Long id,Producto producto);
    List<Producto> findAllProductos();
    Producto findProductoById(Long id);

}
