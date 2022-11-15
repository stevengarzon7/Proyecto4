import junit.framework.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;



public class EmpleadoTest{


    @Test
   public void empleadoTest() {
        String nombre = "mario";
        String apellido = "mendez";
        double salario = 2000000;
        Empleado empleado1 = new Empleado(nombre, apellido, salario);
        Empleado empleado2= new Empleado("ricky","gutierrez",1200000.0);
        assertEquals(empleado2.getSalarioMensual(),1200000.0);
        assertEquals(empleado1.getSalarioMensual(),2000000);
        empleado1.setSalarioMensual(empleado1.getSalarioMensual()*1.1);
        empleado2.setSalarioMensual(empleado2.getSalarioMensual()*1.1);
        assertEquals(empleado2.getSalarioMensual()*12,1320000.0*12);
        assertEquals(empleado1.getSalarioMensual()*12,2200000*12);
        assertEquals(empleado2.getNumeroempleados(),2);

   }






}