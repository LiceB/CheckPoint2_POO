package br.fiapjuridica.defensoria;

import br.fiapjuridica.processo.Processo;

public class Defensoria {

	private Processo[] lista;
	private int indice;

	public Defensoria(int tamanho) {
		lista = new Processo[tamanho];
	}

	public void inserir(Processo processo) {
		if (indice < lista.length) {
			lista[indice] = processo;
			indice++;
		}
	}

	public void encerrar(int codigo, String DataEncerramento) {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i].getCodigo() == codigo) {
				lista[i].setDataEncerramento(DataEncerramento);
			}
		}

	}

	public String listar() {
		String aux = "";
		for (int i = 0; i < lista.length; i++) {
			aux += lista[i].getDados();
		}
		return aux;
	}

	public Processo[] getLista() {
		return lista;
	}

	public int getIndice() {
		return indice;
	}

	public void setLista(Processo[] lista) {
		this.lista = lista;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

}
