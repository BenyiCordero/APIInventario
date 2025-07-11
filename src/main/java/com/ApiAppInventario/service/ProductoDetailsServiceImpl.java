package com.ApiAppInventario.service;

import com.ApiAppInventario.dto.ProductoDetailsDTO;
import com.ApiAppInventario.dto.ProductoDetailsUpdateDTO;
import com.ApiAppInventario.model.Inventario;
import com.ApiAppInventario.model.Producto;
import com.ApiAppInventario.model.ProductoDetails;
import com.ApiAppInventario.repository.InventarioRepository;
import com.ApiAppInventario.repository.ProductoDetailsRepository;
import com.ApiAppInventario.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoDetailsServiceImpl implements ProductoDetailsService {

    private final ProductoDetailsRepository productoDetailsRepository;
    private final InventarioService inventarioService ;
    private final ProductoService productoService;

    public ProductoDetailsServiceImpl(ProductoDetailsRepository productoDetailsRepository, InventarioRepository inventarioRepository, ProductoRepository productoRepository, InventarioService inventarioService, ProductoService productoService) {
        this.productoDetailsRepository = productoDetailsRepository;
        this.inventarioService = inventarioService;
        this.productoService = productoService;
    }

    @Override
    public void crearProductoDetails(ProductoDetailsDTO productoDetailsDTO) {
        Producto producto = productoService.findProductoById(productoDetailsDTO.id_producto());
        Inventario inventario = inventarioService.findInventarioById(productoDetailsDTO.id_inventario());

        ProductoDetails productoDetails = new ProductoDetails();
        productoDetails.setProducto(producto);
        productoDetails.setInventario(inventario);
        productoDetails.setCantidad(productoDetailsDTO.cantidad());
        productoDetails.setFecha_venc(productoDetailsDTO.fecha_venc());

        productoDetailsRepository.save(productoDetails);
    }

    @Override
    public void deleteProductoDetails(Long id) {
        productoDetailsRepository.deleteById(id);
    }

    @Override
    public void updateProductoDetails(Long id, ProductoDetailsUpdateDTO productoDetailsUpdateDTO) {
        ProductoDetails productoDetails = productoDetailsRepository.findById(id).orElseThrow();

        productoDetails.setCantidad(productoDetailsUpdateDTO.cantidad());
        productoDetails.setFecha_venc(productoDetailsUpdateDTO.fecha_venc());
        productoDetails.setProducto(productoService.findProductoById(productoDetailsUpdateDTO.id_producto()));
        productoDetailsRepository.save(productoDetails);

    }

    @Override
    public List<ProductoDetails> findAllProductoDetails() {
        return productoDetailsRepository.findAll();
    }

    @Override
    public ProductoDetails findProductoDetailsById(Long id) {
        return productoDetailsRepository.findById(id).orElseThrow();
    }
}
