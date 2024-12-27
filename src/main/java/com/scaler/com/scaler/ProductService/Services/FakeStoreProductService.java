package com.scaler.com.scaler.ProductService.Services;

import com.scaler.com.scaler.ProductService.Dtos.CreateProductDto;
import com.scaler.com.scaler.ProductService.Dtos.FakeStoreProductServiceDto;
import com.scaler.com.scaler.ProductService.Models.Category;
import com.scaler.com.scaler.ProductService.Models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FakeStoreProductService implements ProductService {
    private final RestTemplate restTemplate;

    public FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Product getProductDetails(Long id) {
        FakeStoreProductServiceDto response =
                restTemplate.getForObject("https://fakestoreapi.com/products/" + id, FakeStoreProductServiceDto.class);

        if (response == null) {
            throw new RuntimeException("Product not found for id: " + id);
        }


        return response.toProduct();


    }


    @Override
    public Product createProduct(String productName, String productDescription, Double productPrice, String productImage, String productCategory, String productTitle) {

        // Create DTO for the request
        CreateProductDto createProductDto = new CreateProductDto();
        createProductDto.setProductName(productName);
        createProductDto.setDescription(productDescription);
        createProductDto.setPrice(productPrice);
        createProductDto.setImageUrl(productImage);
        createProductDto.setCategory(productCategory);
        createProductDto.setTitle(productTitle);

        // Make POST request
        FakeStoreProductServiceDto response =
                restTemplate.postForObject(
                        "https://fakestoreapi.com/products",
                        createProductDto,
                        FakeStoreProductServiceDto.class
                );

        if (response == null) {
            throw new RuntimeException("Failed to create product");
        }

        // Log success or handle the response further as needed
        System.out.println("Product created successfully: " + response);

        return response.toProduct();


    }

}

