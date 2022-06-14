/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategy;

/**
 *
 * @author ce.christian
 */
public class AreaTriangulo implements IArea{
private final float base;
private final float altura;

public AreaTriangulo(float base, float altura){
    this.base = base;
    this.altura = altura;
}

    @Override
    public float calculaArea() {
        return (base*altura) / 2;
    }

    @Override
    public String getResultado() {
        return "El area del triangulo es: " + calculaArea();
    }
    
}
