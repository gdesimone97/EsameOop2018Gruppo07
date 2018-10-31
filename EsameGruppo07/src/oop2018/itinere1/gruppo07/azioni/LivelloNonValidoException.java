/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2018.itinere1.gruppo07.azioni;

/**
 *
 * @author desio
 */
public class LivelloNonValidoException extends Exception {

    /**
     * Creates a new instance of <code>LivelloNonValidoException</code> without
     * detail message.
     */
    public LivelloNonValidoException() {
        super("Problema riscontrato: ");
    }

    @Override
    public String toString() {
        return getMessage()+"Livello impostato non valido";
    }

}
