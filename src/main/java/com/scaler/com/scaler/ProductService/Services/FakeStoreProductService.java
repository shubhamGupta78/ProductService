package com.scaler.com.scaler.ProductService.Services;

import com.scaler.com.scaler.ProductService.Models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FakeStoreProductService implements ProductService
{
    private RestTemplate restTemplate;
    public FakeStoreProductService(RestTemplate restTemplate)
    {
        this.restTemplate = restTemplate;
    }
    @Override
    public Product getProductDetails(Long Id) {
        return null;
    }
}
