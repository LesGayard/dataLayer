package com.Jpa.dataLayer.model;

import javax.persistence.*;

@Entity
@Table( name = "categorie")
public class category {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int categoryId;

    @Column (name = "nom")
    private String name;

    public category() {
    }

    public category(int categoryId, String name) {
        this.categoryId = categoryId;
        this.name = name;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}