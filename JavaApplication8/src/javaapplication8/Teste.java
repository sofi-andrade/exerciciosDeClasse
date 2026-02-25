/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication8;

/**
 *
 * @author cacal
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          System.out.println("--VEICULOS DISPONIVEIS--");
       System.out.println("-Fiat \n-Chevrolet \n-BMW");
       System.out.println("-------------------------");
       
       Aluguel cliente1 = new Aluguel();
       
       cliente1.nome_cliente= "Ricardo";
       cliente1.dias_de_uso = 7;
       cliente1.mod_veiculo="Fiat";
       
       cliente1.calcaluguel();
       cliente1.infoalguel();
          
        
      
          
       
    }
    
}
