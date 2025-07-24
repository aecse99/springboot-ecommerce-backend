package com.raju.Ecom_proj.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raju.Ecom_proj.Model.Product;
import com.raju.Ecom_proj.repo.ProductRepo;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public List<Product> getAllProducts(){
        
        return repo.findAll();
    }

    public Product getProductById(int id) {
        
        return repo.findById(id).orElse(null);
    }

    public Product addProduct(Product product) {

        return repo.save(product);
    }

    public Product updateProduct(int productId, Product product1) {

        return repo.save(product1);
    }

    public void deleteProduct(int productId) {
        
            repo.deleteById(productId);
    }

    public List<Product> searchProduct(String keyword) {
        return repo.searchProduct(keyword);
    }

    
}
