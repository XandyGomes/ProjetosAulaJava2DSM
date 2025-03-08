/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alexandre.aulajava2dsm;

/**
 *
 * @author Alexandre
 * 
 * Escreva um aplicativo que exiba os números 1 a 4 na mesma linha,
 * com cada par de adjacentes separados por um espaço.
 * Use as seguintes técnicas:
 * => Uma instrução System.out.println
 * => Quatro instruções System.out.print
 * => Uma instrução System.out.printf

 */
public class Impressao {
    public static void main(String[] args) {
        //Uma instrução System.out.println
        System.out.print("println => ");
        System.out.println("1 2 3 4");
        
        //Quatro instruções System.out.print
        System.out.print("print => ");
        System.out.print("1 ");
        System.out.print("2 ");
        System.out.print("3 ");
        System.out.print("4 ");
        
        //Uma instrução System.out.printf
        System.out.print("\nprintf => ");
        System.out.printf("%d %d %d %d", 1,2,3,4);
        
    }
}
