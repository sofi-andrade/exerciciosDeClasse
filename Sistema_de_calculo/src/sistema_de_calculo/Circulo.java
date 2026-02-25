/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_de_calculo;

/**
 *
 * @author cacal
 */
public class Circulo {
        double raio;
        
        
        public void calcarea(){
          double area = (raio* raio)*3.14;
          System.out.println("A area do circulo e de: "+ area);
        
        }
        public void calcperimetro(){
          double perimetro= ((raio*2)*3.14);
          System.out.println("O perimetro do circulo e de: "+ perimetro + "\n");
        }
}
