package com.therealbatman.ApiRest.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "funcionario")
public class Funcionario extends AbstractEntity {

    private String nome, email, placa_funcionario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaca_funcionario() {
        return placa_funcionario;
    }

    public void setPlaca_funcionario(String placa_funcionario) {
        this.placa_funcionario = placa_funcionario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", placa_funcionario='" + placa_funcionario + '\'' +
                '}';
    }
}
