/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIP.DIPIncorrecto;

/**
 *
 * @author Javier Ruiz Gomez
 */
public class Interruptor {

    private Bombilla bombilla;

    public Interruptor(Bombilla bombilla) {
        this.bombilla = bombilla;
    }

    public void operar() {
        bombilla.encender();
        // Más tarde: bombilla.apagar();
    }
}
