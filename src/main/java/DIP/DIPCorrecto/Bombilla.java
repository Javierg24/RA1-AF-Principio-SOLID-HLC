/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIP.DIPCorrecto;

/**
 *
 * @author Javier Ruiz Gomez
 */
public class Bombilla implements Encendible {

    @Override
    public void encender() {
        System.out.println("La bombilla está encendida");
    }

    @Override
    public void apagar() {
        System.out.println("La bombilla está apagada");
    }
}
