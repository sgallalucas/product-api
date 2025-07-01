package com.sgallalucas.produtosapi.controller;

import com.sgallalucas.produtosapi.model.Product;
import com.sgallalucas.produtosapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public Product saveProduct(@RequestBody Product product) {
        String id = UUID.randomUUID().toString();
        product.setId(id);
        productRepository.save(product);
        return product;
    }

    @GetMapping(value = "/{id}")
    public Product findProduct(@PathVariable String id) {
       return productRepository.findById(id).orElse(null);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteProduct(@PathVariable String id) {
        productRepository.deleteById(id);
    }

    @PutMapping(value = "/{id}")
    public void updateProduct(@PathVariable String id, @RequestBody Product product) {
        product.setId(id);
        productRepository.save(product);
    }

    @GetMapping
    public List<Product> find(@RequestParam(value = "name", defaultValue = "") String name){
        return productRepository.findByName(name);
    }

}
