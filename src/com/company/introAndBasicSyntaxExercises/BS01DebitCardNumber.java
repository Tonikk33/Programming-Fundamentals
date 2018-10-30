package com.company.introAndBasicSyntaxExercises;

import java.util.Scanner;

public class BS01DebitCardNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int d = Integer.parseInt(scanner.nextLine());

        sout(a);
        sout(b);
        sout(c);
        sout(d);
    }

    private static void sout(int b) {
        if (b < 10){
            System.out.print("000" + b + " ");
        }else if(b < 100){
            System.out.print("00" + b + " ");
        }else if (b < 1000 ){
            System.out.print("0" + b + " ");
        }else{
            System.out.print(b + " ");
        }
    }
}
