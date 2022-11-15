public class Factura {
    private String numero;
    private String descripcion;
    private int cantidadComprada;
    private double precioPorArticulo;


    public Factura(String numero, String descripcion, int cantidadComprada, double precioPorArticulo) {
        this.setNumero(numero);
        this.setDescripcion(descripcion);
        this.setCantidadComprada(cantidadComprada);
        this.setPrecioPorArticulo(precioPorArticulo);
    }

    public double getTotalFactura(){
        double total=getCantidadComprada()*getPrecioPorArticulo();
        if (total<0){
            total=0;
        }else if (getPrecioPorArticulo()<0){
            setPrecioPorArticulo(0.0);
        }
        return total;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidadComprada() {
        return cantidadComprada;
    }

    public void setCantidadComprada(int cantidadComprada) {
        this.cantidadComprada = cantidadComprada;
    }

    public double getPrecioPorArticulo() {
        return precioPorArticulo;
    }

    public void setPrecioPorArticulo(double precioPorArticulo) {
        this.precioPorArticulo = precioPorArticulo;
    }
}
