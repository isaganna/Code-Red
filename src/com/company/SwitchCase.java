package com.company;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int Number = -1;
        Scanner input = new Scanner(System.in);
        while (Number  != 4) {


            System.out.println("give me a number");

            try {
                Scanner scanner = new Scanner (System.in);
                Number = scanner.nextInt();
                System.out.println("OK");

            }

            catch (InputMismatchException e){
            System.out.println("You have made a mistake");
            continue;
        }

             Number = input.nextInt();

            switch (Number) {
                case 1:
                    System.out.println("ONE");
                    break;//again
                case 2:
                    System.out.println("TWO");
                    break;//change
                default:
                    System.out.println("I DON'T KNOW");
                    break;///stop
            }
        }

    }

}
