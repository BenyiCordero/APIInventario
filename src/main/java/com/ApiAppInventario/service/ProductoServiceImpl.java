package com.ApiAppInventario.service;

import com.ApiAppInventario.model.Producto;
import com.ApiAppInventario.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements  ProductoService {

    private final ProductoRepository productoRepository;

    public ProductoServiceImpl(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public void crearProducto(Producto producto) {
        productoRepository.save(producto);
    }

    @Override
    public void deleteProducto(Long id) {
        productoRepository.deleteById(id);
    }

    @Override
    public void updateProducto(Long id, Producto producto) {
            Producto p = productoRepository.findById(id)
                    .orElseThrow();
            p.setDescripcion(producto.getDescripcion());
            p.setGramaje(producto.getGramaje());
            productoRepository.save(p);
    }

    @Override
    public List<Producto> findAllProductos() {
        return productoRepository.findAll();
    }

    @Override
    public Producto findProductoById(Long id) {
        return productoRepository.findById(id).orElseThrow();
    }
}
