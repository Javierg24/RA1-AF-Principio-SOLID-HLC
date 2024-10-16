/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCPIncorrecto;

/**
 *
 * @author Javier Ruiz Gomez
 */
public class Shape {

    public static final int CIRCLE = 1;
    public static final int SQUARE = 2;
    private int shapeType;

    public Shape(int shapeType) {
        this.shapeType = shapeType;
    }

    public void draw() {
        if (shapeType == CIRCLE) {
            drawCircle();
        } else if (shapeType == SQUARE) {
            drawSquare();
        }
    }

    private void drawCircle() {
        System.out.println("Drawing a circle");
    }

    private void drawSquare() {
        System.out.println("Drawing a square");
    }
}
