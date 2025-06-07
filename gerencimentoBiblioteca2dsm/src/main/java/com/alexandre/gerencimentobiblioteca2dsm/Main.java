/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alexandre.gerencimentobiblioteca2dsm;

/**
 *
 * @author Alexandre
 */
public class Main {
    public static void main(String[] args) {
        //criar os objetos dos autores
        Autor autor1 = new Autor("J.K. Rowling");
        Autor autor2 = new Autor("George R.R. Martin");
        Autor autor3 = new Autor("Machado de Assis");
        
        //criar os objetos dos livros
        Livro livro1 = new Livro("9780439", "Harry Potter e a Pedra Filosofal", 1997, "Bloomsbury", "Fantasia", 5);
        Livro livro2 = new Livro("9780440", "A Guerra dos Tronos", 1996, "Bantam Spectra", "Fantasia", 3);
        Livro livro3 = new Livro("9780450", "Dom Casmurro", 1899, "Companhia das Letras", "Romance", 2);
   
        //criar os objetos dos leitores
        Leitor leitor1 = new Leitor("Alexandre Gomes", "03/10/1980", "Rua A", "(16) 9999-9999", "alexandre@email.com", "L001");
        Leitor leitor2 = new Leitor("Eduardo Fernandes", "06/06/1995", "Rua B", "(16) 9999-8888", "eduardo@email.com", "L002");
        
        //criar objeto de funcionários
        Funcionario funcionario1 = new Funcionario("Pedro Santos", "01/01/2000", "Rua  C", "(16) 8888-9898", "pedro@email.com", "Bibliotecário");
    
        //criar um objeto biblioteca
        Biblioteca biblioteca = new Biblioteca();
        
        //associar livro ao autor
        livro1.adicionarAutor(autor1);
        livro2.adicionarAutor(autor2);
        livro3.adicionarAutor(autor3);
        
        //adicionar livro há biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
    
        //realizar empréstimos
        biblioteca.realizarEmprestimo(leitor1, livro1, funcionario1);
        biblioteca.realizarEmprestimo(leitor2, livro2, funcionario1);
    
        //registrar devoluções
        biblioteca.registrarDevolucao(biblioteca.emprestimos.get(0));
        
        //realizar pesquisas
        System.out.println("\nPesquisando livro por título 'Harry Potter: ");
        biblioteca.pesquisarLivroPorTitulo("Harry Potter e a Pedra Filosofal");
 
        System.out.println("\nPesquisando livro por autor 'Machado de Assis: ");
        biblioteca.pesquisarLivroPorAutor("Machado de Assis");
    
        //Listagem de livros disponíveis 
        System.out.println("\nLivros disponíveis");
        biblioteca.listarLivrosDisponiveis();

        //Listagem de Empréstimos em aberto
        System.out.println("\nEmpréstimos em aberto");
        biblioteca.listarEmprestimosEmAberto();
    }
}
