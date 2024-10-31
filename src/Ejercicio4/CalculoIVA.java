package Ejercicio4;

import javax.swing.JOptionPane;

public class CalculoIVA {
    public static void main(String[] args) {
        String nombreProducto = JOptionPane.showInputDialog("Ingrese el nombre del producto:");
        double precioProducto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto:"));
        String tieneIVA = JOptionPane.showInputDialog("¿El producto tiene IVA? (sí/no):").toLowerCase();

        double iva = 0;
        double precioFinal;

        if (tieneIVA.equals("sí")) {
            if (precioProducto <= 500) {
                iva = precioProducto * 0.12; // 12%
            } else if (precioProducto > 500 && precioProducto <= 1500) {
                iva = precioProducto * 0.14; // 14%
            } else {
                iva = precioProducto * 0.15; // 15%
            }
        }

        precioFinal = precioProducto + iva;

        String mensaje = "Información del Producto:\n" +
                "Nombre: " + nombreProducto + "\n" +
                "Precio: $" + precioProducto + "\n" +
                "IVA: $" + iva + "\n" +
                "Precio Final: $" + precioFinal;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
