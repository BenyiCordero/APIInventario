package com.ApiAppInventario.service;

import com.ApiAppInventario.model.Inventario;

import java.util.List;

public interface InventarioService {

    void crearInventario(Inventario inventario);
    void deleteInventario(Long id);
    void updateInventario(Long id, Inventario inventario);
    List<Inventario> findAllInventario();
    Inventario findInventarioById(Long id);

}
