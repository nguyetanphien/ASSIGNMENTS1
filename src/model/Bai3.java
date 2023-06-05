package model;

import java.util.Scanner;

public class Bai3 {
    public void PT1() {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        System.out.printf("Nhap a: ");
        a = scanner.nextDouble();
        System.out.printf("Nhap b: ");
        b = scanner.nextDouble();
        System.out.println(a + "x + " + b + "x =" + (-b / a));

    }

    public static void main(String[] args) {
        Bai3 bai3 = new Bai3();
        bai3.PT1();
    }
}
