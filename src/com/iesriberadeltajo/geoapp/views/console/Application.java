/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iesriberadeltajo.geoapp.views.console;
import com.iesriberadeltajo.geoapp.models.business.entities.Circulo;
import com.iesriberadeltajo.geoapp.models.business.entities.Rectangulo;
import com.iesriberadeltajo.geoapp.models.business.entities.Esfera;
import com.iesriberadeltajo.geoapp.models.business.entities.Cuadrado;
/**
 *
 * @author Profesor
 */
public class Application {
    public static void main(String[] args) {
        //Capa de presentación de nuestra app
        Cuadrado cua1 = new Cuadrado(4);
        Esfera Esfera1 = new Esfera(5.0);
        Rectangulo Rect1 = new Rectangulo(45,25);
        Circulo Circulo1 = new Circulo(10);
        System.out.println("Cuadrado-----");
        System.out.printf("Lado: %.2f %n",cua1.getSide());
        System.out.printf("Su area es : %.2f %n",cua1.getArea());
        System.out.printf("y su perímetro: %.2f %n",cua1.getPerimeter());
        
        System.out.println("Esfera-----");
        System.out.printf("radio: %.2f %n",Esfera1.getRadius()); 
        System.out.println("círculo-----");
        System.out.printf("radio: %.2f %n",Circulo1.getRadius()); 
        
    }
}
