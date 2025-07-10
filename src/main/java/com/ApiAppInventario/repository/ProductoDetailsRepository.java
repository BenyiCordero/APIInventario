package com.ApiAppInventario.repository;

import com.ApiAppInventario.model.ProductoDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoDetailsRepository extends JpaRepository<ProductoDetails, Integer> {
}
