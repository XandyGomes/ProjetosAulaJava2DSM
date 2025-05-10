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
public class Aluno extends Pessoa {

    private String matricula;

    public Aluno(String nome, Date dataNascimento,
            String endereco, String matricula) {
        super(nome, dataNascimento, endereco);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}
