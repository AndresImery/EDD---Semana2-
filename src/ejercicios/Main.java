/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author andresimery
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("*** Welcome ***");
        System.out.println("Please enter a valid option");
        System.out.println("1- Fibonacci");
        System.out.println("2- Arrays");
        System.out.println("2- String Arrays");
        
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        
        if (option == 1) {
            System.out.println("Enter max number:");
            Scanner sc2 = new Scanner(System.in);
            int maxNumber = sc2.nextInt();
            
            Fibonacci fibo = new Fibonacci();
            fibo.calculateFibo(maxNumber);
        } else if (option == 2) {
            Arrays arrays = new Arrays();
            arrays.valueCounter();
        } else if (option == 2) {
            
        }
//        
    }
    
}
