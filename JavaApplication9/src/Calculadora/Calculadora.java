package Calculadora;

import javax.swing.JOptionPane;

public class Calculadora {

    private double num1;
    private double num2;

    // Constructor para inicializar los números
    public Calculadora() {
        num1 = 0.0;
        num2 = 0.0;
    }

    // Método para pedir los datos al usuario
    public void pedir_datos() {
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el primer número:"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el segundo número:"));
    }

    // Método para realizar la suma
    public double sumar() {
        return num1 + num2;
    }

    // Método para realizar la resta
    public double restar() {
        return num1 - num2;
    }

    // Método para realizar la multiplicación
    public double multiplicar() {
        return num1 * num2;
    }

    // Método para realizar la división
    public double dividir() {
        if (num2 == 0) {
            JOptionPane.showMessageDialog(null, "No se puede dividir por cero", "Error", JOptionPane.ERROR_MESSAGE);
            return Double.NaN;  // Retorna NaN (Not a Number) si hay un intento de división por cero
        }
        return num1 / num2;
    }

    // Método para mostrar los resultados de las operaciones
    public void mostrar_resultados() {
        String resultados = "Resultados:\n";
        resultados += "Suma: " + sumar() + "\n";
        resultados += "Resta: " + restar() + "\n";
        resultados += "Multiplicación: " + multiplicar() + "\n";
        
        double division = dividir();
        if (Double.isNaN(division)) {
            resultados += "División: No válida\n";
        } else {
            resultados += "División: " + division + "\n";
        }

        JOptionPane.showMessageDialog(null, resultados, "Resultados", JOptionPane.INFORMATION_MESSAGE);
    }
}
