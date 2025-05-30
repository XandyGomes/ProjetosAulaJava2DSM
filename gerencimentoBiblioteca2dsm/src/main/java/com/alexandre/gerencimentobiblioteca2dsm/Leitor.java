/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alexandre.gerencimentobiblioteca2dsm;

/**
 *
 * @author Alexandre
 */
public class Leitor extends Pessoa {

    private String codigo;

    public Leitor(String nome, String dataNascimento, String endereco, String telefone, String email, String codigo) {
        super(nome, dataNascimento, endereco, telefone, email);
        this.codigo = codigo;
    }

    // Getters e setters para codigo
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

}
