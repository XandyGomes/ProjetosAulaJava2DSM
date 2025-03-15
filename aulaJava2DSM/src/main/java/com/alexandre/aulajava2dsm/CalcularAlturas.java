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
public class CalcularAlturas {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double maiorAltura = 0.0;
        double menorAltura = 99.0;
        double somaAlturasHomens = 0.0;
        int numeroMulheres = 0;
        int numeroHomens = 0;
        double altura = 0;
        double mediaAlturasHomens = 0.0;
        String sexo;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a altura da " + i + "ª pessoa: ");
            altura = input.nextDouble();

            System.out.print("Digite o sexo da " + i + "ª *M/F: ");
            sexo = input.next();

            if (altura > maiorAltura) {
                maiorAltura = altura;
            }
            if (altura < menorAltura) {
                menorAltura = altura;
            }
            if (sexo.equals("M")) {
                somaAlturasHomens += altura;
                numeroHomens++;
            } else {
                numeroMulheres++;
            }

        }

        mediaAlturasHomens = somaAlturasHomens / numeroHomens;

        System.out.println("Maior altura: " + maiorAltura);
        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Média de altura dos homens: " + mediaAlturasHomens);
        System.out.println("Número de mulheres: " + numeroMulheres);

    }

}
