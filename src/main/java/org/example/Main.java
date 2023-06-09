package org.example;


import Orders.Order;
import Orders.OrderRepo;
import Products.Product;
import Products.ProductRepo;
import Shop.ShopService;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("01", "Wecker");
        Product product2 = new Product("02", "Mauspad");
        Product product3 = new Product("03", "Maus");
        Product product4 = new Product("04", "USB-C Adapter");
        Product product = new Product("01", "Kopfschmerztabletten");


        ProductRepo productRepo = new ProductRepo();
       productRepo.addProduct(product1);
        productRepo.addProduct(product2);
        productRepo.addProduct(product3);
        productRepo.addProduct(product4);
        productRepo.addProduct(product);


       ShopService shopService = new ShopService(productRepo, new OrderRepo());



        System.out.println(shopService.getProduct("01"));



        shopService.addOrder(new Order("01", product2 ));
        shopService.addOrder(new Order("02", product3 ));
        shopService.addOrder(new Order("03", product2 ));

        System.out.println(shopService.getOrder("02"));

    }
}