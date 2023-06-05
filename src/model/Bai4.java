package model;

import java.util.Scanner;

public class Bai4 {
    public void PTB2() {
        double a;
        double b;
        double c;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap a: ");
        a = scanner.nextDouble();
        System.out.printf("Nhap b: ");
        b = scanner.nextDouble();
        System.out.printf("Nhap c: ");
        c = scanner.nextDouble();
        double dt;
        String kq ;

        if (a == 0) {
            if (b == 0) {
                if (c == 0)
                    kq = ("vsn");
                else
                    kq = ("vn");

            } else
                kq = ("x=" + 1.0 * -c / b);

        } else {
            dt = b * b - 4 * a * c;
            if (dt < 0)
                kq = ("vn");
            else if (dt == 0)
                kq = ("x1=x2=" + 1.0 * -b / (2 * a));
            else
                kq = ("x1=" + (1.0 * -b - Math.sqrt(dt)) / (2 * a) + ",x2=" + (1.0 * -b + Math.sqrt(dt)) / (2 * a));


        }
        System.out.println(kq);
    }

    public static void main(String[] args) {
        Bai4 bai4=new Bai4();
        bai4.PTB2();
    }
}
