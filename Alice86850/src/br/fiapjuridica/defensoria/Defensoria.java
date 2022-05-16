package br.fiapjuridica.defensoria;

import br.fiapjuridica.processo.Processo;

public class Defensoria {

	private Processo[] lista;
	private int indice;
	Processo processo = new Processo(null, null, null, null);

	public Defensoria(int tamanho) {
		super();
		tamanho = tamanho;
		lista = new Processo[indice];
	}

	public void inserir(Processo processo) {
		if (indice < lista.length) {
			lista[indice] = processo;
			indice++;
		}
	}

	public void encerrar(int codigo, String DataEncerramento) {
		Processo aux = null;

		for (int i = 0; i < indice; i++) {
			if (lista[i].getCodigo() == codigo) {
				aux = lista[i];
			}
			
			if(lista[i].getDataEncerramento() == null) {
				DataEncerramento = DataEncerramento;
			} else
				break;
		}
		
	}
	
	public String listar() {
		String processosA = "Processos Abertos\n";
		String processosE = "Processos Encerrados\n";
		
		for(int i = 0; i < indice; i++) {
			if(lista[i] instanceof Processo) {
				processosA += lista[i] + "\n";
			} else {
				processosE += lista[i] + "\n";
			}
		}
		
		return processosA+"\n"+processosE;
	}

	public Processo[] getLista() {
		return lista;
	}

	public void setLista(Processo[] lista) {
		this.lista = lista;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	public Processo getProcesso() {
		return processo;
	}

	public void setProcesso(Processo processo) {
		this.processo = processo;
	}
	
	

}
