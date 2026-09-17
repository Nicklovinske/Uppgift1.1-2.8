package org.Uppgift2P6;

import org.Uppgift2P1.Employee;

public class Uppgift2_6 {
    static void main() {
        double price1 = 49.90;
        double price2 = price1;
        price1 = 99.90;
        IO.println(price2);

        Employee e1 = new Employee(Alex, 32000, IT);
        Employee e2 = e1;
        e2.setSalary(40000);
        IO.println(e1.getSalary());
    }
}
