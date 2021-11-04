package com.rogue.cockroachdbupsert;

public class Demo {
    public static void main(String[] args) {
        double[][] array= {
                {1, 5},
                {13, 1.55},
                {12, 100.6},
                {12.1, .85} };

        System.out.printf(String.valueOf(array[0][1]));
        java.util.Arrays.sort(array, new java.util.Comparator<double[]>() {
            public int compare(double[] a, double[] b) {
                return Double.compare(a[0], b[0]);
            }
        });
    }
}
