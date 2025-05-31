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
public class Secretaria implements Matriculavel {

    private List<Matricula> matriculas = new ArrayList<>();

    @Override
    public void matricular(Aluno aluno, Turma turma) {
       //verificar se o aluno já está matriculado na turma
       for(Matricula matricula : matriculas){
           if(matricula.getAluno().equals(aluno) && matricula.getTurma().equals(turma)){
               System.out.println("Aluno já matriculado nesta turma.");
               return;
           }
       }
       //verificar se há vagas na turma
       if(turma.getAlunos().size() >= 30){
           System.out.println("Turma lotada.");
           return;
       }
       
       Matricula novaMatricula = new Matricula(aluno, turma);
       matriculas.add(novaMatricula);
       turma.getAlunos().add(aluno);
    }

    @Override
    public void cancelarMatricula(Aluno aluno, Turma turma) {
        //encontrar a matricula a ser cancelada
        Matricula matriculaParaCancelar = null;
        for (Matricula matricula : matriculas){
            if(matricula.getAluno().equals(aluno) && matricula.getTurma().equals(turma)){
                matriculaParaCancelar = matricula;
                break;
            }
        }
        //verificar se a matricula existe
        if(matriculaParaCancelar == null ){
            System.out.println("Aluno não matriculado nesta turma");
            return;
        }
        
        //cancelar a matricula
        matriculas.remove(matriculaParaCancelar);
        turma.getAlunos().remove(aluno);
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }
}
