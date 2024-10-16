/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIP.DIPCorrecto;

/**
 *
 * @author Javier Ruiz Gomez
 */
// Clase Interruptor que ahora depende de la abstracción (cumple con el DIP)
public class Interruptor {

    private Encendible dispositivo;

    public Interruptor(Encendible dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void operar() {
        dispositivo.encender();
        // Más tarde: dispositivo.apagar();
    }
}
