/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.barbosaleo.generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leona
 */
public class Generics {

    public static void main(String[] args) {
        
        Veiculos<Veiculo> veiculoList = new Veiculos<>();
        veiculoList.addVeiculo(new Honda(1));
        veiculoList.addVeiculo(new Honda(3));
        veiculoList.addVeiculo(new Chevrolet(45));
        
        System.out.println(veiculoList.getMarcaVeiculo(1));
        System.out.println(veiculoList.getMarcaVeiculo(45));
        
    }
}
