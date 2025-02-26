
public class persona {

    public String nombre;
    public String apellido;
    public int cedula;
    public int añoDenacimiento;
    

    public persona(String nombre, String apellido, int cedula, int añoDenacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.añoDenacimiento = añoDenacimiento;
        

    }

    public void imprimir() {
        System.out.println("nombre" + nombre);
        System.out.println("apellido" + apellido);
        System.out.println("cedula" + cedula);
        System.out.println("ano de nacimieno" + añoDenacimiento + 
                "\n" + "edad: "+ (añoDenacimiento - 2025)  );

    }

}
