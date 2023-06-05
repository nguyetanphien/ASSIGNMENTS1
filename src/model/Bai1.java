package model;

public class Bai1 {
    public void Bai1() {
        int a = 5;
        int b = 6;
        int c = a;
        a = b;
        b = c;
        System.out.println("a=" + a + "\nb=" + b);

    }

    public static void main(String[] args) {
        Bai1 bai1 = new Bai1();
        bai1.Bai1();
    }
}
