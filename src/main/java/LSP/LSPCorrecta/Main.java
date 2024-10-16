/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package LSP.LSPCorrecta;

/**
 *
 * @author Javier Ruiz Gomez
 */
public class Main {
    public static void main(String[] args){
        Gorrion oGorrion = new Gorrion("Juanito");
        oGorrion.volar();
        Avestruz oAvestruz = new Avestruz("pepito");
        System.out.println(oAvestruz.getNombre());
    }
}
