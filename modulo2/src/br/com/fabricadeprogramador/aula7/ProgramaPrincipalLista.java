package br.com.fabricadeprogramador.aula7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.fabricadeprogramador.aula2.Cliente;

public class ProgramaPrincipalLista {
	public static void main(String[] args) {
		Cliente c1 =  new Cliente();
		c1.setNome("Jão");
		
		List<Cliente> lista =  new ArrayList<>();
		lista.add(c1);
		lista.add(new Cliente("Maria"));
		
//		for (Cliente c : lista) {
//			System.out.println(c.getNome());
//		}
//		
//		for(int i=0; i< lista.size(); i++){
//			Cliente c =  lista.get(i);
//			System.out.println(c.getNome());
//		}
		
		Iterator<Cliente> iterador = lista.iterator();
		Cliente c;
		while (iterador.hasNext()){
			c = iterador.next();
			System.out.println(c.getNome());
		}
		
		
		
		
		
	}
}
