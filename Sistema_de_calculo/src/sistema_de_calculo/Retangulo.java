/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_de_calculo;

/**
 *
 * @author cacal
 */
public class Retangulo {
    Double base;
    Double altura;
    
    public void calcAreaR(){
        Double area = (base * altura);
        System.out.println("A area do retangulo e de: "+ area );
        
    }
    
    public void calcPerimetroR(){
        Double perimetro = (base + altura)*2;
        System.out.println("O perimetro do retangolo e de: "+ perimetro + "\n");
    }
}
