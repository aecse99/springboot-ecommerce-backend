package com.raju.Ecom_proj.Controller;

//import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.multipart.MultipartFile;

import com.raju.Ecom_proj.Model.Product;
import com.raju.Ecom_proj.Service.ProductService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts(){

        return new ResponseEntity<>(service.getAllProducts(),HttpStatus.OK);
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> geProductByID(@PathVariable int id){

        Product product=service.getProductById(id);
        if(product!=null){
        return new ResponseEntity<>(product,HttpStatus.OK);
        }
        else
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);        

    }

    @PostMapping("/products")
    public ResponseEntity<?> addProduct(@RequestBody Product product){

        try{

            Product product1= service.addProduct(product);
            return new ResponseEntity<>(product1,HttpStatus.CREATED);
        }
        catch(Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/products/{id}")
    public ResponseEntity<String> updateProduct(@PathVariable("id") int productId,@RequestBody Product product){

        Product product1=service.updateProduct(productId,product);;
        
        if(product1!=null)
        return new ResponseEntity<>("Updated",HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable("id") int id){
        Product product=service.getProductById(id);
        if(product!=null){
            service.deleteProduct(id);
            return new ResponseEntity<>("Deleted",HttpStatus.OK);
        }
        else
        return new ResponseEntity<>("Doesn't exist",HttpStatus.NOT_FOUND);
    }

    @GetMapping("/products/search")
    public ResponseEntity<List<Product>> searchProduct(@RequestParam String keyword){

        List<Product> products=service.searchProduct(keyword);
        return new ResponseEntity<>(products,HttpStatus.OK);
    }

}
