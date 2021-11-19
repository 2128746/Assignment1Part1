/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 * This program is designed to convert an octal number to a decimal number and output the result.
 * @author Nicholas Cossette
 */
public class NumberConverter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter a 4-digit Octal number: ");
        int octalNumberOriginal = scanner.nextInt();
        int octalNumber = octalNumberOriginal;
        int decNumber = 0;
        
        int i = 0;
        while(true){
            if(octalNumber == 0){
                break;
                
            }else{
                 int temp = octalNumber%10;
                 decNumber += temp*Math.pow(8, i);
                 octalNumber = octalNumber/10;
                 i++;
            }
        }
        
        
        System.out.printf("\n%-14s : %d\n", "Octal Number", octalNumberOriginal);
        System.out.printf("%-14s : %d\n", "Decimal Number", decNumber);
    }
}
