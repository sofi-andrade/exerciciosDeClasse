/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication8;

/**
 *
 * @author cacal
 */
public class Aluguel {
    String nome_cliente;
    String mod_veiculo;
    int dias_de_uso;
    double valor_aluguel;
    
    public void calcaluguel(){
        
            switch(mod_veiculo){
            
            case "Fiat" -> valor_aluguel = dias_de_uso * 140;
            
            case "Chevrolet" -> valor_aluguel = dias_de_uso * 180;
               
            case "BMW" -> valor_aluguel = dias_de_uso * 700;
            
            default -> System.out.println("Veiculo não encontrado");
            
                       
                 }
    }
        

    public void infoalguel(){
      System.out.println("Nome do cliente: "+ nome_cliente + "\n" + "Veiculo escolhido: " + mod_veiculo + "\n" +
     "Dias de aluguel: " + dias_de_uso + "\n" + "Valor total do aluguel: " + valor_aluguel );
       
    }          
            
            }
    
            
    

