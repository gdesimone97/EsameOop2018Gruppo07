/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2018.itinere1.gruppo07.azioni;

import oop2018.itinere1.gruppo07.dispositivi.Attuatore;

/**
 *
 * @author gruppo07
 */
public class ImpostaStatoAccensione implements Azione{
    Attuatore attuatore;
    boolean setOn;
    
    public ImpostaStatoAccensione(Attuatore attuatore, boolean setOn){
        this.attuatore = attuatore;
        this.setOn = setOn;
    }

    @Override
    public void esegui(){
        if(setOn)
            this.attuatore.accendi();
        else
            this.attuatore.spegni();
    }

    @Override
    public String toString() {
        return "ImpostaStatoAccensione{" + "attuatore=" + attuatore + ", setOn=" + setOn + '}';
    }
    
    
}
