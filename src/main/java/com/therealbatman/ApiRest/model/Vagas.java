package com.therealbatman.ApiRest.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="vagas")
public class Vagas extends AbstractEntity {
    private int vagasDisponiveis;

    public int getVagasDisponiveis() {
        return vagasDisponiveis;
    }

    public void setVagasDisponiveis(int vagasDisponiveis) {
        this.vagasDisponiveis = vagasDisponiveis;
    }
}
