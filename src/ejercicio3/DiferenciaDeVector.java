/**
 * <h1>Ejercicio 3: Diferencia de un vector</h1>
 * En este ejercicio recibimos el nombre de un fichero por linea de comandos, lee un vector escrito, y saca por pantalla
 * la diferencia entre el maximo y el mínimo.
 * 
 * @author alu0100888102
 * @version 1.0
 * @since 14-2-2017
 */

package ejercicio3;

import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class DiferenciaDeVector {
	public static void main(String arg[]){
		File file = new File(arg[0]);
		Vector<Integer> numeros = new Vector<Integer>();
		try {
			Scanner input = new Scanner(file);
			while (input.hasNextLine()) {
				numeros.addElement(input.nextInt());
			}
			input.close();
		} 
		catch (FileNotFoundException e) {
			out.println("ERROR: Fichero no encontrado");
			e.printStackTrace();
		}
		catch (NoSuchElementException e){
			out.println("ERROR: No hay mas números al final del fichero.\nCompruebe que el fichero de entrada " +
					"acabe con un número.");
			e.printStackTrace();
		}
		int min= numeros.elementAt(0), max = numeros.elementAt(0);
		for (int i =0; i< numeros.size();i++){
			if(numeros.elementAt(i) < min)
				min = numeros.elementAt(i);
			if(numeros.elementAt(i) > max)
				max = numeros.elementAt(i);
		}
		out.println(max-min);
	}
}