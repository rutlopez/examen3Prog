package ejercicio3;

public class Main 
{
	public static void main(String []args) {
		ListaEnlazadaSimple l = new ListaEnlazadaSimple();
		Node n1 = new Node(20, null);
		l.add(n1);
		Node n2 = new Node(40, null);
		l.add(n2);
		Node n3= new Node(30, null);
		l.add(1, n3);
		l.show();
		System.out.println(l.get(2).getContent());
		
		
	}
}
