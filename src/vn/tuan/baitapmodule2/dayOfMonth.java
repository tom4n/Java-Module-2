package vn.tuan.baitapmodule2;

import java.util.Scanner;

public class dayOfMonth {
    public static void main(String[] args) {
        System.out.print("Type month you want check: ");
        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();
        String dayIsMonth;

        switch (month) {
            case 2:
                dayIsMonth = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayIsMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayIsMonth = "30";
                break;
            default:
                dayIsMonth = "";
                break;
        }
        if (!dayIsMonth.equals(""))
            System.out.printf("The month %d has %s days!", month, dayIsMonth);
        else System.out.print("invalid input!");
    }
}
