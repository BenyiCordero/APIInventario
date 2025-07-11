package com.ApiAppInventario.service;

import com.ApiAppInventario.dto.ProductoDetailsDTO;
import com.ApiAppInventario.dto.ProductoDetailsUpdateDTO;
import com.ApiAppInventario.model.ProductoDetails;

import java.util.List;

public interface ProductoDetailsService {

    void crearProductoDetails(ProductoDetailsDTO productoDetailsDTO);
    void deleteProductoDetails(Long id);
    void updateProductoDetails(Long id, ProductoDetailsUpdateDTO productoDetailsUpdateDTO);
    List<ProductoDetails> findAllProductoDetails();
    ProductoDetails findProductoDetailsById(Long id);

}
