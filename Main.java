package org.example;

public class Main {
    public static void main(String[] args) {
        double a = -5;
        double b = 5;
        double x = a;
        double y = x * x * x + x + 1;
        while (x < b) {
            y = x * x * x + x + 1;
            if ((y < 0.01) & (y > -0.01)) {
                System.out.println(x);
                break;
            }
            x += 0.0001;
        }
    }
}