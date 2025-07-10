package com.ApiAppInventario.service;

import com.ApiAppInventario.model.Inventario;
import com.ApiAppInventario.repository.InventarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventarioServiceImpl implements  InventarioService {

    private final InventarioRepository inventarioRepository;

    public InventarioServiceImpl(InventarioRepository inventarioRepository) {
        this.inventarioRepository = inventarioRepository;
    }

    @Override
    public void crearInventario(Inventario inventario) {
        inventarioRepository.save(inventario);
    }

    @Override
    public void deleteInventario(Long id) {
        inventarioRepository.deleteById(id);
    }

    @Override
    public void updateInventario(Long id, Inventario inventario) {
        Inventario i = inventarioRepository.findById(id)
                .orElseThrow();
        i.setFecha(inventario.getFecha());
        i.setTitulo(inventario.getTitulo());
        inventarioRepository.save(i);
    }

    @Override
    public List<Inventario> findAllInventario() {
        return inventarioRepository.findAll();
    }

    @Override
    public Inventario findInventarioById(Long id) {
        return inventarioRepository.findById(id)
                .orElseThrow();
    }
}
