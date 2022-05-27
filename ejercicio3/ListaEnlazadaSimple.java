package ejercicio3;

public class ListaEnlazadaSimple 
{
	private Node first;
	private int size;
	
	public ListaEnlazadaSimple() 
	{
		this.first=null;
		this.size=0;
	}
	public ListaEnlazadaSimple(Node first) {
		this.first=first;
		this.size= 1;
	}
	public Node getFirst() {
		return first;
	}
	public void setFirst(Node first) {
		this.first = first;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

	public boolean add(Node node) 
	{
		try {
			 //creamos nodo(puntero) para desplazar (copia de first xq first no se puede desapuntar de antes)
			if (size == 0) { //no hay nodos
				first = node; //first apunta al nodo q le doy yo --> first esta en la primera posicion
			}
			else { //sino vale cero buscar p que apunte al ultimo
				Node p = first;
				for(int i = 1; i <size;i++) //recorrer a los siguientes nodos
				{
					p= p.getNext();
				}
				p.setNext(node);//mandasel puntero al nodo del final que le has pasado
			}
			size++;
			return true;
		}catch(Exception e) {
			System.out.println(e.toString());
			return false;
		}
	}
	public boolean add(int position, Node node) 
	{
		if(position == 0) { //cuando queremos que apunte al first 
			node.setNext(first);//apunta al que ahora es el primero
			first = node;//ahora el nodo el es first 
		}else if(position == size) 
		{
			return add(node);
		}
		else {
			Node p = first;
			for(int i = 1; i < position ; i++) //recorrer a el nodo position 1 el del medio
			{
				p = p.getNext();//el first apunta a la posicion anterior a la que meter el node que le paso(3)
			}
			node.setNext(p.getNext()); //el nodo que le paso yo apunta a la posicion que quiero(4)
			p.setNext(node); //la first apunta al nodo que le paso yo 3--> 4
			size++;
		}
		return true;
	}
	public Node get(int position) 
	{
		try {
			if (position >= 0 && position < size) 
			{
				Node p = first;
				for(int i = 1; i < position ; i++) //recorrer los nodo hasta la posicion que le mandas
				{
					p = p.getNext();
				}
				return  p ;
			}	
		}catch(Exception e) 
		{
			System.out.println(e.toString());
		}
		return null;
	}

	public boolean delete(int position) 
	{
		Node p = first;
		
		if (size == 1) 
		{ 
			first = null;
		}
		else if (position == 0)
		{
			Node next = first.getNext();
			first.setNext(null);
			first = next;
		}
		else if(position == size) 
		{
			for(int i = 1; i < position ; i++) //recorrer a el nodo position 1 el del medio
			{
				p = p.getNext();//el first apunta a la posicion anterior a la que meter el node que le paso(3)
			}
			p.setNext(null);
		}
		else {
			p = first;
			for(int i = 1; i < position ; i++) //recorrer a el nodo position 1 el del medio
			{
				p = p.getNext();//el first apunta a la posicion anterior a la que meter el node que le paso(3)
			}
			
			p.setNext(p.getNext().getNext());
			p.getNext().setNext(null);
		}
		size--;
		return true;
	}
	
	public void eliminarMayor() 
	{
		Node p = first;
		Node node = new Node(size,node);
		for (int i = 0; i< size;i++) {
			for(int j = 0; j<size;j++) 
			{ 
				p= p.getNext();
				if(p.getContent() > node.getContent()) {
					
				}
				
			}
		}
		
	}

	public void show() 
	{
		Node p = first; 
		for(int i= 0 ; i< size; i++) {
			System.out.println("["+ i +"]->" + p.getContent());
			p= p.getNext();
		}
	}
}