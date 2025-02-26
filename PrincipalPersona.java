
public class PrincipalPersona {

    public static void main(String[] args) {
        Persona personita1 = new Persona("luis", "san", 12112, 2002);
        Persona personita2 = new Persona("luis", "san", 12112, 2003);
        
        System.out.println("informacion persona1 : ");
        personita1.imprimir();
                System.out.println("informacion persona2 : ");
                personita2.imprimir();


    }

}
