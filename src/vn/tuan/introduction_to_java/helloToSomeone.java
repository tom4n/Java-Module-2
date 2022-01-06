package vn.tuan.introduction_to_java;

import java.util.Scanner;

public class helloToSomeone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("type your name: ");
        String name = scanner.nextLine();

        System.out.printf("Hello %s", name);
    }
}
