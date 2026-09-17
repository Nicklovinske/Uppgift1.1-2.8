package org.Uppgift2P4;

public class Age {
    private int years;

    public Age(int years) {
        if (years < 0 || years > 150)
            throw new IllegalArgumentException("Invalid age");
        else
            this.years = years;
    }

    static void main(){
        Age age = new Age(70);
        IO.println(age.years);

        try{
            Age person2 = new Age(-5);
            IO.println("Person 2: " + person2.years);
        } catch (IllegalArgumentException e){
            IO.println("Invalid age" + e.getMessage());
        }
    }
}
