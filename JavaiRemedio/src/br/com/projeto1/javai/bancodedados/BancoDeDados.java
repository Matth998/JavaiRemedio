package br.com.projeto1.javai.bancodedados;

public class BancoDeDados {

	private String remedio;
	private int codigo;
	
	public BancoDeDados(String remedio, int codigo) {
		super();
		this.remedio = remedio;
		this.codigo = codigo;
	}

	public String getRemedio() {
		return remedio;
	}

	public void setRemedio(String remedio) {
		this.remedio = remedio;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
}
