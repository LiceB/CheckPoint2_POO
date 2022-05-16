package br.fiapjuridica.processo;

import br.fiapjuridica.advogado.Advogado;

public class Processo {
	
	private int codigo;
	private String dataAbertura;
	private String dataEncerramento;
	private String nomeDoCliente;
	private Advogado advogado;
	
	public Processo(int codigo, String dataAbertura, String nomeDoCliente, Advogado advodado) {
		super();
		this.codigo = codigo;
		this.dataAbertura = dataAbertura;
		this.nomeDoCliente = nomeDoCliente;
		this.advogado = advodado;
	}	
	
	public Processo(int codigo2, String dataAbertura2, String nomeDoCliente2, String string) {
		// TODO Auto-generated constructor stub
	}

	public Processo(Object object, Object dataAbertura2, Object nomeDoCliente2, Object advodado) {
		// TODO Auto-generated constructor stub
	}

	public String getDados() {
		String aux = "";
		aux += "Código: " + codigo + "\n";
		aux += "Data de abertura: " + dataAbertura + "\n";
		aux += "Data de encerramento: " + dataEncerramento + "\n";
		aux += "Nome: " + nomeDoCliente + "\n";
		aux += "Dados advogado: " + advogado.getArea();
		aux += "Dados advogado: " + advogado.getMatricula();
		return aux;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public String getDataEncerramento() {
		return dataEncerramento;
	}

	public void setDataEncerramento(String dataEncerramento) {
		this.dataEncerramento = dataEncerramento;
	}

	public String getNomeDoCliente() {
		return nomeDoCliente;
	}

	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}

	public Advogado getAdvogado() {
		return advogado;
	}

	public void setAdvogado(Advogado advogado) {
		this.advogado = advogado;
	}
	
	
}
