/*
 Realizar un programa en java que permita presentar un mensaje de: 
acceso correcto, si el valor ingresaso para la variable ciudad tiene el valor 
de Loja o Machala o Guayaquil; caso contrario, presentar un mensaje de acceso incorrecto
 */
package ejemplo4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Expresiones lógicas con cadenas en Java
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        System.out.println("Ingrese la ciudad");
        String ciudad = entrada.nextLine(); // Quito
        //F           or          //F         >>>>> F
        // utilizamos el (nombre variable).equals exclusivo para cadena para
        // hacer una comparacion con el condicional
        // en cambio si utilizamos el and se necesito que los 3 sean verdaderos
        // es decir los 3 se utilicen a la vez
        if (ciudad.equals("Loja") || ciudad.equals("Machala") || 
                ciudad.equals("Guayaquil")) {
            System.out.printf("%s\n", "acceso correcto");
        } else {
            System.out.printf("%s\n", "acceso incorrecto");
        }

    }

}
