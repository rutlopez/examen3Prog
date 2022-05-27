package ejercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FicheroDivorcios 
{
	private static void leerfichero(String nombre) 
	{
		File file = new File(nombre);
		try{
			Scanner ficheroLeer = new Scanner(file);
			String linea = ficheroLeer.nextLine();
			int contadorCon = 0;// Contador con divorcio previo
			int contadorSin= 0; 
			int contador = 0;
			int contador2 = 0;
			String fecha = "2019";
			String fecha2 ="2018" ;
			while(ficheroLeer.hasNextLine()) 
				{
					linea = ficheroLeer.nextLine();
					String [] palabras = linea.split(";");

					if(palabras[1].equalsIgnoreCase("Si") && palabras[2].equalsIgnoreCase(fecha))
					{
						contadorCon++;
					}
					if ( palabras[1].equalsIgnoreCase("No") && palabras[2].equalsIgnoreCase(fecha2))
					{
						contadorSin++;
					}
					if (palabras[2].equals(fecha)) {
						contador++;
					}
					if (palabras[2].equals(fecha2)) {
						contador2++;
					}	
				}
			System.out.println("Con divorcio previo en 2019:"+ contadorCon);
			System.out.println("divorcios en 2019:"+contador);
			System.out.println("Sin divorcio previo en 2018:"+ contadorSin);
			System.out.println("divorcios en 2018:"+ contador2);


		}catch(FileNotFoundException e)
		{
			System.out.println(e.getClass());
			System.out.println("no se puede abrir el archivo " + nombre);
		}
	}
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		/*
		 * Solicita al usuario el fichero para escribibr en �l los datos
		 * CON formato.
		 */
		System.out.print("Dame la ruta + nombre del fichero ");
		String nombreFichero = "C:\\Users\\rut12\\Desktop\\Divorcios.csv";
		System.out.println();
		
		leerfichero(nombreFichero);
	}

}
