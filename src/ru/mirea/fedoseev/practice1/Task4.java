package ru.mirea.fedoseev.practice1;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) return;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int sumDoWhile = 0, i = 0;
        do {
            sumDoWhile += a[i];
            i++;
        } while (i < a.length);
        int sumWhile = 0, j = 0;
        while (j < a.length) {
            sumWhile += a[j];
            j++;
        }
        int min = a[0], max = a[0];
        for (int k = 1; k < a.length; k++) {
            if (a[k] < min) min = a[k];
            if (a[k] > max) max = a[k];
        }
        System.out.println("Сумма (do-while): " + sumDoWhile);
        System.out.println("Сумма (while): " + sumWhile);
        System.out.println("Минимум = " + min);
        System.out.println("Максимум = " + max);
    }
}