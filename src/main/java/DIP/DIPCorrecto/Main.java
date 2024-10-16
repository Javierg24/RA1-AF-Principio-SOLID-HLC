/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package DIP.DIPCorrecto;

/**
 *
 * @author Javier Ruiz Gomez
 */
public class Main {
    public static void main(String[] args){
        Bombilla oBombilla = new Bombilla();
        oBombilla.encender();
        oBombilla.apagar();
        Interruptor oInterruptor = new Interruptor(oBombilla);
        oInterruptor.operar();
    }
}
