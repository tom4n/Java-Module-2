package vn.tuan.JavaLoop;

import java.util.Scanner;

public class DisplayMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.print("choose any number: ");
        int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        System.out.println(" ");
                        for (int j = 0; j < 7; j++) {
                            System.out.print(" * ");
                        }
                    }// in hình chữ nhật
                    break;
                case 2:
                    for (int i = 0; i <= 5; i++) {
                        System.out.println(" ");
                        for (int j = 0; j < i; j++) {
                            System.out.print(" * ");
                        }
                    }// in hình tam giác vuông ở bottom left

                    for (int i = 5; i >= 1; i--) {
                        System.out.println(" ");
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" * ");
                        }
                    }// in hình tam giác vuông ở top left
                    break;
                case 3:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 1; j <= 5 - i; j++) {
                            System.out.print("  ");
                        }
                        for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    scanner.close();
                    break;
            }

    }
}

