public class Empleado {
    private String nombre;
    private String apellido;
    private double salarioMensual;

    private static int numeroempleados=0;


    public Empleado(String nombre, String apellido, double salarioMensual) {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setSalarioMensual(salarioMensual);
        this.setNumeroempleados(this.getNumeroempleados() + 1);
    }

    public static int getNumeroempleados() {
        return numeroempleados;
    }

    public static void setNumeroempleados(int numeroempleados) {
        Empleado.numeroempleados = numeroempleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }
}
