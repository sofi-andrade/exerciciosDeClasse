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
        
            if("Fiat".equals(mod_veiculo)){
                valor_aluguel = dias_de_uso * 140;
               
            }else if("Chevrolet".equals(mod_veiculo)){
                valor_aluguel = dias_de_uso * 180;
              
            }else if("BMW".equals(mod_veiculo)){
                valor_aluguel = dias_de_uso * 700;
             
            }else{ 
                System.out.println("Veiculo não encontrado");
                
   
            }
    }
    public void infoalguel(){
      System.out.println("Nome do cliente: "+ nome_cliente + "\n" + "Veiculo escolhido: " + mod_veiculo + "\n" +
     "Dias de aluguel: " + dias_de_uso + "\n" + "Valor total do aluguel: " + valor_aluguel );
       
    }          
            
            }
    
            
    

