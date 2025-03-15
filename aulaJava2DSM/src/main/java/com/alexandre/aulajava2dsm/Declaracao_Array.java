/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alexandre.aulajava2dsm;

/**
 *
 * @author Alexandre
 */
public class Declaracao_Array {
    public static void main(String[] args) {
        
        //[] - são inseridos em uma variável que referecia um array
        int[] a = new int[4];
        
        //OUTRA MANEIRA DE FAZER UMA DECLARAÇÃO DE ARRAY
        int[] b;
        b = new int[10];
        
        //DECLARANDO VÁRIOS ARRAYS
        int[] r = new int[44], k = new int[23];
        
        //{} - inicializar valores em um array sua declaração
        int[] iniciaValores = {12,32,55,88,99};
        
        //DECLARA UM ARRAY DE INTEIROS
        int[] meuArray;
        //ALOCA MEMÓRIA PARA 10 INTEIROS
        meuArray = new int[10];       
        //INICIALIZA O PRIMEIRO ELEMENTO
        meuArray[0] = 100;
        meuArray[1] = 88;
        meuArray[2] = 77;
        meuArray[3] = 55;
        meuArray[4] = 66;
        meuArray[5] = 11;
        meuArray[6] = 33;
        meuArray[7] = 22;
        meuArray[8] = 44;
        meuArray[9] = 99;
        //meuArray[10] = 564; esoura a pilha pois não existe o índice 10
        
        System.out.println(meuArray[8]);
        System.out.println(meuArray[5]);
    }
}
