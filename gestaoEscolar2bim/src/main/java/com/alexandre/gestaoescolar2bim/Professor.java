/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alexandre.gestaoescolar2bim;

import java.util.Date;

/**
 *
 * @author Alexandre
 */
public class Professor extends Pessoa {

    private String registro;

    public Professor(String nome, Date dataNascimento, 
            String endereco, String registro) {
        super(nome, dataNascimento, endereco);
        this.registro = registro;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

}
