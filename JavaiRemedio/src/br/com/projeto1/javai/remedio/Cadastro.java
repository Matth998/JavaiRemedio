package br.com.projeto1.javai.remedio;

import java.util.Scanner;

public class Cadastro {
	
	public static void main(String[] args) {
		
		Scanner entradaText = new Scanner(System.in);
		Scanner entradaNum = new Scanner(System.in);
		Usuario p1 = new Usuario();
		Validacao validacao = new Validacao();
		Customizacao logo = new Customizacao();
		
		logo.logo();
		
		validacao.validaPaciente(entradaText, entradaNum, p1); // --> Chamada da função que valida o Paciente.
		PesquisaSatisfacao.pesquisa(entradaNum);
		
	}
	
}
