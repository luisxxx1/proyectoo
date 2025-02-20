package vocal;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Ingrese una cadena:");

        if (texto != null && !texto.isEmpty()) {
            vocal detector = new vocal(texto);
            JOptionPane.showMessageDialog(null, detector.detectarVocales());
        } else {
            JOptionPane.showMessageDialog(null, "No ingresaste texto.");
        }
    }
}

