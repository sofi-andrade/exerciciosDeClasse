/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;

/**
 *
 * @author cacal
 */
public class Tarefa {
        String nome_tarefa;
        String descricao;
        String prazo;
        String status; 
        
        public void mostrardescriacao(){
            System.out.println("Nome do trabalho:" + nome_tarefa + "\n" + "Descricao do trabalho:" + descricao);
        }
        
        public void status(){
            System.out.println("Prazo: " + prazo);
            
            if ("Pendente".equals(status) ){
                System.out.println("O trabalho esta: Pendente");
            }else if ( "Concluida".equals(status)) {
                System.out.println("O trabalho esta: Concluido");
            }
        }
        
    
    
}
