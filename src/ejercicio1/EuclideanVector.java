/**
 *<h1>Ejercicios miercoles 15</h1>
 *
 * Esta clase la desarrollamos durante las prácticas del miercoles 15 de febrero.
 * Representa un vector euclidiano.
 * 
 * @author E. Segredo
 * @version 14.2.2016
 */
package ejercicio1;

import java.util.ArrayList;

// Clase que permite representar un vector Euclídeo cuyas componentes
// son números racionales

public class EuclideanVector extends Racional {
	ArrayList<Racional> coordenadas;
	
	// Constructor por defecto
	public EuclideanVector() {
		coordenadas = new ArrayList<Racional>();
	}
	
	// Constructor que recibe como parámetro un objeto de la clase ArrayList
	public EuclideanVector(ArrayList<Racional> euVec) {
		coordenadas = euVec;
	}
    
	/**
	* suma(euclideanVector1, euclideanVector2)->euclideanVector sobrecarga suma(racional1, racional2)->racional
	* 
	* @param  v1, v2 los dos sumandos
	* @return el vector Euclídeo suma de v1 y v2
	*/

	public static EuclideanVector suma(EuclideanVector v1, EuclideanVector v2){
		if( v1.coordenadas.size() != v2.coordenadas.size()){
			return null;
		}
		ArrayList<Racional> solucion = new ArrayList<Racional>();
		for(int i =0; i< v1.coordenadas.size(); i++){
			solucion.add(v1.coordenadas.get(i).suma(v2.coordenadas.get(i)));
		}
		return new EuclideanVector(solucion);
	}
    
	/**
	* resta(euclideanVector1, euclideanVector2)->euclideanVector sobrecarga resta(racional1, racional2)->racional
	* 
	* @param  v1, v2 minuendo y sustraendo, respectivamente
	* @return el vector Euclídeo resta de v1 y v2
	*/
	public static EuclideanVector resta(EuclideanVector v1, EuclideanVector v2){
		if( v1.coordenadas.size() != v2.coordenadas.size()){
			return null;
		}
		ArrayList<Racional> solucion = new ArrayList<Racional>();
		for(int i =0; i< v1.coordenadas.size(); i++){
			solucion.add(v1.coordenadas.get(i).resta(v2.coordenadas.get(i)));
		}
		return new EuclideanVector(solucion);
	}

	/**
	* productoEscalar(racional, euclideanVector)->euclideanVector
	* 
	* @param  r factor escalar
	* @param  v factor vectorial Euclídeo
	* @return el vector Euclídeo producto de r y v 
	*/
	public static EuclideanVector productoEscalar(Racional r, EuclideanVector v){
		ArrayList<Racional> solucion = new ArrayList<Racional>();
		for(int i =0; i< v.coordenadas.size(); i++){
			solucion.add(v.coordenadas.get(i).producto(r));
		}
		return new EuclideanVector(solucion);
	}
    
	// Método que imprime la representación en cadena de caracteres de un vector Euclídeo
	public String toString(){
		String salida = "";
		for(int i =0; i< coordenadas.size();i++){
			salida = salida + coordenadas.get(i)+ " ";
		}
		return salida;
	}
}
