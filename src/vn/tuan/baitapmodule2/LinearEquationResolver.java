package vn.tuan.baitapmodule2;

import java.util.Scanner;
public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số a: ");
        double a = scanner.nextInt();
        System.out.print("Nhập vào số b: ");
        double b = scanner.nextInt();

        if (a != 0) {
            double x = -b/a;
            System.out.println("nghiệm của x là: " + x);
        } else {
            System.out.println("Phương trình vô số nghiệm");
        }
    }
}
