package br.com.fabricadeprogramador.aula2;

import java.time.LocalDate;
import java.util.Date;

public class DuvidaDate {

	public static void main(String[] args) {
		
		Evento ev = new Evento();
		//Criando como um objeto de data
		Date data = new Date();
		data.setDate(25);
		data.setMonth(11);
		data.setYear(115);
		
		ev.setData(data);
		System.out.println(ev.getData());
	}

}
