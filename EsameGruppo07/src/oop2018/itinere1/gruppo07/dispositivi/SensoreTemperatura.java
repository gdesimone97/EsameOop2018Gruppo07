/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2018.itinere1.gruppo07.dispositivi;

/**
 *
 * @author Gennaro
 */
public class SensoreTemperatura extends Sensore {
    
    public SensoreTemperatura(int id) {
        super(id);
    }

    @Override
    public String toString() {
        return " - Tipo: Sensore di temperatura";
    }
    
    
}
