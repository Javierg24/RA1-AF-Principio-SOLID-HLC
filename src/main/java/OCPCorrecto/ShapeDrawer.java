/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCPCorrecto;

/**
 *
 * @author Javier Ruiz Gomez
 */
public class ShapeDrawer {

    private Drawable shape;

    public ShapeDrawer(Drawable shape) {
        this.shape = shape;
    }

    public void drawShape() {
        shape.draw();
    }
}
