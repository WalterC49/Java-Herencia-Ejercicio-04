/*
Se plantea desarrollar un programa que nos permita calcular el área y el perímetro
de formas geométricas, en este caso un circulo y un rectángulo. Ya que este
calculo se va a repetir en las dos formas geométricas, vamos a crear una Interfaz,
llamada calculosFormas que tendrá, los dos métodos para calcular el área, el
perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la
interfaz y se calcule el área y el perímetro de los dos. En el main se crearán las
formas y se mostrará el resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2
*/
package ejercicio_herencia_04;

import ejercicio_herencia_04.Entidades.Circulo;
import ejercicio_herencia_04.Entidades.Rectangulo;
import static java.lang.Double.parseDouble;
import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class Ejercicio_Herencia_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Se calculará el área y perímetro de dos figuras geometricas.");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String lectura;
        
        System.out.println("Circulo:");
        Circulo circulo = new Circulo();
        System.out.print("Ingrese el diametro de un circulo(cm): ");
        lectura=leer.next().replace(',', '.');
        circulo.setDiametro(parseDouble(lectura));
        System.out.println("\nÁrea del circulo: "+circulo.AreaCirculo()+" cm"
                + "\nPerímetro del circulo: "+circulo.PerimetroCirculo()+" cm");
        
        System.out.println("\nRectángulo:");
        Rectangulo rectangulo = new Rectangulo();
        System.out.print("Ingrese la base del rectángulo(cm): ");
        lectura=leer.next().replace(',', '.');
        rectangulo.setBase(parseDouble(lectura));
        System.out.print("Ingrese la altura del rectángulo(cm): ");
        lectura=leer.next().replace(',', '.');
        rectangulo.setAltura(parseDouble(lectura));
        System.out.println("\nÁrea del rectángulo: "+rectangulo.AreaRectangulo()+" cm"
                + "\nPerímetro del rectángulo: "+rectangulo.PerimetroRectangulo()+" cm");
    }
    
}
