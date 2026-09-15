package org.example;

public class Uppgift1P1 {
        private String name;
        private double price;
        private int stockQuantity;

        public void Product(String name, double price, int stockQuantity){
            name = "Undefined";
            price = 1;
            stockQuantity = 0;
        }

        public String getName(){
            return name;
        }

        public String setName(String name){
            return this.name = name;

        }
    }
