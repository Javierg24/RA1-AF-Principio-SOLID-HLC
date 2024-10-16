/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ISP.ISPIncorrecta;

/**
 *
 * @author Javier Ruiz Gomez
 */
public class HumanWorker implements Worker {

    @Override
    public void work() {
        System.out.println("Working...");

    }

    @Override
    public void eat() {
        System.out.println("Eating...");
    }
}

