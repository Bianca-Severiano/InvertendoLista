package view;
import Model.PilhaInt;
import bilbioteca.fila.dinamica.generica.model.Lista;

public class Principal {

	public static void main(String Args[]) throws Exception {
		Lista<Integer> l = new Lista<Integer>();
		PilhaInt p = new PilhaInt();
		l.addFirst(16);
		l.addFirst(4);
		l.addFirst(13);
		l.addFirst(2);
		l.addFirst(6);
		l.addFirst(7);
		l.addFirst(9);
		l.addFirst(12);
		l.addFirst(18);
		l.addFirst(5);
		l.addFirst(3);
		
		int tamanho;
		int aux = 0;
		while (!l.isEmpty()) {
			tamanho = (l.size()-1);
			try {
				aux = l.get(tamanho);
				l.removeLast();
				p.push(aux);
				System.out.print(aux + " ");
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}

		System.out.println(" ");
		while (!p.isEmpty()) {
			try {
				aux = p.pop();
				if (l.isEmpty()) {
					l.addFirst(aux);
				}
					l.addLast(aux);
				System.out.print(aux + " ");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
