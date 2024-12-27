package com.scaler.com.scaler.ProductService.Dtos;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CreateProductDto {

   private String productName;
    private String title;
   private String description;
    private Double price;
    private String imageUrl;
    private String category;

}
