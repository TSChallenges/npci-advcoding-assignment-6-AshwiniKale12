package com.mystore.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Product p1 = context.getBean("tumbler", Product.class);
        System.out.println(p1);

        Product p2 = context.getBean("bucket", Product.class);
        System.out.println(p2);
    }
}
