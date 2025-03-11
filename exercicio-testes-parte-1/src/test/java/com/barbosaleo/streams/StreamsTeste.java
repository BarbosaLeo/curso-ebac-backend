/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
/**
 *
 * @author Leonardo
 */
public class StreamsTeste {
    
    @Test
    public void testeLista(){
        String entrada = "Luciano - m,Beatriz -F,Marcelo-M,Mateus - M,Vanessa-f,Renato - m,Carla - F,Marcos-m,Amanda - F";
        List<Pessoa> pessoas = new ArrayList<>();
        for(String pessoa : entrada.split(",")){
            pessoas.add(new Pessoa(pessoa.split("-")[0].trim(), pessoa.split("-")[1].trim().toUpperCase()));
        }
        
        List<Pessoa> mulheres = pessoas.stream()
                .filter(p -> p.getGenero().equals("F"))
                .collect(Collectors.toList());
        
        mulheres.forEach((p)->{
            char genero = p.getGenero().charAt(0);
            Assertions.assertEquals('F', genero);
        });
    }
    
}
