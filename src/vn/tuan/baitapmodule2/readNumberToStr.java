package vn.tuan.baitapmodule2;

import java.util.Scanner;

public class readNumberToStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("type your number: ");
        int num = scanner.nextInt();
        String result = "";
        if (num < 10) {
            result = unit(num);
            System.out.println(result);
            return;
        }
        if (num < 20) {
            result = lessTewnty(num);
            System.out.println(result);
            return;
        }
        if (num < 100) {
            int dozen = num / 10;
            int unit = num % 10;
            result = lessOneHunred(dozen, unit);
            System.out.println(result);
            return;
        }
        if (num < 1000) {
            int hundred = num / 100;
            int dozen = num % 100;
            int unit = num % 10;
            if (dozen < 20) {
                result = hundred(hundred) + " " + lessTewnty(dozen);
            } else {
                result = lessThousand(hundred, dozen/10, unit);
            }
            System.out.println(result);
            return;
        }
    }

    private static String lessThousand(int hundred, int dozen, int unit) {
        return hundred(hundred) + " " + dozen(dozen) + " " + unit(unit);
    }


    private static String lessOneHunred(int dozen, int unit) {
        return dozen(dozen) + " " + unit(unit);
    }

    private static String lessTewnty(int num) {
        String result = "";
        switch (num) {
            case 10:
                result = "ten";
                break;
            case 11:
                result = "eleven";
                break;
            case 12:
                result = "twele";
                break;
            case 13:
                result = "thirteen";
                break;
            case 14:
                result = "fourteen";
                break;
            case 15:
                result = "fifteen";
                break;
            case 16:
                result = "sixteen";
                break;
            case 17:
                result = "seventeen";
                break;
            case 18:
                result = "eightteen";
                break;
            case 19:
                result = "nineteen";
                break;

        }
        return result;
    }//trả về số nhỏ sơn 20

    private static String unit(int num) {
        String result = "";
        switch (num) {
            case 0:
                result = "zero";
                break;
            case 1:
                result = "one";
                break;
            case 2:
                result = "two";
                break;
            case 3:
                result = "three";
                break;
            case 4:
                result = "four";
                break;
            case 5:
                result = "five";
                break;
            case 6:
                result = "six";
                break;
            case 7:
                result = "seven";
                break;
            case 8:
                result = "eight";
                break;
            case 9:
                result = "nine";
                break;
        }
        return result;
    }//trả về số đơn vị, và số nhỏ hơn 10

    private static String dozen(int dozen) {
        String result = "";
        switch (dozen) {
            case 0:
                result = "";
                break;
            case 2:
                result = "tewnty";
                break;
            case 3:
                result = "thirty";
                break;
            case 4:
                result = "forty";
                break;
            case 5:
                result = "fifty";
                break;
            default:
                result = unit(dozen) + "ty";
                break;
        }
        return result;
    }//trả về số hàng chục

    private static String hundred(int hundred) {
        String result = unit(hundred) + " hundred";
        return result;
    }//trả về số hàng trăm
}