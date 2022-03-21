package com.Jpa.dataLayer.repository;

import com.Jpa.dataLayer.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category,Integer> {

    /* La recherche des catégories :
    par le nom de la catégorie ;
    par le nom d’un produit de la catégorie.
    * */
    public Iterable<Category> findByName (String name);
    public Iterable<Category> findProductsName(String name);
}
