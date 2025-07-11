package com.ApiAppInventario.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Inventario")
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_inventario;
    @CreationTimestamp
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha")
    private Date fecha;
    @Column(name = "titulo")
    private String titulo;

}
