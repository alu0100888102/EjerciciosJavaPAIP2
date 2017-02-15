/**
 * <h1>Ejercicio 5: Fechas</h1>
 * En este ejercicio recibimos la fecha de nacimiento de una persona y una fecha cualquiera, y tenemos que calcular
 * la edad de esa persona en esa fecha.
 * 
 * @author alu0100888102
 * @version 1.0
 * @since 14-2-2017
 */

package ejercicio5;

import static java.lang.System.*;
import java.util.*;
import java.text.*;

public class Fechas {
	public static void main(String args[]){
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date nacimiento = new Date();
		Date actual = new Date();
		try{
			actual = format.parse("01/01/2003");
			nacimiento = format.parse("01/01/2001");
		}
		catch (ParseException e) {
			out.println("ERROR: Formato de fecha incorrecto");
			e.printStackTrace();
		}
		long diferencia = actual.getTime() - nacimiento.getTime();
		long diasMl = (1000L*60*60*24);
		long mesesMl = (1000L*60*60*24*30);
		long añosMl = (1000L*60*60*24*365);
		long dias = ((diferencia%añosMl)%mesesMl)/diasMl;
		long meses = (diferencia%añosMl)/mesesMl;
		long años = diferencia/añosMl;
		out.println("Esta persona tiene " + años + " años, " + meses + " meses y " + dias + " dias de edad.");
	}
}
