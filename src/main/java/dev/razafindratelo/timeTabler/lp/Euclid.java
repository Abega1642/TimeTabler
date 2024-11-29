package dev.razafindratelo.timeTabler.lp;

import java.util.Map;

public class Euclid {
    public static Map<String, Integer> division(int a, int b) {
        int q = a / b;
        int r = a % b;
        return Map.of("a", a, "b", b, "q", q, "r", r);
    }

    public static int gcd(int a, int b) {
        if (a == 0 && b != 0) return b;
        if (a != 0 && b == 0) return a;
        if (a % b == 0) return b;
        if (b % a == 0) return a;

        return gcd(b, a % b);
    }

}
