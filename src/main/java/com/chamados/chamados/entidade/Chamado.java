package com.chamados.chamados.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Chamado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   @Column(nullable=false)
    private String nome;
    @Column(nullable=false)
    private String whatsapp;
    private String endereco;
    @Column(nullable=false)
    private String equipamento;
    private String marca;
    private String modelo;
    @Column(nullable=false)
    private String defeito;
    private String fechado;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getWhatsapp() {
        return whatsapp;
    }
    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getEquipamento() {
        return equipamento;
    }
    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getDefeito() {
        return defeito;
    }
    public void setDefeito(String defeito) {
        this.defeito = defeito;
    }
    public String getFechado() {
        return fechado;
    }
    public void setFechado(String fechado) {
        this.fechado = fechado;
    }

    
}
