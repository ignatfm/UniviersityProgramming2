package ru.mirea.fedoseev.practice1;

import java.math.BigInteger;
import java.util.Scanner;

public class Task7 {
    public static BigInteger factorial(int n) {
        if (n < 0) throw new IllegalArgumentException();
        BigInteger res = BigInteger.ONE;
        for (int i = 2; i <= n; i++) res = res.multiply(BigInteger.valueOf(i));
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n + "! = " + factorial(n));
        for (int k = 0; k <= 10; k++) System.out.println(k + "! = " + factorial(k));
    }
}