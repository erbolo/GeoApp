/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iesriberadeltajo.geoapp.models.business.entities;

/**
 *
 * @author Daniel de la Torre Lamana <daniel_torre@hotmail.com>
 */
public class Rombo {
    
    private double dMayor, dMenor;
 
    public Rombo()

    {

        this.setdMayor(1.0);

        this.setdMenor(1.0);

    }
   

public Rombo(double dMayor, double dMenor)

    {

        this.setdMayor(dMayor);

        this.setdMenor(dMenor);

    }
   

public double getArea()

    { return this.getdMayor() * this.getdMenor()/2.0;
    }

   

public double getPerimetro()

    {
        double lado = Math.sqrt(Math.pow(getdMayor(),2)/2.0+Math.pow(getdMenor(),2)/2.0);
        return lado * 4;
    }

    /**
     * @return the dMayor
     */
    public double getdMayor() {
        return dMayor;
    }

    /**
     * @param dMayor the dMayor to set
     */
    public void setdMayor(double dMayor) {
        this.dMayor = dMayor;
    }

    /**
     * @return the dMenor
     */
    public double getdMenor() {
        return dMenor;
    }

    /**
     * @param dMenor the dMenor to set
     */
    public void setdMenor(double dMenor) {
        this.dMenor = dMenor;
    }

}
    

