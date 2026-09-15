package org.Uppgift1P2;

public class TriangleCalculator {
    static void main() {
        Triangle triangle = new Triangle();
        triangle.setSideA(Double.parseDouble(IO.readln("Enter the length of side A: ")));
        triangle.setSideB(Double.parseDouble(IO.readln("Enter the length of side B: ")));
        triangle.setSideC(Double.parseDouble(IO.readln("Enter the length of side C: ")));

        IO.print(triangle.perimeter());
        IO.print(triangle.isValidTriangle());
        IO.println(triangle.triangleType(triangle.getSideA(), triangle.getSideB(), triangle.getSideC()));
    }
}
