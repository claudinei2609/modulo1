package br.com.fabricadeprogramador.aula7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import br.com.fabricadeprogramador.aula2.Cliente;

public class ProgramaPrincipalSet {

	public static void main(String[] args) {
		Set<Cliente> conjunto = new HashSet<Cliente>();
		
		Cliente c1 = new Cliente();
		c1.setNome("Jão");

		Cliente c2 = new Cliente();
		c2.setNome("Jão");
		
		Cliente c3 = new Cliente();
		c3.setNome("Maria");
		
		System.out.println(conjunto.add(c1)); //true
		System.out.println(conjunto.add(c2)); //false
		System.out.println(conjunto.add(c3));// true
		
		Iterator<Cliente> iterador = conjunto.iterator();
		while (iterador.hasNext()){
			Cliente c = iterador.next();
			System.out.println(c.getNome());
		}
		
		for (Cliente c : conjunto) {
			System.out.println(c.getNome());
		}
		
		

		
	}

}
