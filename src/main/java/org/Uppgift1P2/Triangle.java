package org.Uppgift1P2;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
        sideA = 0.1;
        sideB = 0.1;
        sideC = 0.1;
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    //constructs a triangle where all 3 sides are equal to the specified side
    public Triangle(double side){
        this.sideA = side;
        this.sideB = side;
        this.sideC = side;
    }

    public Triangle(Triangle original){
        this.sideA = original.sideA;
        this.sideB = original.sideB;
        this.sideC = original.sideC;
    }

    public static Triangle copyTo(Triangle clone, Triangle original){
        clone.sideA = original.sideA;
        clone.sideB = original.sideB;
        clone.sideC = original.sideC;
    }

    public double setSideA(double sideA) {
        this.sideA = sideA;
        return sideA;
    }

    public double getSideA() {
        return sideA;
    }

    public double setSideB(double sideB) {
        this.sideB = sideB;
        return sideB;
    }

    public double getSideB() {
        return sideB;
    }

    public double setSideC(double sideC) {
        this.sideC = sideC;
        return sideC;
    }

    public double getSideC() {
        return sideC;
    }

    public double perimeter() {
        return sideA + sideB + sideC;
    }

    public String triangleType(double sideA, double sideB, double sideC) {
        if (sideA == sideB && sideB == sideC) {
            return "Equilateral triangle";
        } else if (sideA == sideB || sideB == sideC || sideA == sideC) {
            return "Isosceles triangle";
        } else {
            return "Scalene triangle";
        }
    }

    public boolean isValidTriangle() {
        return !(sideA + sideB <= sideC) && !(sideA + sideC <= sideB) && !(sideB + sideC <= sideA);

    }

}
