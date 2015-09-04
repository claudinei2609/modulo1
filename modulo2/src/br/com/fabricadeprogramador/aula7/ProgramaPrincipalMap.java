package br.com.fabricadeprogramador.aula7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ProgramaPrincipalMap {

	public static void main(String[] args) {
		
		Map<String, String> linguagensProgramacao =  new HashMap<String, String>();
		linguagensProgramacao.put("Java", "Oracle");
		linguagensProgramacao.put("C#", "Microsoft");
		
		Set<String> chaves = linguagensProgramacao.keySet();
		for (String c: chaves){
			System.out.println(c +  ": "+ linguagensProgramacao.get(c));
		}
	}

}
