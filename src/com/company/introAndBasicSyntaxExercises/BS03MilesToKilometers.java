package com.company.introAndBasicSyntaxExercises;

import java.util.Scanner;

public class BS03MilesToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double miles = Double.parseDouble(scanner.nextLine());

        double km = miles * 1.60934;

        System.out.printf("%.2f",km);
    }
}
