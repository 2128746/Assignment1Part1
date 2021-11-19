/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 * This program is designed to calculate the price of an item with a discount and taxes.
 * @author Nicholas Cossette
 */
public class PriceCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the item price: ");
        double itemPrice = scanner.nextDouble();
        
        System.out.print("Please enter the discount ratio (5 for 5%): ");
        double discountRatio = scanner.nextDouble();
        
        double priceBeforeTax = itemPrice - itemPrice * discountRatio / 100;
        
        double FEDERAL_TAX_RATE = 0.05;
        double PROVINCIAL_TAX_RATE = 0.09975;
        
        double federalTax = priceBeforeTax * FEDERAL_TAX_RATE;
        double provincialTax = priceBeforeTax * PROVINCIAL_TAX_RATE;
        double finalPrice = priceBeforeTax + federalTax + provincialTax;
        
        System.out.printf("\n%-16s : %.2f\n", "Original Price", itemPrice);
        System.out.printf("%-16s : %.2f%%\n", "Discount Ratio", discountRatio);
        System.out.printf("%-16s : %.2f\n", "Price Before Tax", priceBeforeTax);
        System.out.print("--------------------------\n");
        System.out.printf("%-16s : %.2f\n", "Federal Tax", federalTax);
        System.out.printf("%-16s : %.2f\n", "Provincial", provincialTax);
        System.out.printf("%-16s : %.2f\n", "Final Price", finalPrice);
         
    }
}
