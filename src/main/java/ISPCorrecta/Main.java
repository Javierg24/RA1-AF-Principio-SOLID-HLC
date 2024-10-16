/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ISPCorrecta;

/**
 *
 * @author Javier Ruiz Gomez
 */
public class Main {

    public static void main(String[] args) {
        RobotWorker rw = new RobotWorker();
        HumanWorker hw = new HumanWorker();
        rw.work();
        hw.eat();
        hw.work();
    }

}
