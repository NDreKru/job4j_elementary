package ru.job4j.array;

public class Merge {

    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        for (int l = 0, r = 0, s = 0; s < rsl.length;) {
            if (l < left.length && r < right.length) {
                if (left[l] < right[r]) {
                    rsl[s++] = left[l++];
                } else {
                    rsl[s++] = right[r++];
                }
            } else if (l < left.length) {
                rsl[s++] = left[l++];
            } else {
                rsl[s++] = right[r++];
            }
        }
        return rsl;
    }
}
