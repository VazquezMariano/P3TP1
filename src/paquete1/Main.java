package paquete1;

public class Main {

	public static void main(String[] args) {
		MySimpleLinkedList<Integer> lista = new MySimpleLinkedList<>();
		
		
		lista.insertFront(10);
		lista.insertFront(30);
		lista.insertFront(40);
		lista.insertFront(20);
		
		MySimpleLinkedList<Integer> lista1 = new MySimpleLinkedList<>();
		
		
		lista1.insertFront(80);
		lista1.insertFront(40);
		lista1.insertFront(90);
		lista1.insertFront(30);
		lista1.insertFront(20);
		
		//System.out.println("Lista después de insertFront: " + lista);
		 
		 
		 //System.out.println(lista.indexOf(10));
		 /*
		 for(int val : lista) {
			 System.out.println(val);
		 }
		 */
		 //sigue iterando la verdad, no hay mejora en terminos de complejidad medio que es o(n) xd
		 
		/*
		 MySimpleLinkedList<Integer> listaOrdenada = new MySimpleLinkedList<>();
		 
		 for(int val : lista) {
			 for(int val1 : lista1) {
				 if(val == val1) {
					 listaOrdenada.insertInOrder(val);
				 }
			 }
		 }

		 
		 System.out.println(listaOrdenada);
		 */
		 MySimpleLinkedList<Integer> listaRepetidos = new MySimpleLinkedList<>();
		 
		 for(int val : lista) {
			 for(int val1 : lista1) {
				 if(val == val1) {
					 listaRepetidos.insertFront(val);
				 }
			 }
		 }
		 System.out.println(listaRepetidos);
		 MySimpleLinkedList<Integer> listaFinal = new MySimpleLinkedList<>();
		 for(int val : lista) {
			 if(!(listaRepetidos.contains(val))) {
				 listaFinal.insertFront(val);
			 }
		 }
		 System.out.println(listaFinal);
		 
		 
		 
		 


	}

}
