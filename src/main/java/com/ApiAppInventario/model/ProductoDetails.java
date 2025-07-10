package com.ApiAppInventario.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ProductoDetails")
public class ProductoDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_productoDetails;
    @Column(name = "fecha_venc")
    private Date fecha_venc;
    @Column(name = "cantidad")
    private Integer cantidad;
    @ManyToOne
    private Inventario inventario;
    @ManyToOne
    private Producto producto;

}
