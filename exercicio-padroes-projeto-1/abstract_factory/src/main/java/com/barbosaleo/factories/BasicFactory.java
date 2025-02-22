/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo.factories;

import com.barbosaleo.moveis.Cadeira;
import com.barbosaleo.moveis.CadeiraBasico;
import com.barbosaleo.moveis.Mesa;
import com.barbosaleo.moveis.MesaBasico;
import com.barbosaleo.moveis.Sofa;
import com.barbosaleo.moveis.SofaBasico;

/**
 *
 * @author leona
 */
public class BasicFactory implements AbstractFactory {

    @Override
    public Cadeira criarCadeira() {
        return new CadeiraBasico();
    }

    @Override
    public Mesa criarMesa() {
        return new MesaBasico();
    }

    @Override
    public Sofa criarSofa() {
        return new SofaBasico();
    }
    
}
