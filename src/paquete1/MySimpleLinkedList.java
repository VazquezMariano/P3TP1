package paquete1;

import java.util.Iterator;

public class MySimpleLinkedList<T extends Comparable<T>> implements Iterable<T>{
	
	private Node<T> first;
	private int size;
	
	public MySimpleLinkedList() {
		this.first = null;
		this.size = 0;
	}
	
	public void insertFront(T info) {
		Node<T> tmp = new Node<T>(info,null);
		tmp.setNext(this.first);
		this.first = tmp;
		this.size = this.size + 1;
	}
	
	public void insertInOrder(T info) {
        Node<T> newNode = new Node<>(info, null);

        // Caso 1: La lista está vacía o el nuevo elemento es menor que el primero
        if (this.isEmpty() || info.compareTo(this.first.getInfo()) < 0) {
            newNode.setNext(this.first);
            this.first = newNode;
        } else {
            // Caso 2: Buscar la posición correcta para insertar
            Node<T> current = this.first;
            while (current.getNext() != null && info.compareTo(current.getNext().getInfo()) >= 0) {
                current = current.getNext();
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
        this.size++; // Incrementar el tamaño de la lista
    }
	
	public T extractFront() {		
		if(this.isEmpty()) {
			return null;
		}
		
		T dato = this.first.getInfo();
		this.first = this.first.getNext();
		this.size = this.size - 1;
		return dato;
	}

	public boolean isEmpty() {
		return this.first == null;
	}
	
	public T get(int index) {
		if(index < 0 || index >= this.size) {
			throw new IndexOutOfBoundsException("Índice fuera de rango"); 
		}
		Node<T> actual = this.first;
		for(int i = 0; i < index; i++) {
			actual = actual.getNext();
		}
		return actual.getInfo();
	}
	
	public int size() {
		return this.size;
	}
	
	public int indexOf(T n) {
		Node<T> actual = this.first;
		for(int i = 0; i < this.size(); i++) {
			if(actual.getInfo() == n) {
				return i;
			}
			actual = actual.getNext();
		}
		return -1;
	}
	
	@Override
	public String toString() {
		String fin = "";
		Node<T> actual = this.first;
		while(actual != null) {
			fin = fin + actual.getInfo();
			if(actual.getNext() != null) {
				fin = fin + "->";
			}
			actual = actual.getNext();
		}
		return fin;
	}

	@Override
	public Iterator<T> iterator() {
		return new IteradorLista(this.first);
	}


	
	
}

