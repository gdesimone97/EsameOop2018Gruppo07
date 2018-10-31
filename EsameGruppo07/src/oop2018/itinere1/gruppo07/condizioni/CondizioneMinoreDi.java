/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2018.itinere1.gruppo07.condizioni;
import oop2018.itinere1.gruppo07.dispositivi.Sensore;
/**
 *
 * @author desio
 */
public class CondizioneMinoreDi implements Condizione {
    private Sensore sensore;
    private double valoreDiConfronto;

    public CondizioneMinoreDi(Sensore sensore, double valoreDiConfronto) {
        this.sensore = sensore;
        this.valoreDiConfronto = valoreDiConfronto;
    }

    @Override
    public boolean verifica() {
        return sensore.getValore()<this.valoreDiConfronto;
    }
    
    
}
