package com.company.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString;
        int number;
        System.out.print("Please input a symbol: ");
        while (true){
            inputString = scanner.nextLine();
            number = convertStringToNumber(inputString);
                if (number != -1){
                    System.out.println(number);
                    break;
                } else {
                    System.out.println("Try again.");
                }
        }
    }
    private static int convertStringToNumber(String inputString){
        int number;
        try{
            number = Integer.parseInt(inputString);
            return number;
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}


