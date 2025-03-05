/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo.generics;

/**
 *
 * @author leona
 */
public class Honda extends Veiculo{
    
    private final Integer idChassis;
    
    public Honda(Integer idChassis){
        this.idChassis = idChassis;
    }

    @Override
    public String getMarca() {
        return "Honda";
    }

    @Override
    public Integer getIdChassis() {
        return this.idChassis;
    }
    
}
