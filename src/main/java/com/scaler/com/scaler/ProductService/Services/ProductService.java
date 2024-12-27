package com.scaler.com.scaler.ProductService.Services;

import com.scaler.com.scaler.ProductService.Models.Product;

public interface ProductService  {

    public Product getProductDetails(Long Id);


    public  Product createProduct(String productName, String productDescription, Double productPrice,String productImage,String productCategory,String productTitle);
}
