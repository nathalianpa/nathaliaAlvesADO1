/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nathaliaalvesado1;

import javax.swing.JOptionPane;

/**
 *
 * @author nathalia
 */
public class Main {
    public static void main(String[] args) {
        Cachorro percy = new Cachorro("Percy");
        Cachorro mel = new Cachorro("Mel");
        
        JOptionPane.showMessageDialog(null, "Nome do primeiro cachorro: " + percy.getNome() + "; Nome do segundo cachorro: " + mel.getNome());
    }
    
}
