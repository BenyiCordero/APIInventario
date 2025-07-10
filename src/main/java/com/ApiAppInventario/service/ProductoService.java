package com.ApiAppInventario.service;

import com.ApiAppInventario.model.Producto;

import java.util.List;

public interface ProductoService {

    void crearProducto(Producto producto);
    void deleteProducto(Producto producto);
    void updateProducto(Long id,Producto producto);
    List<Producto> findAllProductos();
    Producto findProductoById(Long id);

}
