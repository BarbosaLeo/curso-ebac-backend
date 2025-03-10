/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo.streams;

/**
 *
 * @author Leonardo
 */
public class Pessoa {
    
    public String nome;
    public String genero;
    
    public Pessoa(){
        
    }
    
    public Pessoa(String nome, String genero){
        this.nome = nome;
        this.genero = genero;
    }
    
    public Pessoa(Pessoa pessoa){
        this(pessoa.getNome(), pessoa.getGenero());
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", genero=" + genero + '}';
    }
    
    
}
