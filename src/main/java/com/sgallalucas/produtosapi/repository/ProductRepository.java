package com.sgallalucas.produtosapi.repository;

import com.sgallalucas.produtosapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
