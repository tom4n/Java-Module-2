package vn.tuan.introduction_to_java;

import java.util.Scanner;

public class bmiCaculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("type your weight (kilogram): ");
        weight = scanner.nextDouble();
        System.out.print("type your height (meter): ");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s %s", "bmi", "Interpretation\n");

        if (bmi < 18.5) {
            System.out.printf("%-20f %s", bmi, "Underweight");
        } else if (bmi >= 18.5 && bmi < 25.0) {
            System.out.printf("%-20f %s", bmi, "Normal");
        } else if (bmi >= 25.0 && bmi < 30.0) {
            System.out.printf("%-20f %s", bmi, "Overweight");
        } else if (bmi > 30) {
            System.out.printf("%-20f %s", bmi, "Obese");
        }


    }
}
