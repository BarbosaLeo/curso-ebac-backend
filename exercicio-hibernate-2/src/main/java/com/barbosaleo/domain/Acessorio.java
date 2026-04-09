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
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.util.List;

/**
 *
 * @author Leonardo
 */
@Entity
@Table(name="TB_ACESSORIO")
public class Acessorio {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="acessorio_sq")
    @SequenceGenerator(name="acessorio_sq", sequenceName="sq_acessorio", initialValue=1, allocationSize = 1)
    private Long id;
    
    @Column(name="CODIGO", length = 10, nullable=false, unique=true)
    private String codigo;
    
    @Column(name="nome", length = 50, nullable=false)
    private String nome;
    
    @Column(name="descricao", length = 50, nullable=false)
    private String descricao;
    
    @ManyToMany(mappedBy="acessorios")
    private List<Carro> carros;

    public Acessorio() {
    }

    public Acessorio(String codigo, String nome, String descricao) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }
    
    
}
