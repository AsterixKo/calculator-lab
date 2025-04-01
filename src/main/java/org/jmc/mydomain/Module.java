package org.jmc.mydomain;

public class Module {
    public static int calculoModule(int a, int b) {
        int div = a / b;
        return div;
    }

    public static double calculoAdsolut(double a) {
        if (a >= 0) {
            return a;
        } else {
            return -a;
        }
    }

}
