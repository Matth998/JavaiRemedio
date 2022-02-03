package br.com.projeto1.javai.remedio;

import java.util.Scanner;

public interface InterfaceValida {

	public void validaPaciente(Scanner entradaText, Scanner entradaNum, Usuario p1);
	public void validaEndereco(Scanner entradaText, Scanner entradaNum, Usuario p1);
	public void possuiCadastro(Scanner entradaText, Scanner entradaNum, Usuario p1);
	public void medicamentoLista(Scanner entradaText);
	public void cadastroPaciente(Scanner entradaText, Scanner entradaNum, Usuario p1);
}
