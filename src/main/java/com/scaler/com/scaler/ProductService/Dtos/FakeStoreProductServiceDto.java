package com.scaler.com.scaler.ProductService.Dtos;

import com.scaler.com.scaler.ProductService.Models.Category;
import com.scaler.com.scaler.ProductService.Models.Product;

import lombok.Getter;
import lombok.Setter;
// Let's try without Lombok first to isolate the issue
@Getter
@Setter
public class FakeStoreProductServiceDto {
    private Long id;
    private String title;
    private String description;
    private double price;  // Changed to primitive double
    private String image;
    private String category;




    public Product toProduct() {
        Product product = new Product();
        Category productCategory = new Category();

        product.setId(getId());
        product.setTitle(getTitle());
        product.setDescription(getDescription());
        product.setPrice(getPrice());
        product.setImageUrl(getImage());

        productCategory.setName(getCategory());
        product.setCategory(productCategory);

        return product;
    }
}