/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ISPCorrecta;

/**
 *
 * @author Javier Ruiz Gomez
 */
public class HumanWorker implements Workable, Eatable {

    @Override
    public void work() {
        System.out.println("Human Working...");
    }

    @Override
    public void eat() {
        System.out.println("Human Eating...");
    }
}
