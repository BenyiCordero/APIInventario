package com.ApiAppInventario.service;

import com.ApiAppInventario.model.ProductoDetails;
import com.ApiAppInventario.repository.InventarioRepository;
import com.ApiAppInventario.repository.ProductoDetailsRepository;
import com.ApiAppInventario.repository.ProductoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductoDetailsServiceImpl implements ProductoDetailsService {

    private final ProductoDetailsRepository productoDetailsRepository;
    private final InventarioRepository inventarioRepository;
    private final ProductoRepository productoRepository;

    public ProductoDetailsServiceImpl(ProductoDetailsRepository productoDetailsRepository, InventarioRepository inventarioRepository, ProductoRepository productoRepository) {
        this.productoDetailsRepository = productoDetailsRepository;
        this.inventarioRepository = inventarioRepository;
        this.productoRepository = productoRepository;
    }

    @Override
    public void crearProductoDetails(ProductoDetails productoDetails) {

    }
}
