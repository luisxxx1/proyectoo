package vocales; 

import javax.swing.*;

public class Vocal {

    public String pedir_texto() {
        return JOptionPane.showInputDialog("Ingrese una cadena de texto:");
    }

    public int contarVocales(String texto) {
        int count = 0; 

        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i); 

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }

        return count; 
    }
}
