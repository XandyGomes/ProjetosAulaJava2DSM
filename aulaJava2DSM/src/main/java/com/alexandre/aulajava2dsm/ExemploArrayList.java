/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alexandre.aulajava2dsm;

import java.util.ArrayList;

/**
 *
 * @author Alexandre
 */
public class ExemploArrayList {
    public static void main(String[] args) {
        
        //Criando uma ArrayList sem definir o tamanho inicial
        ArrayList<String> lista = new ArrayList<>();
        
        //Adicionnando elementos à lista
        lista.add("Alexandre");
        lista.add("José");
        lista.add("João");
        lista.add("Maria");
        lista.add("Eduardo");
        lista.add("Roberto");
        
        //Acessando elementos da lista
        for(String elementos : lista ){
            System.out.println(elementos);
        }
        
        System.out.println("Apenas a posição de Alexandre:" + lista.get(0));
        
        System.out.println("Tamanho da lista:" + lista.size());
        
    }
}
