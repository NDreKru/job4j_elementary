package ru.job4j.condition;

public class SqArea {

    public static double square(int p, int k) {
        int h = p / (2 * (k + 1));
        return Math.pow(h, 2) * k;
    }

    public static void main(String[] args) {
        double result = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = " + result);
    }
}
