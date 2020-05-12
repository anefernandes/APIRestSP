package com.therealbatman.ApiRest.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "visitante")
public class Visitante extends AbstractEntity {
    private String nome, cpf, placa_visitante, celular;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPlaca_visitante() {
        return placa_visitante;
    }

    public void setPlaca_visitante(String placa_visitante) {
        this.placa_visitante = placa_visitante;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}
