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
	private int numerador;
	private int denominador;
	
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
		numerador = 1;
		denominador = 1;
		this.reducir();
	}
	public Racional(int n){
		numerador = n;
		denominador = 1;
		this.reducir();
	}
	public Racional(int n, int d){
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
		Racional solucion = new Racional();
		if(rat.denominador == this.denominador){
			solucion.denominador = this.denominador;
			solucion.numerador = this.numerador + rat.numerador;
		}
		else{
			solucion.denominador = this.denominador * rat.denominador;
			solucion.numerador = (this.numerador * rat.denominador) + (rat.numerador * this.denominador);
		}
		solucion.reducir();
		return solucion;
	}
	public Racional resta(Racional rat){
		Racional solucion = new Racional();
		if(rat.denominador == this.denominador){
			solucion.denominador = this.denominador;
			solucion.numerador = this.numerador - rat.numerador;
		}
		else{
			solucion.denominador = this.denominador * rat.denominador;
			solucion.numerador = (this.numerador * rat.denominador) - (rat.numerador * this.denominador);
		}
		solucion.reducir();
		return solucion;
	}
	public Racional producto(Racional rat){
		Racional solucion = new Racional();
		solucion.denominador = this.denominador * rat.denominador;
		solucion.numerador = this.numerador * rat.numerador;
		solucion.reducir();
		return solucion;
	}
	public Racional division(Racional rat){
		Racional solucion = new Racional();
		solucion.denominador = this.denominador * rat.numerador;
		solucion.numerador = this.numerador * rat.denominador;
		solucion.reducir();
		return solucion;
	}
	
	public static void main(String args[]){
		Racional racional1, racional2, racionalSum, racionalRes, racionalPro, racionalDiv;
		racional1 = new Racional(7, 49);
		racional2 = new Racional(3, 33);
		racionalSum = racional1.suma(racional2);
		racionalRes = racional1.resta(racional2);
		racionalPro = racional1.producto(racional2);
		racionalDiv = racional1.division(racional2);
		
		out.println(racional1 + ", " + racional2 + "\nSuma: " + racionalSum + "\nResta: " + racionalRes +
				"\nProducto: " + racionalPro + "\nDivision: " + racionalDiv + "\n");
	}
}
