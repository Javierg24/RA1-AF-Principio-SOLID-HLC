/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SimulacroCorrecto;

/**
 *
 * @author Javier Ruiz Gomez
 */
// Clase que representa una lámpara (violación del SRP y del OCP)
public class Lampara implements Dispositivo {

    private boolean encendida = false;
    private Logs logger;

    public Lampara(Logs logger) {
        this.logger = logger;
    }

    @Override
    public void encender() {
        encendida = true;
        System.out.println("Lámpara encendida");
        logger.guardarLog("Lámpara encendida");
    }

    @Override
    public void apagar() {
        encendida = false;
        System.out.println("Lámpara apagada");
        logger.guardarLog("Lámpara apagada");
    }

    @Override
    public boolean isEncendido() {
        return encendida;
    }

}
