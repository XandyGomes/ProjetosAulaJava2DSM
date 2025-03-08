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
public class Produto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Double x, y, z, result;
        
        System.out.print("Digite o primeiro numero: ");
        x = entrada.nextDouble();
        
        System.out.print("Digite o segundo numero: ");
        y = entrada.nextDouble();
        
        System.out.print("Digite o terceiro numero: ");
        z = entrada.nextDouble();
        
        result = x * y * z;
        
        System.out.print("O produto de x, y, z é: "+ result);
        System.out.printf("O produto de x, y, z é: %d", result);
    }
}
