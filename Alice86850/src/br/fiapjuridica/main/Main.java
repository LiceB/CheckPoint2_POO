package br.fiapjuridica.main;

import br.fiapjuridica.advogado.Advogado;
import br.fiapjuridica.defensoria.Defensoria;
import br.fiapjuridica.processo.Processo;

public class Main {

	public static void main(String[] args) {
		Defensoria defen = new Defensoria(4);
		
		Advogado advogado1 = new Advogado(5, "Adriana", "Criminal");
		Advogado advogado2 = new Advogado(7, "Ana");
		Advogado advogado3 = new Advogado(9, "Maria");
		Advogado advogado4 = new Advogado(6, "Amanda");
		
		Processo p1 = new Processo(1, "01/01/2022", "Alice", advogado1);
		Processo p2 = new Processo(2, "02/01/2022", "Ester", advogado2);
		Processo p3 = new Processo(3, "03/01/2022", "João", advogado3);
		Processo p4 = new Processo(4, "04/01/2022", "Naomi", advogado4);
		
		defen.inserir(p1);
		defen.inserir(p2);
		defen.inserir(p3);
		defen.inserir(p4);
		
		defen.encerrar(1, "01/02/2022");
		defen.encerrar(2, "05/03/2022");
		
		System.out.println(defen.listar());
				
	}

}
