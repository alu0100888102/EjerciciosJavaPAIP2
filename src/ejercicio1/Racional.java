/**
 * <h1>Ejercicio 1: Clase Racional</h1>
 * En este ejercicio creamos una clase para representar números racionales, empleando dos int (numerador y denominador)y la dotamos de las operaciones básicas.
 * 
 * @author alu0100888102
 * @version 1.0
 * @since 13-2-2017
 */

package ejercicio1;

import static java.lang.System.*;
import static java.lang.Math.*;

public class Racional {
	int numerador;
	int denominador;
	
	private void reducir(){
		/**
		 * Este método simplifica el racional a su equivalente irreducible. Se usa siempre después de actualizar los valores del racional.
		 */
		for(int i =1; i<= min(numerador, denominador); i++){
			if((numerador % i == 0) && (denominador % i == 0)){
				numerador = numerador / i;
				denominador = denominador /i;
			}
		}
	}
	
	public Racional(){
		/**
		 * Por defecto crea un racional 1/1.
		 */
		numerador = 1;
		denominador = 1;
		this.reducir();
	}
	public Racional(int n){
		/**
		 * Si se le pasa sólo un parámetro construye la interpretación racional de un número entero (n/1).
		 */
		numerador = n;
		denominador = 1;
		this.reducir();
	}
	public Racional(int n, int d){
		/**
		 * Si se le pasan dos parametros, el primero será el numerador y el segundo el denominador. Se comprueba que d no sea 0.
		 */
		if(d != 0){
			numerador = n;
			denominador = d;
			this.reducir();
		}
		else
			out.println("ERROR: el denominador no puede ser 0");
	}
	
	public int getDenominador(){
		return denominador;
	}
	public int getNumerador(){
		return numerador;
	}
	public int setDenominador(int d){
		int aux = denominador;
		denominador = d;
		return aux;
	}
	public int setNumerador(int n){
		int aux = numerador;
		numerador = n;
		return aux;
	}
	
	public String toString(){
		return numerador + "/" + denominador;
	}
	public Racional suma(Racional rat){
		/**
		 * Si los denomiadores son iguales, suma los numeradores.
		 * Si los denomiadores son distintos multiplica cada racional por el denominador del otro y luego suma los numeradores.
		 * Al final se reduce.
		 */
		Racional solucion = new Racional();
		if(rat.getDenominador() == this.denominador){
			solucion.setDenominador(this.denominador);
			solucion.setNumerador(this.numerador + rat.getNumerador());
		}
		else{
			solucion.setDenominador(this.denominador * rat.getDenominador());
			solucion.setNumerador((this.numerador * rat.getDenominador()) + (rat.getNumerador() * this.denominador));
		}
		solucion.reducir();
		return solucion;
	}
	public Racional resta(Racional rat){
		/**
		 * Igual que la suma, pero se restan los numeradores en vez de sumarse.
		 */
		Racional solucion = new Racional();
		if(rat.getDenominador() == this.denominador){
			solucion.setDenominador(this.denominador);
			solucion.setNumerador(this.numerador - rat.getNumerador());
		}
		else{
			solucion.setDenominador(this.denominador * rat.getDenominador());
			solucion.setNumerador((this.numerador * rat.getDenominador()) - (rat.getNumerador() * this.denominador));
		}
		solucion.reducir();
		return solucion;
	}
	public Racional producto(Racional rat){
		/**
		 * Multiplicamos los numeradores y los denominadores entre sí.
		 * Redicimos.
		 */
		Racional solucion = new Racional();
		solucion.setDenominador(this.denominador * rat.getDenominador());
		solucion.setNumerador(this.numerador * rat.getNumerador());
		solucion.reducir();
		return solucion;
	}
	public Racional division(Racional rat){
		/**
		 * Se multiplican en curz los denominadores y numeradores.
		 * Reducimos
		 */
		Racional solucion = new Racional();
		solucion.setDenominador(this.denominador * rat.getNumerador());
		solucion.setNumerador(this.numerador * rat.getDenominador());
		solucion.reducir();
		return solucion;
	}
	
	public boolean igual(Racional rat){
		/**
		 * Comprueba si los denominadores son distintos y luego los numeradores.
		 * Si alguno es distinto devuelve false, si no devuelve true.
		 */
		if(rat.getDenominador() != this.denominador)
			return false;
		if(rat.getNumerador() != this.numerador)
			return false;
		return true;
	}
	public boolean menor(Racional rat){
		/**
		 * Para comprobar que this es menor que rat, restamos this a rat.
		 * Si el resultado es positivo, this es menor.
		 */
		Racional diff = rat.resta(this);
		if(diff.getNumerador() < 0)
			return false;
		return true;
	}
	public boolean mayor(Racional rat){
		/**
		 * Para comprobar que this es mayor que rat, restamos rat a this.
		 * Si el resultado es positivo, this es mayor.
		 */
		Racional diff = this.resta(rat);
		if(diff.getNumerador() < 0)
			return false;
		return true;
	}
	
	public static Racional suma(Racional sumando1, Racional sumando2){
		return sumando1.suma(sumando2);
	}
	public static Racional resta(Racional minuendo, Racional sustraendo){
		return minuendo.resta(sustraendo);
	}
	public static Racional producto(Racional operando1, Racional operando2){
		return operando1.producto(operando2);
	}
	public static Racional division(Racional dividendo, Racional divisor){
		return dividendo.division(divisor);
	}
}
