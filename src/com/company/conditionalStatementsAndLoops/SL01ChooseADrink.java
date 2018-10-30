package com.company.conditionalStatementsAndLoops;

import java.util.Scanner;

public class SL01ChooseADrink {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String profession = scanner.nextLine();

        switch (profession){
            case  "Atlete":
                System.out.println("Water");
                break;
            case "Businessman":
            case "Bisnesswoman":
                System.out.println("Coffee");
                break;
            case "SoftUni Student":
                System.out.println("Beer");
                break;
            default:
                System.out.println("Tea");
                break;
        }
    }
}
