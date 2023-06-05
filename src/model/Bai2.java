package model;

import java.util.Scanner;

public class Bai2 {
    public void Rank() {
        Scanner scanner = new Scanner(System.in);
        double toan, ly, hoa;
        System.out.printf("Nhap diem toan: ");
        toan = scanner.nextDouble();
        System.out.printf("Nhap diem ly:");
        ly = scanner.nextDouble();
        System.out.printf("Nhap diem hoa:");
        hoa = scanner.nextDouble();
        double sum = (toan + ly + hoa) / 3;
        System.out.println(sum);
        if (sum >= 8)
            System.out.println("A");
        else if (sum >= 6.5)
            System.out.println("B");
        else if (sum >= 5)
            System.out.println("C");
        else
            System.out.println("D");
    }

    public static void main(String[] args) {
        Bai2 bai2 = new Bai2();
        bai2.Rank();
    }
}
