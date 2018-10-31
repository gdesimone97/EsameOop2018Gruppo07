/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2018.itinere1.gruppo07;

import oop2018.itinere1.gruppo07.azioni.Azione;
import oop2018.itinere1.gruppo07.condizioni.Condizione;

/**
 *
 * @author gruppo07
 */
public class Regola {
    
    private Condizione condizione;
    private Azione azione;

    public Regola(Condizione condizione, Azione azione) {
        this.condizione = condizione;
        this.azione = azione;
    }

    public Condizione getCondizione() {
        return condizione;
    }

    public Azione getAzione() {
        return azione;
    }
   public boolean applica(){
       if(this.condizione)
   }
    
    
    
}
