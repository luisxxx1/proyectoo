
public class Persona {

    public String nombre;
    public String apellido;
    public int identificacion;
    public int FechaNacimiento;

    public Persona(String nombre, String apellido, int identificacion, int FechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.FechaNacimiento = FechaNacimiento;
        this.identificacion = identificacion;
    }

    public void imprimir() {
        System.out.println("nombre : " + nombre);
        System.out.println("apellido : " + apellido);
        System.out.println("fecha de nacimiento : " + FechaNacimiento);
        System.out.println("identificacion : " + identificacion);
        System.out.println("edad:" + ( 2025 - FechaNacimiento));

    }
}
