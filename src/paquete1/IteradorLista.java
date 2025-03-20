package paquete1;

import java.util.Iterator;

public class IteradorLista<T> implements Iterator<T> {
	private Node<T> first;
	
	public IteradorLista(Node n) {
		this.first = n;
	}

	@Override
	public boolean hasNext() {
		return first != null;
 	}

	@Override
	public T next() {
		if(!hasNext()) {
			System.out.println("se paso rey");
		}
		T valor = first.getInfo();
		first = first.getNext();
		return valor;
	}

}
