/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alexandre.gestaoescolar2bim;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexandre
 */
public class DiarioDeClasse implements Avaliacao{
    
    private List<Nota> notas = new ArrayList<>();
    private List<Frequencia> frequencias = new ArrayList<>();

    @Override
    public void registrarNota(Aluno aluno, Disciplina disciplina, double nota) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void registrarFrequencia(Aluno aluno, Disciplina disciplina, boolean presente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public List<Frequencia> getFrequencias() {
        return frequencias;
    }

    

    
}
