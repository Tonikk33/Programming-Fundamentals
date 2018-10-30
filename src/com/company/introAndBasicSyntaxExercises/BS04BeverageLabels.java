package com.company.introAndBasicSyntaxExercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BS04BeverageLabels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("#.###############");

        String productName = scanner.nextLine();
        int volume = Integer.parseInt(scanner.nextLine());
        int energyContent = Integer.parseInt(scanner.nextLine());
        double sugarContent = Double.parseDouble(scanner.nextLine());

        double energyContentInGivenVolume = (volume * energyContent) / 100.0;
        double sugarContentInGivenVolume = (volume * sugarContent) / 100.0;

        System.out.printf("%dml %s:\n%skcal, %sg sugars",
                volume, productName, df.format(energyContentInGivenVolume),
                df.format(sugarContentInGivenVolume));
    }
}
