/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 * This program is designed to print out your personal information.
 * @author Nicholas Cossette
 */
public class PersonalInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();
        
        System.out.print("Please enter your gender: ");
        scanner.nextLine();
        String gender = scanner.nextLine();
        
        System.out.print("Please enter your department: ");
        String department = scanner.nextLine();
        
        System.out.print("Please enter the vlaue of pi (3.1415926): ");
        double pi = scanner.nextDouble();
        
        System.out.printf("%-12s : %s\n", "Name", name);
        System.out.printf("%-12s : %d\n", "Age", age);
        System.out.printf("%-12s : %s\n", "Gender", gender);
        System.out.printf("%-12s : %s\n", "Department", department);
        System.out.printf("%-12s : %.2f\n", "PI", pi);
        
        
        
    }
    
}
