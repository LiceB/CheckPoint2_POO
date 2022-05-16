package br.fiapjuridica.main;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

import br.fiapjuridica.defensoria.Defensoria;
import br.fiapjuridica.processo.Processo;

public class Main {

	public static void main(String[] args) {
		Defensoria[] defen = new Defensoria[2];
		
		
		int p1 = parseInt(showInputDialog("Código: "));
		p1 += parseInt(showInputDialog("Data de abertura: "));
		p1 += parseInt(showInputDialog("Data de encerramento: "));
		p1 += parseInt(showInputDialog("Nome: "));
		
		int p2 = parseInt(showInputDialog("Código: "));
		p2 += parseInt(showInputDialog("Data de abertura: "));
		p2 += parseInt(showInputDialog("Data de encerramento: "));
		p2 += parseInt(showInputDialog("Nome: "));
		
		int p3 = parseInt(showInputDialog("Código: "));
		p3 += parseInt(showInputDialog("Data de abertura: "));
		p3 += parseInt(showInputDialog("Data de encerramento: "));
		p3 += parseInt(showInputDialog("Nome: "));
		
		int p4 = parseInt(showInputDialog("Código: "));
		p4 += parseInt(showInputDialog("Data de abertura: "));
		p4 += parseInt(showInputDialog("Data de encerramento: "));
		p4 += parseInt(showInputDialog("Nome: "));
		
		
	}

}
