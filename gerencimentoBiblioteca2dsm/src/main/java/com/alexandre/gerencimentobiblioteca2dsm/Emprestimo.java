/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alexandre.gerencimentobiblioteca2dsm;

import java.text.SimpleDateFormat;

/**
 *
 * @author Alexandre
 */
public class Emprestimo {

    private Leitor leitor;
    private Livro livro;
    private String dataEmprestimo;
    private String dataDevolucao;
    private Funcionario funcionario;

    public Emprestimo(Leitor leitor, Livro livro, Funcionario funcionario) {
        this.leitor = leitor;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.funcionario = funcionario;
    }

    // Getters e setters para todos os atributos
    public Leitor getLeitor() {
        return leitor;
    }

    public void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        return "Emprestimo{"
                + "Leitor=" + leitor.getNome()
                + ", Livro=" + livro.getTitulo()
                + ", Data de Empréstimo=" + dataEmprestimo
                + ", Data de Devolução=" + (dataDevolucao != null ? dataDevolucao : "Ainda não devolvido")
                + ", Funcionário=" + funcionario.getNome()
                + '}';
    }

}
