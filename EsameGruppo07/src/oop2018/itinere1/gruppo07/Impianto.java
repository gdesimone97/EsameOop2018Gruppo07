/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2018.itinere1.gruppo07;

import java.util.*;
import oop2018.itinere1.gruppo07.dispositivi.*;

/**
 *
 * @author fonzdm
 */
public class Impianto {

    private String nome;
    List<Regola> regole;
    Map<Integer, Dispositivo> dispositivi;

    public Impianto(String nome) {
        this.nome = nome;
        regole = new ArrayList<>();
        dispositivi = new HashMap<>();
    }

    public void add(Regola r) {
        regole.add(r);
    }

    public void applicaRegole() {

        for (Regola r : regole) {
            r.applica();
        }

    }

    public Dispositivo add(Dispositivo d) {
        return dispositivi.put(d.getId(), d);
    }

    public Dispositivo getDispositivo(int id) {
        return dispositivi.get(id);
    }

    @Override
    public String toString() {
        String tmp = "\n=====================\nInformazioni impianto\n=====================\n\nNome: " + nome + "\n\n";
        tmp += "---- Elenco dispositivi ----\n";
        for (Dispositivo d : dispositivi.values()) {
            tmp += d.toString() + "\n";
        }
        
        int i = 1;
        
        tmp += "\n\n---- Elenco regole ----\n";
        for (Regola r : regole) {
            tmp += i++ + " " + r.toString() + "\n";
        }

        return tmp;

    }

}
