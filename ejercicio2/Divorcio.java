package ejercicio2;

public class Divorcio 
{
	private String localidad;
	private int contador;
	
	public Divorcio(String localidad, int contador) {
		super();
		this.localidad=localidad;
		this.contador= contador;
	}
	
	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}
}
