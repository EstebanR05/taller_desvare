package com.taller.desvare.controller;

import com.taller.desvare.Model.ProductModel;
import com.taller.desvare.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping()
    public ArrayList<ProductModel> getProduct() {
        return productService.getProduct();
    }

    @PostMapping()
    public ProductModel postProduct(@RequestBody ProductModel product) {
        return productService.postProduct(product);
    }

    @PutMapping()
    public ProductModel putProduct(@RequestBody ProductModel product){
        return productService.putProduct(product);
    }

    @GetMapping(path = "/{{id}}")
    public Optional<ProductModel> getProductById(@PathVariable("id") Integer id) {
        return productService.getById(id);
    }

    @GetMapping(path = "/{{id}}")
    public Boolean deleteProduct(@PathVariable("id") Integer id){
        return productService.deleteProduct(id);
    }
}
