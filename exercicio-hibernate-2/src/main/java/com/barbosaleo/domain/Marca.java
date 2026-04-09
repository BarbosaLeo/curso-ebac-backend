/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.util.List;

/**
 *
 * @author Leonardo
 */
@Entity
@Table(name = "TB_MARCA")
public class Marca {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="curso_sq")
    @SequenceGenerator(name="curso_sq", sequenceName="sq_curso", initialValue=1, allocationSize = 1)
    private Long id;
    
    @Column(name="CODIGO", length = 10, nullable=false, unique=true)
    private String codigo;
    
    @Column(name="nome", length = 50, nullable=false, unique=true)
    private String nome;
    
    @OneToMany(mappedBy = "marca")
    private List<Carro> carros;
    
    public Marca(){}
    
    public Marca(String n, String c){
        this.nome = n;
        this.codigo = c;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }
    
    
}
