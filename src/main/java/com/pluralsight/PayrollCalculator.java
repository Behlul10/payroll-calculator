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

        if(hourWorked <= 40) {
            System.out.println("Your gross pay is: " + (hourWorked * payRate));
        } else if(hourWorked > 40){
            float newPayRate = payRate * 1.5f;
            float newHoursWorked = hourWorked - 40;
            float overTimePay = newHoursWorked * payRate;
            float grossPay = payRate * (hourWorked - newHoursWorked);
            System.out.println("Seem like you worked over time. Your overtime pay is: "  + overTimePay);
            System.out.println("Your Gross pay is: $" + (grossPay + overTimePay));

        } else{
            System.out.println("Invalid Input. TRY AGAIN!");
        }



    }
}
