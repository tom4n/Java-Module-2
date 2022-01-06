package vn.tuan.introduction_to_java;

import java.util.Scanner;

public class USDtoVND {
    public static void main(String[] args) {
        double VND = 23000;
        double USD;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền USD: ");
        USD = scanner.nextDouble();
        double quydoi = USD * VND;
        System.out.printf("VND có giá trị là: %f", quydoi);
    }
}
