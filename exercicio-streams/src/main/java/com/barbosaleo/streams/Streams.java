/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.barbosaleo.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Leonardo
 */
public class Streams {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        /*
            Input:
            Luciano - m,Beatriz -F,Marcelo-M,Mateus - M,Vanessa-f,Renato - m,Carla - F,Marcos-m,Amanda - F
         */

        System.out.println("Insira nome da pessoa e sexo separado por vírgula: ");
        System.out.println("Ex Amanda - F, Ricardo - M,...");
        String entrada = s.nextLine();
        System.out.println();
        List<Pessoa> pessoas = new ArrayList<>();
        for(String pessoa : entrada.split(",")){
            pessoas.add(new Pessoa(pessoa.split("-")[0].trim(), pessoa.split("-")[1].trim().toUpperCase()));
        }
        
        List<Pessoa> mulheres = pessoas.stream()
                .filter(p -> p.getGenero().equals("F"))
                .collect(Collectors.toList());
        
        mulheres.forEach(System.out::println);
        
        s.close();
        
    }
}
