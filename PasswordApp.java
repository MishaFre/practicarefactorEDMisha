
/**
 * Autor: [Mykhaylo Freyishyn Novychenko]
 * Versión: 1.1
 */

package seguridad;

import java.util.Scanner;
import seguridad.Password;
import java.util.Scanner;

public class PasswordApp {
    public static void main(String[] args) {
  
    	    Scanner sc = new Scanner(System.in);
	        System.out.println("Introduce cuantas contraseñas quiere que genere");
	        int numero=sc.nextInt();
	        System.out.println("Introduce la fortaleza de la contraseña, más de 8 carácteres");
	        int longitud=sc.nextInt();
  
  
        //Creamos los arrays
        Password listaPassword[]=new Password[numero];
        boolean fortalezaPassword[]=new boolean[numero];
  
        //Creamos objetos, indicamos si es fuerte y mostramos la contraseña y su fortaleza.
        for(int i=0;i<listaPassword.length;i++){
            listaPassword[i]=new Password(longitud);
            fortalezaPassword[i]=listaPassword[i].esFuerte();
            System.out.println(listaPassword[i].getcontrasenya()+" "+fortalezaPassword[i]);
        }
    }
}
