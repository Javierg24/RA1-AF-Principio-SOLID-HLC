/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package SimulacroCorrecto;



/**
 *
 * @author DAW2
 */
// Interfaz con múltiples responsabilidades (violación del ISP)
public interface Dispositivo {

    void encender();

    void apagar();

    boolean isEncendido();
}
