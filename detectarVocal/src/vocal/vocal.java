package vocal;

public class vocal {
    private String texto;

    public vocal(String texto) {
        this.texto = texto;
    }

    public String detectarVocales() {
        String vocales = "aeiouAEIOU";
        String resultado = "Vocales encontradas: ";
        int contador = 0;

        for (char c : texto.toCharArray()) {
            if (vocales.indexOf(c) != -1) {
                resultado += c + " ";
                contador++;
            }
        }

        return contador > 0 ? resultado + "\nTotal de vocales: " + contador : "No se encontraron vocales.";
    }
}
