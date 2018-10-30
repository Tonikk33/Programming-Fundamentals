package com.company.introAndBasicSyntaxExercises;

import java.util.Scanner;

public class BS04BeverageLabels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double ProductVolume = Double.parseDouble(scanner.nextLine());
        double ProductEnergy = Double.parseDouble(scanner.nextLine());
        double ProductSugarContent = Double.parseDouble(scanner.nextLine());

        double energy =(ProductVolume * ProductEnergy)/100.00;
        double sugar =(ProductSugarContent * ProductVolume)/100.00;

        System.out.printf("%.0fml %s:%n", ProductVolume, name);

        if (sugar%2==0) {
            System.out.printf("%.0fkcal, %.0fg sugars", energy, sugar);
        }
        else {
            System.out.printf("%.0fkcal, %.1fg sugars", energy, sugar);
        }
    }
}
