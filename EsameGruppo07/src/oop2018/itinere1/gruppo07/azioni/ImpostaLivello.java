/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2018.itinere1.gruppo07.azioni;
import oop2018.itinere1.gruppo07.dispositivi.*;

/**
 *
 * @author gruppo07
 */
public class ImpostaLivello implements Azione {
    AttuatoreRegolabile ar;
    double livelloDaImpostare;
    
    public ImpostaLivello(AttuatoreRegolabile ar, double livelloDaImpostare){
        this.ar = ar;
        this.livelloDaImpostare = livelloDaImpostare;
    }
    @Override
    public void esegui() throws LivelloNonValidoException{
            this.ar.setLivello(this.livelloDaImpostare);
    }

    @Override
    public String toString() {
        return "Tipo azione: Impostazione livello - attivata per: " + this.ar.toString();
    }
    
   
}
