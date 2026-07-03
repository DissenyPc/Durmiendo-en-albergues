package controlador;


// Esquema de la entrada: fin de la entrada
import java.util.*;

public class inicio {

  static Scanner scanner;

  public static boolean casoDePrueba() {

    if (!scanner.hasNext())
        return false;
    else {
     

      String camas = scanner.nextLine();

        int distancia = 0;

        int dProvi = 0;

        boolean primero = false;

        if (camas.charAt(0) == '.' )  primero = true;

        for ( int i= 0; i < (camas.length() ); i++) {

            if ( camas.charAt(i) == 'X') {

                if ( primero == true) {

                    distancia = dProvi-1; 
                    primero = false;
                    dProvi = 0;

                } else {

                    distancia = Math.max(distancia, (int) Math.floor((dProvi-1)/2));
                    dProvi = 0;
                    
                }

            } else if (i!=(camas.length()-1)){

                dProvi++;

            } else {

                distancia = Math.max(distancia, dProvi);
            }    
                   
        }

        System.out.println( distancia);

      return true;
    }

  } // casoDePrueba

  public static void main(String[] args) {

    scanner = new java.util.Scanner(System.in);

    while(casoDePrueba())
      ;

  } // main

} // class Solution
