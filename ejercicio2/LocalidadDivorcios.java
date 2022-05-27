package ejercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LocalidadDivorcios 
{
	private static void leerfichero(String nombre) 
	{
		File file = new File(nombre);
		try{
			Scanner ficheroLeer = new Scanner(file);
			String linea = ficheroLeer.nextLine();
			ArrayList <Divorcio> listaDivorcios= new ArrayList<Divorcio>();
			while(ficheroLeer.hasNextLine()) 
			{
				linea = ficheroLeer.nextLine();
				String [] divorcio = linea.split(";");
				String localidad = divorcio[0];
				String total = divorcio[4];
				int totales = Integer.parseInt(total);
				boolean estaEnElArray = false;
				
				for(int j=0; j<listaDivorcios.size();j++)
				{
					if(listaDivorcios.get(j).getLocalidad().equals(localidad)) // si el tipo que estoy buscando ya esta en el array
					{
						listaDivorcios.get(j).setContador(listaDivorcios.get(j).getContador() + totales); //a�adimos uno al contador
						estaEnElArray = true;
					}
				}
				if(estaEnElArray == false) //sino esta en el array que he creado de tipoavion lo meto 
				{
					Divorcio divorcios= new Divorcio(localidad, totales);//creo el fosa
					listaDivorcios.add(divorcios);// Añado fosa al arraylist
				}
			}
			for (int i= 0 ;i<listaDivorcios.size(); i++)
			{	
				for (int j =0; j<listaDivorcios.size();j++) 
				{
					if(listaDivorcios.get(i).getContador() < listaDivorcios.get(j).getContador())
					{
						Divorcio caja = listaDivorcios.get(i);
						listaDivorcios.set(i, listaDivorcios.get(j)); //pongo el valor mayor en primer lugar
						listaDivorcios.set(j, caja);// pone el valor pequeño en segundo lugar
					}
				}
			}	
			for (int i= 0 ;i<listaDivorcios.size(); i++)
			{
				System.out.println(listaDivorcios.get(i).getLocalidad() +" "+ listaDivorcios.get(i).getContador());
			}
			ficheroLeer.close();
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
		
		leerfichero(nombreFichero);
	}
}
