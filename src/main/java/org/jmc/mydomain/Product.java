package org.jmc.mydomain;

public class Product {

    public double product(double a, double b) {
        return a * b;
    }

    public int product(int a, int b) {
        return a * b;
    }

    public double product(double a, double b, double c) {
        return a * b * c;
    }

    public double pow(double base, double exp){
        return Math.pow(base, exp);
    }
}
