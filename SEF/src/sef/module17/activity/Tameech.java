package sef.module17.activity;

public class Tameech {
    public static void main (String [] arg) {
        Tameech tameech =  new Tameech;
        tameech.add(3,5);
        System.out.println("Hello" + tameech.add(3,5));
    }
    public int add (int num1, int num2) {
        return num1+num2;
    }
}
