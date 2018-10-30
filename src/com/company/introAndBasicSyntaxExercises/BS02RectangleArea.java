package com.company.introAndBasicSyntaxExercises;

import java.util.Scanner;

public class BS02RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());

        double result = x * y;

        System.out.printf("%.2f",result);
    }
}
