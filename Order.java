/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommercesystem;
//import ecommercesystem.Cart; why usless

public class Order {
private int customerId = 23011170;
private int orderId;
private Product products [];
private double totalPrice ;
private int nproducts ;


/*public Order(int customerId,int nproducts, int orderId, Product[] products) {
   |// Cart cart =new Cart(customerId,nproducts);
       setCustomerId( cart.getCustomerId());
       setOrderId(this.orderId );
       setProducts(cart.getProducts());
       setTotalPrice(cart.calculatePrice());}*/


    public Order(int customerId, int orderId, Product[] products, double totalPrice) {
        this.customerId = customerId;
        this.orderId = orderId;
        this.products = products;
        this.totalPrice = totalPrice;
    }

    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }

    public void setOrderId(int orderId) {
        this.orderId =Math.abs(orderId);
    }
    public void setProducts(Product[] products) {
        this.products = products;
    }
    public int getCustomerId() {
        return customerId;
    }
    public int getOrderId() {
        return orderId;
    }
    public Product[] getProducts() {
        return products;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    public double getTotalPrice() {
        return totalPrice;
    }   
    public void printOrderInfo() {  
        System.out.println("Customer ID: " + this.customerId);
        System.out.println("Order ID: " +this.orderId);
        System.out.println("Products:");
        //for (Product product : this.products) {
        for(int i=0;i<products.length;i++){
            //if (product[i] != null) {
                System.out.println("- " + products[i].getName() + ": $" + products[i].getPrice());
        }
   // }
        System.out.println("Total Price: $" + this.totalPrice);
    }
}


