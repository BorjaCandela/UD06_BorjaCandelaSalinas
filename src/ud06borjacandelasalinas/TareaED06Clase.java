package ud06borjacandelasalinas;

public class TareaED06Clase {
    
    private static final double MULTIPLICADORDESCUENTONOCERO = 0.8;
    private static final double MULTIPLICADORDESCUENTOSICERO = 0.95;
    
    public void aplicarDescuento(double precioProducto, int numProductos){
    double total;
    if(numProductos>3)
        precioProducto-=5; 
            if (numProductos!=0){ 
            total = multiplica(precioProducto, MULTIPLICADORDESCUENTONOCERO);
        } else { 
            total = multiplica(precioProducto, MULTIPLICADORDESCUENTOSICERO);
        }
        System.out.println("El total a pagar es:"+total);
        System.out.println("Enviado"); 
    }
    public static double multiplica(double producto, double descuento){
        double total;
        total = producto * descuento;
        return total;
    }
}
