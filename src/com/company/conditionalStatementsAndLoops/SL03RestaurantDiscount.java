package com.company.conditionalStatementsAndLoops;

import java.util.Scanner;

public class SL03RestaurantDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double people = Double.parseDouble(scanner.nextLine());
        String servicePackage = scanner.nextLine();
        double prizeHall = 0;
        double totalPrize = 0;



        if (people <= 49){
            if (servicePackage.equalsIgnoreCase("normal")){
                prizeHall = 2850;
                totalPrize = prizeHall / people ;

                System.out.println("We can offer you the Small Hall");
                System.out.printf("The price per person is %.2f$",totalPrize);


            }else if (servicePackage.equalsIgnoreCase("gold")){
                prizeHall = 2925;
                totalPrize = prizeHall / people;
                System.out.println("We can offer you the Small Hall");
                System.out.printf("The price per person is %.2f$",totalPrize);

            }else if (servicePackage.equalsIgnoreCase("Platinum")){
                prizeHall = 2975;
                totalPrize = prizeHall / people;
                System.out.println("We can offer you the Small Hall");
                System.out.printf("The price per person is %.2f$",totalPrize);
            }
        }else if (people > 50 && people <= 100){
            if (servicePackage.equalsIgnoreCase("normal")){
                prizeHall = 5225;
                totalPrize = prizeHall / people;
                System.out.println("We can offer you the Terrace");
                System.out.printf("The price per person is %.2f$",totalPrize);

            }else if (servicePackage.equalsIgnoreCase("gold")){
                prizeHall = 5175;
                totalPrize = prizeHall / people;
                System.out.println("We can offer you the Terrace");
                System.out.printf("The price per person is %.2f$",totalPrize);
            }else if (servicePackage.equalsIgnoreCase("platinum")){
                prizeHall = 5100;
                totalPrize = prizeHall / people;
                System.out.println("We can offer you the Terrace");
                System.out.printf("The price per person is %.2f$",totalPrize);
            }
        }else if (people > 100 && people <= 120){
            if (servicePackage.equalsIgnoreCase("normal")){
                prizeHall = 7600;
                totalPrize = prizeHall / people;
                System.out.println("We can offer you the Great Hall");
                System.out.printf("The price per person is %.2f$",totalPrize);
            }else if (servicePackage.equalsIgnoreCase("gold")){
                prizeHall = 7425;
                totalPrize = prizeHall / people;
                System.out.println("We can offer you the Great Hall");
                System.out.printf("The price per person is %.2f$",totalPrize);
            }else if (servicePackage.equalsIgnoreCase("Platinum")){
                prizeHall = 7225;
                totalPrize = prizeHall / people;
                System.out.println("We can offer you the Great Hall");
                System.out.printf("The price per person is %.2f$",totalPrize);
            }
        }else {
            System.out.println("We do not have an appropriate hall.");
        }
    }
}
