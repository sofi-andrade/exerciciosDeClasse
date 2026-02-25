/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;

/**
 *
 * @author cacal
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Tarefa tarefa1 = new Tarefa();
        
        tarefa1.nome_tarefa = "Desenvolvimento de Sistema de Biblioteca";
        tarefa1.descricao = "Criar um sistema em Java para cadastrar livros, usuários e controlar empréstimos e devoluções.";
        tarefa1.prazo= "19/02/2026";
        tarefa1.status = "Pendente";
        
        tarefa1.mostrardescriacao();
        tarefa1.status();
        
                
    }
    
}
