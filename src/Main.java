
import javax.swing.*;
import vocales.Vocal; 

public class Main {

    public static void main(String[] args) {
      
        Vocal vocal = new Vocal();

        String texto = vocal.pedir_texto();

        int cantidadVocales = vocal.contarVocales(texto);

        JOptionPane.showMessageDialog(null, "Cantidad de vocales: " + cantidadVocales);
    }
}
