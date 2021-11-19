/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 * This program is designed to calculate the balance after a desired amount of years with an annual interest rate
 * @author Nicholas Cossette
 */
public class BalanceCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the intial balance: $");
        double initBalance = scanner.nextDouble();
        
        System.out.print("Please enter the annual interest rate (2 for 2%): ");
        double annInterestRatePercentage = scanner.nextDouble();
        
        System.out.print("Please enter the number of years the client wants to save the money in the bank: ");
        int yearsInBank = scanner.nextInt();
        
        double annInterestRate = annInterestRatePercentage / 100;
        double interest = initBalance * annInterestRate * yearsInBank;
        double balanceAfterYears = initBalance + interest;
        
        System.out.printf("\n%-21s : %10.2f\n", "Initial Balance", initBalance);
        System.out.printf("%-21s : %9.2f%%\n", "Annual Interest Rate", annInterestRatePercentage);
        System.out.printf("%-21s : %10d\n", "Saving years", yearsInBank);
        System.out.print("----------------------------------\n");
        System.out.printf("%-21s : %10.2f\n", "Balance after " + yearsInBank + " years", balanceAfterYears);
    }
}
