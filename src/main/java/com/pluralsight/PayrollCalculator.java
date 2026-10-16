package com.pluralsight;

import java.util.Scanner;

/**
 * Excercise 5 - Workbook 1C
 * Payroll Calculator takes in
 * @author Behlul Vardal
 */
public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //starting Scanner var

        //Declaring Variables
        String name;
        float hourWorked;
        float payRate;
        float overtimeRate;
        float overtimeHours;
        float overTimePay;
        float grossPay;

        //User inputs
        System.out.print("What is your name?: ");
        name = scanner.nextLine();

        System.out.print("How many hours have you worked?: ");
        hourWorked = scanner.nextFloat();

        System.out.print("what is your hourly pay rate?: ");
        payRate = scanner.nextFloat();

        System.out.println("Name: " + name);

        //System output
        if(hourWorked <= 40) { //if not over time
            System.out.println("Your gross pay is: " + (hourWorked * payRate));
        } else if(hourWorked > 40){ // if over time
            overtimeRate = payRate * 1.5f; //ot rate = 1.5X the normal rate
            overtimeHours = hourWorked - 40; //how much you went over 40 hours
            overTimePay = overtimeHours * overtimeRate; //pay your getting for ot

            grossPay = (payRate * 40 ) + overTimePay;//Gross pay

            System.out.println("Seem like you worked over time. Your overtime pay is: "  + overTimePay);
            System.out.println("Your Gross pay is: $" + grossPay);

        } else{
            System.out.println("Invalid Input. TRY AGAIN!");
        }

    }
}
