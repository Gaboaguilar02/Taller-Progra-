package Ejercicio5;

import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Empleado {
    private String cedula;
    private String nombre;
    private String apellido;
    private String genero;
    private double salario;
    private LocalDate fechaNacimiento;
    private LocalDate fechaIngreso;

    public Empleado(String cedula, String nombre, String apellido, String genero, double salario, LocalDate fechaNacimiento, LocalDate fechaIngreso) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.salario = salario;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
    }

    public void modificarSalario(double nuevoSalario) {
        this.salario = nuevoSalario;
        JOptionPane.showMessageDialog(null, "Salario modificado a: $" + nuevoSalario);
    }

    public int calcularEdad() {
        LocalDate now = LocalDate.now();
        return Period.between(fechaNacimiento, now).getYears();
    }

    public double calcularPrestaciones() {
        int antiguedad = calcularAntiguedad();
        return (antiguedad * salario) / 12.0;
    }

    private int calcularAntiguedad() {
        LocalDate now = LocalDate.now();
        return Period.between(fechaIngreso, now).getYears();
    }

    public String mostrarInformacion() {
        return "Empleado:\n" +
                "Cédula: " + cedula + "\n" +
                "Nombre: " + nombre + " " + apellido + "\n" +
                "Género: " + genero + "\n" +
                "Salario: $" + salario + "\n" +
                "Fecha de Nacimiento: " + fechaNacimiento + "\n" +
                "Fecha de Ingreso: " + fechaIngreso + "\n" +
                "Edad: " + calcularEdad() + " años\n" +
                "Prestaciones: $" + calcularPrestaciones();
    }

    public static void main(String[] args) {
        try {
            String cedula = JOptionPane.showInputDialog("Ingrese la cédula del empleado:");
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
            String apellido = JOptionPane.showInputDialog("Ingrese el apellido del empleado:");
            String genero = JOptionPane.showInputDialog("Ingrese el género del empleado:");
            double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado:"));

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate fechaNacimiento = LocalDate.parse(JOptionPane.showInputDialog("Ingrese la fecha de nacimiento (yyyy-MM-dd):"), formatter);
            LocalDate fechaIngreso = LocalDate.parse(JOptionPane.showInputDialog("Ingrese la fecha de ingreso (yyyy-MM-dd):"), formatter);

            Empleado empleado = new Empleado(cedula, nombre, apellido, genero, salario, fechaNacimiento, fechaIngreso);

            JOptionPane.showMessageDialog(null, empleado.mostrarInformacion());

            double nuevoSalario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo salario del empleado:"));
            empleado.modificarSalario(nuevoSalario);

            JOptionPane.showMessageDialog(null, empleado.mostrarInformacion());
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(null, "Error: Formato de fecha no válido. Use yyyy-MM-dd.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Entrada no válida. Por favor ingrese un número para el salario.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
}