package com.taller.desvare.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_products")
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer idtbl_products;
    private String name_product;
    private String brand_product;
    private String model_product;
    private String price;
    private String state_pay;
    private String tbl_user_idtbl_user;

    public Integer getIdtbl_products() {
        return idtbl_products;
    }

    public void setIdtbl_products(Integer idtbl_products) {
        this.idtbl_products = idtbl_products;
    }

    public String getName_product() {
        return name_product;
    }

    public void setName_product(String name_product) {
        this.name_product = name_product;
    }

    public String getBrand_product() {
        return brand_product;
    }

    public void setBrand_product(String brand_product) {
        this.brand_product = brand_product;
    }

    public String getModel_product() {
        return model_product;
    }

    public void setModel_product(String model_product) {
        this.model_product = model_product;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getState_pay() {
        return state_pay;
    }

    public void setState_pay(String state_pay) {
        this.state_pay = state_pay;
    }

    public String getTbl_user_idtbl_user() {
        return tbl_user_idtbl_user;
    }

    public void setTbl_user_idtbl_user(String tbl_user_idtbl_user) {
        this.tbl_user_idtbl_user = tbl_user_idtbl_user;
    }
}