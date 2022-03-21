package com.Jpa.dataLayer.repository;

import com.Jpa.dataLayer.model.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

    public Iterable<Product>findByName(String name);

    public Iterable<Product>findByCategoriesName(String name);

    @Query("FROM Product WHERE name = ?1")
    public Iterable<Product> findByNameJPQL(String name);

    @Query(value = "SELECT * FROM produit WHERE cout = :cout", nativeQuery = true)
    public Iterable<Product> findByCostNative(@Param("cout") Integer cost);

    /* La recherche des produits : dont le coût est inférieur à 1 000 €.*/
    @Query("SELECT * FROM produit WHERE cout < 1000 :cout")
    public Iterable<Product>findByCostLower(@Param("cout") Integer cost);
}
