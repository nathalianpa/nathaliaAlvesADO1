/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nathaliaalvesado1;

/**
 *
 * @author nathalia
 */
public class Cachorro {
    private String nome;
    private String cor;
    private String raca;
    
    public Cachorro() {
        
    }
    
    public Cachorro(String nome) {
        this.nome = nome;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the raca
     */
    public String getRaca() {
        return raca;
    }

    /**
     * @param raca the raca to set
     */
    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    public void latir() {
        System.out.println("au, au.");
    }
    
    public void rolarNaLama() {
        setCor("marrom");
    }
}
