package ejercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FicheroTexto 
{
	private static void leerfichero(String nombre, String letra) 
	{
		try{
			File file = new File(nombre);
			Scanner ficheroLeer = new Scanner(file);
			int posicion = 0;
			ArrayList<Texto> texto = new ArrayList<Texto>();
			while(ficheroLeer.hasNextLine()) 
			{
				String linea = ficheroLeer.nextLine(); //recojo las lineas 
				String [] palabra= linea.split(" "); //quito los espacios

				for (int i =0;i<palabra.length;i++) {

					if(palabra[i].substring(0).startsWith(letra)) 
					{
						posicion = i; 
						Texto textos=  new Texto(letra, palabra[i], posicion);
						texto.add(textos);
					}
					if(palabra[i].substring(palabra[i].length() -1).endsWith(letra))
					{
						posicion = i;
						Texto textos=  new Texto(letra, palabra[i], posicion);
						texto.add(textos);
					}
				}

			}
			for (int i= 0 ;i<texto.size(); i++)
			{
				System.out.println(texto.get(i).getPalabra() +" "+ texto.get(i).getPosicion());
			}
			ficheroLeer.close();
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{	/*
		 * Solicita al usuario el fichero para escribibr en él los datos
		 * CON formato.
		 */
		Scanner entrada = new Scanner(System.in);
		String nombreFichero = "C:\\Users\\rut12\\Desktop\\HablanosDelDon.txt";
		String letra= entrada.nextLine();
		leerfichero(nombreFichero,letra);
	}

}
