/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import implement.Colaborador;
import implement.Parceiro;

/**
 *
 * @author Alexandre
 */
public class Test {
    public static void main(String[] args) {
        Colaborador c1 = new Colaborador();
        c1.setNome("Alexandre");
        c1.setBairro("Centro");
        c1.setCidade("Franca");
        c1.setCpf("123456789");
        c1.setNumero(123);
        c1.setNasc(1980,10,3);
        
        Parceiro p1 = new Parceiro();
        p1.setNome("Fatec");
        p1.setCidade("Franca");
        p1.setCnpj("1234567890001");
        
        
        System.out.println("Bairro do colaborador "+ c1.getNome() +": "+ c1.getBairro());
        System.out.println("Nascimento do colaborador "+ c1.getNome() +": "+ c1.getNasc());
        System.out.println("Empresa parceira: "+ p1.getNome());
        p1.cadastrar();
        System.out.println("CNPJ da emmpresa "+p1.getNome() + ": "+p1.getCnpj());            
    }       
}
