package com.pluralsight;

import java.util.Scanner;

/**
 * Excercise 5 - Workbook 1C
 * Payroll Calculator takes in
 * @author Behlul Vardal
 */
public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        float hourWorked;
        float payRate;

        System.out.print("What is your name?: ");
        name = scanner.nextLine();

        System.out.print("How many hours have you worked?: ");
        hourWorked = scanner.nextFloat();

        System.out.print("what is your hourly pay rate?: ");
//        payRate = Float.parseFloat(scanner.nextLine());
        payRate = scanner.nextFloat();

        System.out.println("Name: " + name);
        System.out.println("Your gross pay is: " + (hourWorked * payRate));



    }
}
