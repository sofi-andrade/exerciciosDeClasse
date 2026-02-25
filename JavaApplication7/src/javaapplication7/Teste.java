/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author cacal
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Banco cliente1 = new Banco();
        Banco cliente2 = new Banco();
        
        System.out.println("-------------------------");
        System.out.println("Sistema de conta bancaria");
        System.out.println("-------------------------");
        
        cliente1.nome = "Millena";
        cliente1.numConta = 700000;
        cliente1.saldo = 700;
        
        cliente2.nome = "Carlos";
        cliente2.numConta = 4000000;
        cliente2.saldo = 300;
        
        System.out.println("Cliente 1");
        cliente1.infoDoCliente();
        System.out.println("Cliente 2");
        cliente2.infoDoCliente();
        cliente2.trenferir(cliente1, 200);
        
    }
    
    
}
