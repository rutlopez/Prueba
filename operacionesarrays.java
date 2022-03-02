package arraylist2ej1;

import java.util.ArrayList;
import java.util.Scanner;

public class operacionesarrays 
{
	
	public static void main (String[]args) 
	{
		Scanner entrada = new Scanner (System.in);
		ArrayList <Integer> numeros = new ArrayList <Integer>();  // array
		int contador=0; // contador de numeros
		
			while (true) // para que me pida siempre numeros
			{
				System.out.println("Introduce un numero: ");
				int dato = entrada.nextInt();
				numeros.add(dato);
				
				
				if (dato == 0)  // si mete un 0 
				{
					int suma = calcularSuma(numeros); //que haga este metodo
					System.out.println(suma);
					double mediaAritmetica = calcularMedia(numeros,contador); //que haga este metodo
					System.out.println(mediaAritmetica);
					
					break; // y que acabe 
				}
				contador++; //para que no coja el 0 despues de salir de meter numeros
			}
	}
	public static int calcularSuma(ArrayList<Integer> numeros) // hacemos la suma de los numeros
	{
		int suma = 0;
		for(int i = 0; i<numeros.size();i++)
		{
			suma += numeros.get(i);
		}
		return suma;
	}

	public static double calcularMedia(ArrayList <Integer> numeros,int contador) // calcular la media 
	{
		double media = 0 ;
		for (int i = 0; i<numeros.size();i++) 
		{
		media += numeros.get(i);
		}
		media = media/contador;
		return media;
		
	}
	public static int esCapicua (ArrayList <Integer> numeros) 
	{
		int esCapicua = 0;
		
		return esCapicua;
		
	}
}

