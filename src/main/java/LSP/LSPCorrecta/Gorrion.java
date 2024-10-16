/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LSP.LSPCorrecta;

/**
 *
 * @author Javier Ruiz Gomez
 */
public class Gorrion extends Ave implements Volador {

    public Gorrion(String nombre) {
        super(nombre);
    }

    @Override
    public void volar() {
        System.out.println("El gorrión está volando");
    }
}
