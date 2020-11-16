package com.example.Product.Model;

public class Product {
    private int id;
    private String name;
    private String price;
    private String url;
    public String orderId;
    private static int idStatic = 0;

    public Product() {
    }

    public Product(String name, String price, String url,String orderId) {

        this.name = name;
        this.price = price;
        this.url = url;
        id = ++idStatic;
        this.orderId = orderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getIdStatic() {
        return idStatic;
    }

    public static void setIdStatic(int idStatic) {
        Product.idStatic = idStatic;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

}
