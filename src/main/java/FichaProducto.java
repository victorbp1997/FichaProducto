import jdk.swing.interop.SwingInterOpUtils;

public class FichaProducto {
    //                             clase
    public static void main(String[] args) {
        //                        Variables
        String nombreProducto = "Smartphone";
        String marca = "Iphone 17";
        double pesoEnGramos = 6.24;
        double precioSinIVA = 959.00;
        char categoria = 'M';
        byte valorDetras = 77;
        byte unidadesEnAlmacen = 12;
        int valorAlmacen = 12108;
        int divisionUnidades = unidadesEnAlmacen / 2;
        boolean disponibilidad = true;
        long codigoBarras = 8412345678905L;


    //                              Impresión
        
        System.out.println("=== FICHA DE PRODUCTO ===");
        System.out.println("Producto: " + nombreProducto);
        System.out.println("Marca: " + marca);
        System.out.println("Peso en gramos: " + pesoEnGramos);
        System.out.println("Precio Sin IVA: " + precioSinIVA);
        System.out.println("Categoria: " + categoria);
        System.out.println("Valor de la letra: " + valorDetras);
        System.out.println("Unidades en el almacen: " + unidadesEnAlmacen);
        System.out.println("División de las unidades: " + divisionUnidades);
        System.out.println("Disponibilidad: " + disponibilidad);
        System.out.println("Código de barras: " + codigoBarras);
        System.out.println("=============================");

    //                                Entrada en Almacén
    byte nuevasUnidades = 17;
    boolean disponible = false;

        System.out.println("--- Después de la entrada de almacén ---");
        System.out.println("Unidades: " +nuevasUnidades);
        System.out.println("Disponible: " + disponible);
        System.out.println("-----------------------------------------");


    }
}
