package ejercicio4;

import java.util.Scanner;

public class Recursivo 
{
	public static int [] tablaMultiplicar() {
		
	}
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		int [] t = {1,2,3,4};
		System.out.println(tablaMultiplicar(t,0, n));
	}

}
