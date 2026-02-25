/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author cacal
 */
public class Hospede {
    String nome_hospede;
    String email_hospede;
    String tel_hospede;
    String data_checkin;
    String tipo_do_quarto;
    int dias_hospedagem;
    double toth;
    
    public void valor_hospedagem(){
        
         String t_quarto = tipo_do_quarto;
       
         if ( "Suite padrao".equals(t_quarto)) {
            
           toth= dias_hospedagem * 120.00;
            
             } else if ( "Quarto luxo".equals(t_quarto)){
                
                toth = dias_hospedagem * 200.00;
                
             }else if (" Suite master".equals(t_quarto)){
                      toth = dias_hospedagem * 350;  
                      
                        }
       
    }
    
    public void infodohospede(){
        
       System.out.println("Hospede: " +  nome_hospede + "\n" + "Email: " + email_hospede + "\n" + "Telefone: " + tel_hospede + "\n"  );
        
    }
    
    public void infodahospedagem(){
        System.out.println("Data do check-in: " + data_checkin + "\n" + "Dias de hospedagem: " + dias_hospedagem + "\n" 
        + "Quarto escolhido: " + tipo_do_quarto + "\n" + "Valor total da estadia: " + toth + "\n");
        
    }
    }
    
