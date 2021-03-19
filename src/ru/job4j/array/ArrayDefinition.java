package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("ages length = " + ages.length);
        System.out.println("surnames length = " + surnames.length);
        System.out.println("prices length= " + prices.length);
        String[] names = new String[4];
        names[0] = "Anton";
        names[1] = "Andrey";
        names[2] = "Arkady";
        names[3] = "Alfred";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
