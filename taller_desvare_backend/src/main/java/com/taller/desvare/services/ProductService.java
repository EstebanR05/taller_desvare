package com.taller.desvare.services;

import com.taller.desvare.Model.ProductModel;
import com.taller.desvare.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public ArrayList<ProductModel> getProduct() {
        return (ArrayList<ProductModel>) productRepository.findAll();
    }

    public ProductModel postProduct(ProductModel productModel) {
        return productRepository.save(productModel);
    }

    public ProductModel putProduct(ProductModel productModel){
        return null;
    }

    public boolean deleteProduct(Integer id) {
        try {
            productRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }

    public Optional<ProductModel> getById(Integer id) {
        return productRepository.findById(id);
    }
}