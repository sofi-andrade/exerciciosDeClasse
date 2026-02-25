/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author cacal
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        
        cliente1.nome_cliente = "Brenda";
        cliente1.email_cliente = "Brenda@gmail";
        cliente1.tel_cliente = "(11)99999-9999";
        cliente1.quantProduto = 2;
        cliente1.valorProduto= 200.50;
      
        cliente2.nome_cliente = "Fabricio";
        cliente2.email_cliente ="Fabrisinho@gmail";
        cliente2.tel_cliente = "(11) 66666-5858";
        cliente2.quantProduto = 4;
        cliente2.valorProduto = 500;
  
        
        System.out.println("-- INFORMACAO DO CLIENTE 1");
        cliente1.infocliente();
        System.out.println("-- INFORMACAO DA COMPRA --");
        cliente1.somadacompra();
        cliente1.infodacompra();
        
         System.out.println("-- INFORMACAO DO CLIENTE 2 -- ");
         cliente2.infocliente();
         System.out.println("-- INFORMACAO DA COMPRA --");
         cliente2.somadacompra();
         cliente2.infodacompra();
         
 
        
    }
    
}
