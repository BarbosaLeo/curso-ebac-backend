/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo.generics;

/**
 *
 * @author leonardo
 */
public class Chevrolet extends Veiculo{

    private final Integer idChassis;
    
    public Chevrolet(Integer idChassis){
        this.idChassis = idChassis;
    }

    @Override
    public String getMarca() {
        return "Chevrolet";
    }

    @Override
    public Integer getIdChassis() {
        return this.idChassis;
    }
    
}
