/**
 * <h1>Ejercicio 2: Contador de A</h1>
 * En este ejercicio creamos una función main que cuenta el número de A o a en la cadena que recibe por la entrada del usuario.
 * 
 * @author alu0100888102
 * @version 1.0
 * @since 14-2-2017
 */

package ejercicio2;

import java.util.Scanner;
import static java.lang.System.*;

public class NumeroA {
	public static void main(String args[]){
		Scanner reader = new Scanner(in);
		out.println("Introduzca una cadena de caracteres:\n");
		String cadena = reader.nextLine();
		reader.close();
		
		int numberOfA = 0;
		for (int i =0; i<cadena.length(); i++){
			if((cadena.charAt(i) == 'A') || (cadena.charAt(i) == 'a')){
				numberOfA++;
			}
		}
		out.println("Numero de A o a: " + numberOfA + "\n");
	}
}
