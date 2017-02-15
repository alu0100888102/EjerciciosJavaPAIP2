/**
 * <h1>Ejercicio 4: Casi Cero</h1>
 * En este ejercicio recibimos dos números y tenemos que comprobar si son lo suficientemente iguales.
 * 
 * @author alu0100888102
 * @version 1.0
 * @since 14-2-2017
 */

package ejercicio4;

import static java.lang.System.*;
import static java.lang.Math.*;

public class Casicero {
	public static void main(String args[]){
		double casicero = 0.0000000000000000000001;
		double arg1 = Double.parseDouble(args[0]);
		double arg2 = Double.parseDouble(args[1]);
		double diferencia = arg1-arg2;
		if(abs(diferencia) < casicero)
			out.println("TRUE\n");
		else
			out.println("FALSE\n");
	}
}
