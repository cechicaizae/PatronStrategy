/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategy;

/**
 *
 * @author ce.christian
 */
public class AreaCirculo implements IArea {
    private final float radio;
    
    public AreaCirculo(float radio){
        this.radio = radio;
    }
    
    @Override
    public float calculaArea() {
        return (float) (Math.PI * Math.pow(radio, 2));
    }

    @Override
    public String getResultado() {
        return "El area de circulo es: " + calculaArea();
    }
    
}
