import junit.framework.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;



public class FacturaTest{


    @Test
   public void FacturaTest() {
        String numero = "123";
        String descripcion = "compras navidad";
        int cantidad = 3;
        double precioArt = 2.5;
        Factura factura = new Factura(numero, descripcion, cantidad, precioArt);
        assertEquals(factura.getTotalFactura(),cantidad*precioArt);
   }

    @Test
    public void FacturaTestProducto0() {
        String numero = "123";
        String descripcion = "compras navidad";
        int cantidad = 3;
        double precioArt = 0;
        Factura factura = new Factura(numero, descripcion, cantidad, precioArt);
        assertEquals(factura.getTotalFactura(),0.0);
    }




}