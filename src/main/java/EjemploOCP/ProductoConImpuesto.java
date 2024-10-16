/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemploOCP;

/**
 *
 * @author Javier Ruiz Gomez
 */
// Producto con impuesto
public class ProductoConImpuesto extends Producto {

    private double porcentajeImpuesto;

    public ProductoConImpuesto(String nombre, double precioBase, double porcentajeImpuesto) {
        super(nombre, precioBase);
        this.porcentajeImpuesto = porcentajeImpuesto;
    }

    @Override
    public double calcularPrecio() {
        return getPrecioBase() + (getPrecioBase() * (porcentajeImpuesto / 100));
    }
}
