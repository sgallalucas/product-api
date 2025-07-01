package com.sgallalucas.produtosapi.controller;

import com.sgallalucas.produtosapi.model.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @PostMapping
    public void saveProduct(@RequestBody Product product) {
        System.out.println(product);
    }

}
