package Entidades;

public class Empleado extends Celular implements Aumento {

    private String cargo;
    private int experiencia;

    public Empleado() {
    }

    public Empleado(int tipoDocumento, String numeroDocumento, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String telefono, String direccion, int edad) {
        super(tipoDocumento, numeroDocumento, primerNombre, segundoNombre, primerApellido, segundoApellido, telefono, direccion, edad);
    }

    public Empleado(int tipoDocumento, String numeroDocumento, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String telefono, String direccion, int edad, String cargo, int experiencia) {
        super(tipoDocumento, numeroDocumento, primerNombre, segundoNombre, primerApellido, segundoApellido, telefono, direccion, edad);

        this.cargo = cargo;
        this.experiencia = experiencia;
    }

    public String getcargo() {
        return cargo;

    }

    public void setCargo(String cargo) {
        this.cargo = cargo;

    }

    public int getexperiencia() {
        return experiencia;
    }

    public void setexperiencia(int experiencia) {
        this.experiencia = experiencia;

    }

    @Override
    public int generarExperiencia(boolean edad, int valor) {
        int experienciaFinal = 0;

        if (edad && (valor % 2 == 0)) {
            this.setexperiencia(valor + 2);

        } else {
            this.setexperiencia(valor + 1);
        }
        return experienciaFinal;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Tipo de Documento: " + this.getTipoDocumento());
        System.out.println(("Identificacion: " + this.getNumeroDocumento()));
        System.out.println(("Primer Nombre: " + this.getPrimerNombre()));
        System.out.println(("Segundo Nombre: " + this.getSegundoNombre()));
        System.out.println(("Primer Apellido: " + this.getPrimerApellido()));
        System.out.println(("Segundo Apellido: " + this.getSegundoApellido()));
        System.out.println(("Telefono: " + this.getTelefono()));
        System.out.println(("Direccion: " + this.getDireccion()));
        System.out.println(("Edad: " + this.getEdad()));
        System.out.println(("Cargo: " + this.getcargo()));
        System.out.println(("Experiencia: " + this.getexperiencia()));

    }
}
