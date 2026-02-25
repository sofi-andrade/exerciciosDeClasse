/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author cacal
 */
public class Banco {
    
    String nome;
    int numConta;
    double saldo;
    
   
    public void depositar ( double valor){
        saldo = saldo + valor;
        System.out.println("- Deposito de: R$ " + valor + " realizado com sucesso!!  \n ");
    }
    
    public void sacar (double valor){
        
        if(saldo >= valor){
        saldo = saldo - valor;
        System.out.println("- Saque de: R$ " + valor + " realizado com sucesso!!  \n ");
    }else{
             System.out.print("Saldo insuficiente!!  \n ");
        }
    }
    
    public void trenferir(Banco destino , double valor){
        if (saldo >= valor){
            saldo = saldo - valor;
            destino.saldo = destino.saldo + valor;
            System.out.println("Transferencia de " + valor + " realizada com sucesso para: " + destino.nome );
        }else{
             System.out.println("Saldo insuficiente!!  \n ");
        }
    }
    
    public void infoDoCliente(){
         System.out.println ("Nome do cliente: " + nome + "\n" + "Numero da conta: " + numConta + "\n" + "Saldo: " + saldo + "\n" );
    }
}
    

