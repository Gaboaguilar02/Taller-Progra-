package Ejercicio2;

import javax.swing.JOptionPane;

public class Calculadora {

    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            JOptionPane.showMessageDialog(null, "Error: No se puede dividir entre cero", "Error", JOptionPane.ERROR_MESSAGE);
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        boolean continuar = true;

        while (continuar) {
            try {
                String opcion = JOptionPane.showInputDialog(null,
                        "Seleccione una operación:\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir",
                        "Calculadora", JOptionPane.QUESTION_MESSAGE);

                if (opcion == null || opcion.equals("5")) {
                    continuar = false;
                    break;
                }

                double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número:"));
                double num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número:"));
                double resultado = 0;

                switch (opcion) {
                    case "1":
                        resultado = calc.sumar(num1, num2);
                        JOptionPane.showMessageDialog(null, "Resultado de la suma: " + resultado);
                        break;
                    case "2":
                        resultado = calc.restar(num1, num2);
                        JOptionPane.showMessageDialog(null, "Resultado de la resta: " + resultado);
                        break;
                    case "3":
                        resultado = calc.multiplicar(num1, num2);
                        JOptionPane.showMessageDialog(null, "Resultado de la multiplicación: " + resultado);
                        break;
                    case "4":
                        resultado = calc.dividir(num1, num2);
                        if (!Double.isNaN(resultado)) {
                            JOptionPane.showMessageDialog(null, "Resultado de la división: " + resultado);
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Ingrese valores numéricos válidos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
