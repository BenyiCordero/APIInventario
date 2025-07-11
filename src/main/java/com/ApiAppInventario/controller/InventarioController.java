package com.ApiAppInventario.controller;

import com.ApiAppInventario.model.Inventario;
import com.ApiAppInventario.repository.InventarioRepository;
import com.ApiAppInventario.service.InventarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventario")
public class InventarioController {

    private final InventarioService inventarioService;

    public InventarioController(InventarioService inventarioService) {
        this.inventarioService = inventarioService;
    }

    @PostMapping
    public ResponseEntity<?> crearInventario(@RequestBody Inventario inventario) {
        inventarioService.crearInventario(inventario);
        return  ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<?> deleteInventario(@PathVariable Long id){
        inventarioService.deleteInventario(id);
        return  ResponseEntity.status(HttpStatus.OK).build();
    }

    @PutMapping ("/{id}")
    public ResponseEntity<?> updateInventario(@PathVariable Long id, @RequestBody Inventario inventario){
        inventarioService.updateInventario(id, inventario);
        return  ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping
    public ResponseEntity<?> findAllInventario(){
        return  ResponseEntity.status(HttpStatus.OK).body(inventarioService.findAllInventario());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findInventarioById(@PathVariable Long id){
        return  ResponseEntity.status(HttpStatus.OK).body(inventarioService.findInventarioById(id));
    }

}
