package br.com.caelum.jdbc.teste;

import java.util.GregorianCalendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaInsere {

	public static void main(String[] args) {
		Contato contato = new Contato("Fernando", "fernando@gmail.com", "Tomas Aquino", new GregorianCalendar(1987, 06, 25));

		ContatoDao dao = new ContatoDao();
		dao.adiciona(contato);
	}
	
}
