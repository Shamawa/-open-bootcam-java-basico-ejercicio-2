/**
 * Crear una función que reciba un precio parÃ¡metro y devuelva el precio con el IVA incluído
 */

public class Ejercicio2 {

    public static void main(String[] args) {

        double resultado = calcularPrecioTotal(400,0.21);
        System.out.println("El precio total del artículo es " + resultado);
    }

    static double calcularPrecioTotal( double precioArticulo, double iva ) {
        return (precioArticulo * iva) + precioArticulo;
    }

}
