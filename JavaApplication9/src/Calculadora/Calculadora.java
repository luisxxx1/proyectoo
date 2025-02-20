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

    public void pedir_datos() {
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el primer número:"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el segundo número:"));
    }

    public double sumar() {
        return num1 + num2;
    }

    public double restar() {
        return num1 - num2;
    }

    public double multiplicar() {
        return num1 * num2;
    }

    public double dividir() {
        if (num2 == 0) {
            JOptionPane.showMessageDialog(null, "No se puede dividir por cero", "Error", JOptionPane.ERROR_MESSAGE);
            return Double.NaN;  
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
