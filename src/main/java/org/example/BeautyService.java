package com.beauty.services;

import org.springframework.stereotype.Component;
import com.beauty.models.BeautyProduct;

import java.util.List;

@Component
public class BeautyService {
    private final List<BeautyProduct> beautyProducts;

    public BeautyService(List<BeautyProduct> beautyProducts) {
        this.beautyProducts = beautyProducts;
    }

    public void displayProducts() {
        System.out.println("Available Beauty Products:");
        for (BeautyProduct product : beautyProducts) {
            System.out.println("- " + product.getName() + ": " + product.getDescription());
        }
    }
}
