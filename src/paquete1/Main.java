package paquete1;

public class Main {

	public static void main(String[] args) {
		MySimpleLinkedList<Integer> lista = new MySimpleLinkedList<>();
		
		
		lista.insertFront(10);
		lista.insertFront(20);
		lista.insertFront(30);
		lista.insertFront(40);
		
		 System.out.println("Lista después de insertFront: " + lista);
		 
		 
		 System.out.println(lista.indexOf(10));
		 
		 for(int val : lista) {
			 System.out.println(val);
		 }
		 //sigue iterando la verdad, no hay mejora en terminos de complejidad medio que es o(n) xd
		 


	}

}
