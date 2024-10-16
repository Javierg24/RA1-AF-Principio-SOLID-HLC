/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemploOCP;

/**
 *
 * @author Javier Ruiz Gomez
 */
public class Main {

    public static void main(String[] args) {
        Producto producto = new Producto("Laptop", 1000);
        ProductoConDescuento productoConDescuento = new ProductoConDescuento("Smartphone", 500, 10);
        ProductoConImpuesto productoConImpuesto = new ProductoConImpuesto("Tablet",
                300, 21);
        System.out.println("Precio del producto: " + producto.getNombre() + " es: "
                + producto.calcularPrecio());
        System.out.println("Precio del producto con descuento: "
                + productoConDescuento.getNombre() + " es: " + productoConDescuento.calcularPrecio());
        System.out.println("Precio del producto con impuesto: "
                + productoConImpuesto.getNombre() + " es: " + productoConImpuesto.calcularPrecio());
    }
}
