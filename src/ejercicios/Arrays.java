/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author andresimery
 */
public class Arrays {

    public Arrays() {
    }
    
    public void valueCounter() {
        System.out.println("Please enter the array size:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        int contPositive = 0;
        int contNegative = 0;
        int contZeros = 0;
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter the value number "+(i+1)+":" );
            array[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("El arreglo es:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            if (array[i] == 0) {
                contZeros++;
            } else if (array[i] > 0) {
                contPositive++;
            } else {
                contNegative++;
            }
        }
        System.out.println("We have "+contZeros+" zeros");
        System.out.println("We have "+contPositive+" positives");
        System.out.println("We have "+contNegative+" negatives");
    }
    
}
