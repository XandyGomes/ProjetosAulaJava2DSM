/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alexandre.aulajava2dsm;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class AplicandoArrayList {
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        int soma = 0;
        int numeros = 0;
        double media = 0.0;
        
        for(int i = 0; i < 5; i++){
            System.out.print("Digite o "+(i+1)+" número: ");
            numeros = input.nextInt();
            array.add(numeros);
            soma += numeros;
        }
        
        for(int num : array){
            System.out.println(num);
        }
        
        media = soma / array.size();
        
        
        System.out.printf("\nMedia: %.2f\n", media);
    } 
}
