/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author cacal
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hospede hospede1 = new Hospede();
        
        hospede1.nome_hospede= "Bianca";
        hospede1.email_hospede= "bianca@gmial.com";
        hospede1.tel_hospede = "(11)66666-8888";
        hospede1.data_checkin = "20/02/26";
        hospede1.dias_hospedagem = 5;
        hospede1.tipo_do_quarto = "Suite padrao";
        
        System.out.println("--Informacoes do hospede--");
        hospede1.infodohospede();
        
        System.out.println("--Informacao da hospedagem--");
        hospede1.valor_hospedagem();
        hospede1.infodahospedagem();
    }
    
}
