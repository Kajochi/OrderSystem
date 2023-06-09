package org.example;


import Products.Product;
import Products.ProductRepo;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("01", "Wecker");
        Product product2 = new Product("02", "Mauspad");
        Product product3 = new Product("03", "Maus");
        Product product4 = new Product("04", "USB-C Adapter");

        ProductRepo productRepo = new ProductRepo();

        productRepo.addProduct(product1);
        productRepo.addProduct(product2);
        productRepo.addProduct(product3);
        productRepo.addProduct(product4);

        System.out.println(productRepo.list());
        System.out.println(productRepo.getProduct("01"));

    }
}