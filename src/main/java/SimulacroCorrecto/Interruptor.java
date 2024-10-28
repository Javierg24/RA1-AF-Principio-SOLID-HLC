/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SimulacroCorrecto;


/**
 *
 * @author Javier Ruiz Gomez
 */
public class Interruptor {

    private Dispositivo dispositivo;

    public Interruptor(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void presionar() {
        if ((dispositivo.isEncendido())) {
            dispositivo.apagar();
        } else {
            dispositivo.encender();
        }
    }

}
