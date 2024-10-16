/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemploOCP;

/**
 *
 * @author Javier Ruiz Gomez
 */
// Producto con descuento
public class ProductoConDescuento extends Producto {

    private double porcentajeDescuento;

    public ProductoConDescuento(String nombre, double precioBase, double porcentajeDescuento) {
        super(nombre, precioBase);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public double calcularPrecio() {
        return getPrecioBase() - (getPrecioBase() * (porcentajeDescuento / 100));
    }
}
