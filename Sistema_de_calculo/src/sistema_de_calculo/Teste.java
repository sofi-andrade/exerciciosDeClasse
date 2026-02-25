/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema_de_calculo;

/**
 *
 * @author cacal
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo();
        Retangulo retangulo1 = new Retangulo();
        System.out.println("--------------------------------------------");
        System.out.println("---SISTEMA DE CALCULO DE AREA E PERIMETRO---");
        System.out.println("--------------------------------------------");
        
        System.out.println("-CIRCULO-");
        circulo1.raio=15;
        circulo1.calcarea();
        circulo1.calcperimetro();
        
        System.out.println("-RETANGULO-");
        retangulo1.altura = 5.0;
        retangulo1.base = 12.0; 
        retangulo1.calcAreaR();
        retangulo1.calcPerimetroR();
    }
    
}
