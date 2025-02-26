
public class personaPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        persona personita = new persona("luis", "fernando", 22222, 2002);
        persona personita2 = new persona("luis", "fernado", 22222, 2005);
        persona personita3 = new persona("santi", "ferna", 2222, 2221);
        

        System.out.println("\n informacion persona 1:");
        personita.imprimir();

        System.out.println("\n informacion persona 2: ");
        personita2.imprimir();

        System.out.println("\n informacion persona 2: ");
        personita3.imprimir();

    }
}
