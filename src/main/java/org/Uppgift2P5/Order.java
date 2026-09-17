package org.Uppgift2P5;

public class Order {
    static int nextOrderNumber = 1000;
    private int orderNumber;

    public Order(){
        orderNumber = nextOrderNumber++;
    }

    public int getOrderNumber(){
        return orderNumber;
    }

    public int getNextOrderNumber(){
        return nextOrderNumber;
    }

    static void main(){
        Order order = new Order();
        IO.println("Order number: " + order.getOrderNumber());
        Order order2 = new Order();
        IO.println("Order number: " + order2.getOrderNumber());
        Order order3 = new Order();
        IO.println("Order number: " + order3.getOrderNumber());
    }
}
