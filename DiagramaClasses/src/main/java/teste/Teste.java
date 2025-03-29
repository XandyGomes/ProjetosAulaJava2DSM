/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import implementacao.Automovel;
import implementacao.Motocicleta;
import implementacao.Veiculo;

/**
 *
 * @author Alexandre
 */
public class Teste {
    public static void main(String[] args) {
        Automovel carro = new Automovel();
        Motocicleta moto = new Motocicleta();
        
        System.out.println("==Automóvel==");
        carro.ligar();
        carro.acelerar(120);
        carro.frear(0);
        carro.desligar();
        carro.setValor(50000.0);
        System.out.println("Valor de venda à vista do automóvel é: "+ Veiculo.calcularValorVenda(carro));

        System.out.println("\n==Motocicleta==");
        moto.ligar();
        moto.acelerar(80);
        moto.frear(15);
        moto.frear(0);
        moto.desligar();
        moto.setValor(15000.0);
        System.out.println("Valor de venda à vista da motocicleta é: "+ Veiculo.calcularValorVenda(moto));
    }
}
