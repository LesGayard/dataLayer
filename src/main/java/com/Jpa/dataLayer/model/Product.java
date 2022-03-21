package com.Jpa.dataLayer.model;

import javax.persistence.*;

@Entity
@Table(name = "produit")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "produit_id")
    private int productId;

    @Column( name = "nom")
    private String name;

    @Column (name = "description")
    private String description;

    @Column (name = "cout")
    private int cost;

    public Product() {
    }

    public Product(int productId, String name, String description, int cost) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
