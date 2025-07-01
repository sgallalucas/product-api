package com.sgallalucas.produtosapi.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Product {

    private String id;
    private String name;
    private String description;
    private Double price;

    public Product() {
    }

    public Product(String id, String name, String description, Double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
