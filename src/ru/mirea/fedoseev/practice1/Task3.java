package ru.mirea.fedoseev.practice1;

public class Task3 {
    public static void main(String[] args) {
        int[] a = {3, -2, 10, 5, 0, 7};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        double avg = a.length == 0 ? 0.0 : (double) sum / a.length;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + (i + 1 < a.length ? " " : "\n"));
        }
        System.out.println("Сумма = " + sum);
        System.out.println("Среднее = " + avg);
    }
}