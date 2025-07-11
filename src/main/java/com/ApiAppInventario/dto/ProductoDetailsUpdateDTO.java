package com.ApiAppInventario.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public record ProductoDetailsUpdateDTO(
        @JsonFormat(pattern = "yyyy-MM-dd") Date fecha_venc,
        Integer cantidad,
        Long id_producto
) {
}
