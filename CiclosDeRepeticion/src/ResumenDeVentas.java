import javax.swing.*;

public class ResumenDeVentas {
    public static void main(String[] args) {
        int codigo , litro , litroArticulo1 = 0 ;
        float precioLitro ,importeFactura ,facturacionTotal = 0 , contadorMas600 = 0 ;

        //Ingresa por teclado contenido de 5 facturas

        for (int i=1; i<=5;i++){
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Articulo "+i+"\nDigite el codigo del articulo"));
            litro = Integer.parseInt(JOptionPane.showInputDialog("Articulo "+i+"\nDigite la cantidad vendida en litros "));
            precioLitro = Float.parseFloat(JOptionPane.showInputDialog("Articulo "+i+"\nDigite el precio por litro "));

            importeFactura = (float) litro * precioLitro ;

            facturacionTotal += importeFactura ;

            if ( codigo == 1){
                litroArticulo1 += litro;

            }

            if (importeFactura > 600){
                contadorMas600++;
            }

        }
        JOptionPane.showMessageDialog(null,"RESUMEN DE VENTA" +
                "\nfacturacion total $ "+facturacionTotal+
                "\nCantidad de litros vendidos Del Articulo 1  es "+litroArticulo1+
                "\nCantidad de facturas mayores a U$600  es "+contadorMas600);

    }
}
