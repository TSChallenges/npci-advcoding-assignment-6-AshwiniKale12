package com.mystore.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.mystore.app")
public class AppConfig {
    
    @Bean
    public Product tumbler(Barcode barcode) {
        Product p = new Product(barcode);
        p.setId(1);
        p.setName("Tumbler");
        p.setBarcode();
        return p;
    }
    
    @Bean
    public Product bucket(Barcode barcode) {
        Product p = new Product(barcode);
        p.setId(2);
        p.setName("Bucket");
        p.setBarcode();
        return p;
    }
}
