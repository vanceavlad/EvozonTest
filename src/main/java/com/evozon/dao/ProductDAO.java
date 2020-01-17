package com.evozon.dao;

import com.evozon.model.Product;

import java.util.List;

public interface ProductDAO {

    /*
     * Retrieves a product from the DB based on the id
     */
    Product getById(int id);

    /*
     * Retrieves a product from the DB based on the category code
     */
    Product getByCategory(int id);

    /*
     * Retrieves all the products from the DB
     */
    List<Product> getAll();

    /*
    * Adds a new product to the DB
    */
    Product addProduct(Product product);

}
