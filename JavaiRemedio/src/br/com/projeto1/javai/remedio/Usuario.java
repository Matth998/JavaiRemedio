package br.com.projeto1.javai.remedio;

public class Usuario extends Pessoa{

	private String email;
	
	//Variavel integer é do tipo inteiro.
	private Integer cartaoSus;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getCartaoSus() {
		return cartaoSus;
	}
	public void setCartaoSus(Integer cartaoSus) {
		this.cartaoSus = cartaoSus;
	}

	
}
