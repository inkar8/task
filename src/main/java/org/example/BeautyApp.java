package com.beauty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.beauty.config.AppConfig;
import com.beauty.services.BeautyService;

public class BeautyApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        BeautyService beautyService = context.getBean(BeautyService.class);
        beautyService.displayProducts();
    }
}
