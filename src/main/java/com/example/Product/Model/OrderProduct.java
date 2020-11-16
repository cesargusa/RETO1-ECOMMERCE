package com.example.Product.Model;


public class OrderProduct {
    private int cantidad;
    private int orderId;
    private int productId;

    public OrderProduct() {
    }

    public OrderProduct(int cantidad, int orderId, int productId) {

        this.cantidad = cantidad;
        this.orderId = orderId;
        this.productId = productId;
     
       
    }
    


   
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

 
    
   

}
