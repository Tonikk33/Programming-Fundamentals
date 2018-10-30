package com.company.conditionalStatementsAndLoops;

import java.util.Scanner;

public class SL02ChooseADrinkVol2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String profession = scanner.nextLine();
        int volume = Integer.parseInt(scanner.nextLine());
        double prize = 0;

        if (profession.equalsIgnoreCase("Athlete")) {
                prize = volume * 0.7;

        }else if (profession.equalsIgnoreCase("Businessman")
                || profession.equalsIgnoreCase("Businesswoman")){

            prize = volume * 1.0;

        }else if (profession.equalsIgnoreCase("SoftUni Student")){

            prize = volume * 1.7;

        }else {
            prize = volume * 1.2;
        }

        System.out.printf("The %s has to pay %.2f.",profession, prize);
    }
}
