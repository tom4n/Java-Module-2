package vn.tuan.baitapmodule2;

import java.util.Scanner;

public class operatorExpression {
    public static void main(String[] args) {
        float width;
        float height;

        //khai báo đối tượng scanner.
        Scanner scanner = new Scanner(System.in);

        //Nhập chiều rộng.
        System.out.print("Enter width: ");
        width = scanner.nextFloat();

        //Nhập chiều cao.
        System.out.print("Enter height: ");
        height = scanner.nextFloat();

        //công thức tính diện tích hình chữ nhật.
        float area = width * height;
        System.out.println("Area is: " + area);
    }
}
