/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author andresimery
 */
public class Fibonacci {

    public Fibonacci() {
        
    }
    
    public void calculateFibo(int maxNumber){
        int number1 = 0;
        int number2 = 1;
        System.out.println("The Fibonacci serie is:");
        while (number1 < maxNumber) {
            int aux = number1;
            System.out.println(number1+" ");
            number1 = number2;
            number2 += aux;
        }
    }
    
}
