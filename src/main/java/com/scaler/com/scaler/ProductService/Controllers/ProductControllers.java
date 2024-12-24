package com.scaler.com.scaler.ProductService.Controllers;

import com.scaler.com.scaler.ProductService.Models.Product;
import com.scaler.com.scaler.ProductService.Services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductControllers {


    private final ProductService productService;

    public ProductControllers(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/products")
    public void getAllProducts() {}

    @GetMapping("/products/{id}")
    public Product getProductDetails(@PathVariable("id") Long id) {

        return productService.getProductDetails(id);
    }

    public void createProduct() {}
}
