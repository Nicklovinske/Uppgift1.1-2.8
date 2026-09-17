package org.Uppgift1P1;

public class ProductRegister {
    static void main() {
        Product product1 = new Product();
        product1.setName("Creatine Monohydrate");
        product1.setPrice(299);
        product1.setStockQuantity(200);

        Product product2 = new Product();
        product2.setName("Multivitamin");
        product2.setPrice(199);
        product2.setStockQuantity(50);

        Product product3 = new Product();
        product3.setName("Whey Protein");
        product3.setPrice(399);
        product3.setStockQuantity(100);


        IO.println("The total value of all creatine in stock is: $" + product1.totalValue());
        IO.println("The total value of all vitamins in stock is: $" + product2.totalValue());
        IO.println("The total value of all whey protein in stock is: $" + product3.totalValue());
        IO.println("The total value of all products in stock is: $" + Math.addExact(product1.totalValue(), Math.addExact(product2.totalValue(), product3.totalValue())));

    }


}
