package com.scaler.com.scaler.ProductService.Controllers;

import com.scaler.com.scaler.ProductService.Dtos.CreateProductDto;
import com.scaler.com.scaler.ProductService.Models.Product;
import com.scaler.com.scaler.ProductService.Services.ProductService;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/products")
    public Product createProduct(@RequestBody CreateProductDto createProductDto) {
        return productService.createProduct(createProductDto.getProductName(), createProductDto.getDescription(), createProductDto.getPrice(), createProductDto.getImageUrl(), createProductDto.getCategory(), createProductDto.getTitle());
    }
}
