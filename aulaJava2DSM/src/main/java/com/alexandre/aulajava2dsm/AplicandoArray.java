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
public class AplicandoArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        int soma = 0;
        double media = 0.0;
        
        for(int i = 0; i < array.length; i++){
            System.out.print("Digite o "+(i+1)+" número: ");
            array[i] = input.nextInt();
            soma += array[i];
        }
        
        for(int num : array){
            System.out.println(num);
        }
        
        media = soma / array.length;
        System.out.printf("\nMedia: %.2f\n", media);
    }
}
