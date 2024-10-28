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
public class Ventilador implements Dispositivo{

    private boolean encendida = false;
    private Logs logger;

    public Ventilador(Logs logger) {
        this.logger = logger;
    }
        

    @Override
    public void encender() {
        encendida = true;
        System.out.println("Ventilador encendido");
        logger.guardarLog("Ventilador encendido");
    }

    @Override
    public void apagar() {
        encendida = false;
        System.out.println("Ventilador apagado");
        logger.guardarLog("Ventilador apagado");
    }
    
    @Override
    public boolean isEncendido() {
        return encendida;
    }
  
}
