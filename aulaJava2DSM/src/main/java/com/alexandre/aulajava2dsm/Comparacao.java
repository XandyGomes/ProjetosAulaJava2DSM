/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alexandre.aulajava2dsm;

import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class Comparacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1,number2;
        
        System.out.print("Digite o primeiro numero: ");
        number1 = input.nextInt();

        System.out.print("Digite o segundo numero: ");
        number2 = input.nextInt();        
        
        if(number1 == number2){
            System.out.printf("%d é igual a %d%n",number1, number2);
        }

        if(number1 != number2){
            System.out.printf("%d é diferente de %d%n",number1, number2);
        }
 
        if(number1 < number2){
            System.out.printf("%d é menor que %d%n",number1, number2);
        }

        if(number1 > number2){
            System.out.printf("%d é maior que %d%n",number1, number2);
        }
        
        if(number1 <= number2){
            System.out.printf("%d é menor ou igual a %d%n",number1, number2);
        }        

        if(number1 >= number2){
            System.out.printf("%d é maior ou igual a %d%n",number1, number2);
        }          
    }
}
