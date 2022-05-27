package ejercicio1;

public class Texto 
{
	private String letra;
	private String palabra;
	private int posicion;
	
	public Texto(String letra, String palabra, int posicion) {
		super();
		this.letra = letra;
		this.palabra = palabra;
		this.posicion = posicion;
	}

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	
	
	

}
