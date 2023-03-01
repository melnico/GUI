package org.example;
public class Main {
    public static void main(String[] args) {
        double a = -5;
        double b = 5;
        double x = a;
        double y = x*x*x + x +1;
        double square = 0;
        double delta = 0.02;
        while(x < b)
        {
            square += delta*(y + x*x*x + x +1)/2;
            y = x*x*x + x +1;
            x += delta;
        }
        System.out.println(square);
    }
}