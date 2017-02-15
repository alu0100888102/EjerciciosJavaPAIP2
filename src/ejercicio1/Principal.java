package ejercicio1;

import static java.lang.System.*;
import java.util.ArrayList;

public class Principal {
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
		
		if(racionalDiv.menor(racionalSum))
			out.println(racionalDiv+" < "+racionalSum);
		else
			out.println(racionalDiv+" > "+racionalSum);
		if(racionalRes.menor(racionalSum))
			out.println(racionalRes+" < "+racionalSum);
		else
			out.println(racionalRes+" > "+racionalSum);
		if(racionalDiv.mayor(racionalPro))
			out.println(racionalDiv+" > "+racionalPro);
		else
			out.println(racionalDiv+" < "+racionalPro);
		if(racional1.mayor(racional2))
			out.println(racional1+" > "+racional2);
		else
			out.println(racional1+" < "+racional2);
		if(racionalPro.igual(racionalSum))
			out.println(racionalPro+" = "+racionalSum);
		else
			out.println(racionalPro+" != "+racionalSum);
		if(racional1.igual(racional1))
			out.println(racional1+" = "+racional1);
		else
			out.println(racional1+" != "+racional1);
		
		Racional racionalSum2 = Racional.suma(racional1, racional2);
		Racional racionalRes2 = Racional.resta(racional1, racional2);
		Racional racionalPro2 = Racional.producto(racional1, racional2);
		Racional racionalDiv2 = Racional.division(racional1, racional2);
		out.println(racional1 + ", " + racional2 + "\nSuma: " + racionalSum2 + "\nResta: " + racionalRes2 +
				"\nProducto: " + racionalPro2 + "\nDivision: " + racionalDiv2 + "\n");
		
		ArrayList<Racional> arr1 = new ArrayList<Racional>();
		arr1.add(racionalSum);
		arr1.add(racionalRes);
		ArrayList<Racional> arr2 =  new ArrayList<Racional>();
		arr2.add(racionalPro);
		arr2.add(racionalDiv);
		EuclideanVector vector1 = new EuclideanVector(arr1);
		EuclideanVector vector2 = new EuclideanVector(arr2);
		out.println(vector1 + "       " + vector2 );
		out.println("Suma: "+ EuclideanVector.suma(vector1,vector2));
		out.println("Resta: "+ EuclideanVector.resta(vector1,vector2));
		out.println("Multiplicar por "+racionalSum+ ": "+ EuclideanVector.productoEscalar(racionalSum, vector1));
	}
}
