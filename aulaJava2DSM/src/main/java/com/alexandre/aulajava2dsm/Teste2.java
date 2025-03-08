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
public class Teste2 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        Teste obj1 = new Teste("Alexandre");
        Teste obj2 = new Teste(" Gomes");
        
//        String nome;
//        
//        System.out.print("Digite o primeiro nome: ");
//        nome = input.nextLine();
//        obj1.setName(nome);
//        
//        System.out.print("Digite outro nome: ");
//        nome = input.nextLine();
//        obj2.setName(nome);
        
        System.out.print("O primeiro nome é: "+ obj1.getName() + " O segundo nome é: "+  obj2.getName());
    }
}
