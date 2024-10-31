package Ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FigurasGeometricas {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Cálculo del Triángulo:");
            System.out.print("Ingrese la base del triángulo: ");
            double base = Double.parseDouble(reader.readLine());
            System.out.print("Ingrese la altura del triángulo: ");
            double altura = Double.parseDouble(reader.readLine());
            double areaTriangulo = (base * altura) / 2;
            double lado1, lado2;
            System.out.print("Ingrese el lado 1 del triángulo: ");
            lado1 = Double.parseDouble(reader.readLine());
            System.out.print("Ingrese el lado 2 del triángulo: ");
            lado2 = Double.parseDouble(reader.readLine());
            double perimetroTriangulo = base + lado1 + lado2;

            System.out.println("Área del triángulo: " + areaTriangulo);
            System.out.println("Perímetro del triángulo: " + perimetroTriangulo);
            System.out.println();

            System.out.println("Cálculo del Cuadrado:");
            System.out.print("Ingrese la longitud del lado del cuadrado: ");
            double ladoCuadrado = Double.parseDouble(reader.readLine());
            double areaCuadrado = ladoCuadrado * ladoCuadrado;
            double perimetroCuadrado = 4 * ladoCuadrado;

            System.out.println("Área del cuadrado: " + areaCuadrado);
            System.out.println("Perímetro del cuadrado: " + perimetroCuadrado);
            System.out.println();

            System.out.println("Cálculo del Rectángulo:");
            System.out.print("Ingrese la base del rectángulo: ");
            double baseRectangulo = Double.parseDouble(reader.readLine());
            System.out.print("Ingrese la altura del rectángulo: ");
            double alturaRectangulo = Double.parseDouble(reader.readLine());
            double areaRectangulo = baseRectangulo * alturaRectangulo;
            double perimetroRectangulo = 2 * (baseRectangulo + alturaRectangulo);

            System.out.println("Área del rectángulo: " + areaRectangulo);
            System.out.println("Perímetro del rectángulo: " + perimetroRectangulo);
        } catch (IOException e) {
            System.out.println("Error de entrada/salida: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada no válida, por favor ingrese un número.");
        }
    }
}