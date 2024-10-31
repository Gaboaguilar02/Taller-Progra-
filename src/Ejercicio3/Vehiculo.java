package Ejercicio3;

import javax.swing.JOptionPane;

public class Vehiculo {
    public static void main(String[] args) {
        String numeroMotor = JOptionPane.showInputDialog("Ingrese el número de motor:");
        String numeroVentanas = JOptionPane.showInputDialog("Ingrese el número de ventanas:");
        String cantidadPuertas = JOptionPane.showInputDialog("Ingrese la cantidad de puertas:");
        String marca = JOptionPane.showInputDialog("Ingrese la marca:");
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo:");
        String kilometrajeInicialStr = JOptionPane.showInputDialog("Ingrese el kilometraje inicial:");
        String kilometrajeFinalStr = JOptionPane.showInputDialog("Ingrese el kilometraje final:");

        double kilometrajeInicial = Double.parseDouble(kilometrajeInicialStr);
        double kilometrajeFinal = Double.parseDouble(kilometrajeFinalStr);

        double kilometrosRecorridos = kilometrajeFinal - kilometrajeInicial;

        String mensaje = "Información del vehículo:\n" +
                "Número de Motor: " + numeroMotor + "\n" +
                "Número de Ventanas: " + numeroVentanas + "\n" +
                "Cantidad de Puertas: " + cantidadPuertas + "\n" +
                "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Kilometraje Inicial: " + kilometrajeInicial + " km\n" +
                "Kilometraje Final: " + kilometrajeFinal + " km\n" +
                "Kilómetros Recorridos: " + kilometrosRecorridos + " km";

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
