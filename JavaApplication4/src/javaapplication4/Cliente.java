/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author cacal
 */
public class Cliente {
    
    String nome_cliente;
    String email_cliente;
    String tel_cliente;
    double valorProduto;
    int quantProduto;
    double somatot;
 
    
    public void infocliente(){
        System.out.println("Cliente:"+ nome_cliente+ "\n" + "Email:"+ email_cliente + "\n" + "Telefone:" + tel_cliente + "\n" );
    }
    public void somadacompra(){
      
       somatot = quantProduto * valorProduto;
       System.out.println("A soma total da compra foi de:"+ somatot);
        
    
    }
    public void infodacompra(){
        System.out.println("A compra do(a) " + nome_cliente + " foi realizada com sucesso!! \n ");
    }
   
}
