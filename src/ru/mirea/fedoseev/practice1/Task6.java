package ru.mirea.fedoseev.practice1;

public class Task6 {
    public static void main(String[] args) {
        double h = 0.0;
        for (int n = 1; n <= 10; n++) {
            h += 1.0 / n;
            System.out.printf("H%-2d = %.6f%n", n, h);
        }
    }
}