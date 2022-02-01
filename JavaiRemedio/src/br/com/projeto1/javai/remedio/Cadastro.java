package br.com.projeto1.javai.remedio;

import java.util.Scanner;

public class Cadastro {

	
	static int valida = 0; // --> Variavel Global
	
	public static void main(String[] args) {
		
		Scanner entradaText = new Scanner(System.in);
		Scanner entradaNum = new Scanner(System.in);
		Usuario p1 = new Usuario();
		
		
		validaPaciente(entradaText, entradaNum, p1); // --> Chamada da fun��o que valida o Paciente.

	}

	
	//Fun��o valida paciente, que est� recebendo como parametro o Scanner
	public static void validaPaciente(Scanner entradaText, Scanner entradaNum, Usuario p1) {
		
		System.out.println("Voc� � maior de 18 anos? [ 1- SIM || 2- N�O ]");
		valida = entradaNum.nextInt();
		
		if(valida == 1) {
			
			validaEndereco(entradaText, entradaNum, p1); // --> Caso seja validado, chama a fun��o para validar o Endere�o
			
		}else {
			
			System.out.println("Voc� n�o tem permiss�o!"); //--: Se n�o for, encerra o programa.
			
		}
		
	}

	private static void validaEndereco(Scanner entradaText, Scanner entradaNum, Usuario p1) {
		
		System.out.println("Voc� reside no Estado de S�o Paulo? [ 1- SIM || 2- N�O ]");
		valida = entradaNum.nextInt();
		
		if(valida == 1) {
			
			possuiCadastro(entradaText, entradaNum, p1); // --> Caso seja validado, chama a fun��o para verificar se cont�m cadastro.
			
		}else {
			
			System.out.println("Voc� n�o tem permiss�o!"); //--: Se n�o for, encerra o programa.
			
		}
		
	}


	private static void possuiCadastro(Scanner entradaText, Scanner entradaNum, Usuario p1) {
		
		System.out.println("Voc� possui cadastro? [ 1- SIM || 2- N�O ]");
		valida = entradaNum.nextInt();
		
		if(valida == 1) {
			
			medicamentoLista(entradaNum); // --> Chama a fun��o para verificar a lista de remedio.
			
		}else {
			
			cadastroPaciente(entradaText, entradaNum, p1); //--> Puxa para fazer o cadastro.
			
		}
		
	}
	
	private static void medicamentoLista(Scanner entradaNum) {
		//Caso n�o der para importar, colocar um link para o usuario acessar e verificar a lista.
		System.out.println("O rem�dio est� na lista? [ 1- SIM || 2- N�O ]");
		valida = entradaNum.nextInt();
		
		if(valida == 1) {
			
			System.out.println("Voc� pode retirar o seu medicamento na UBS mais pr�xima, verifique o endere�o no seu email."
					+ "\nN�o esque�a seu RG, cart�o do SUS e receita m�dica atualizada.");
			
		}else {
			
			System.out.println("N�o encontrou o medicamento que procura? Poss�velmente ele"
					+ "\nn�o est� na lista procure a UBS mais pr�xima.");
			
		}
		
	}


	private static void cadastroPaciente(Scanner entradaText, Scanner entradaNum, Usuario p1) {
		
		System.out.print("Digite o seu nome completo: ");
		p1.setName(entradaText.nextLine()); // --> NextLine, pois ele pega a linha inteira, o Next ap�s utilizar o espa�o, ele n�o registra mais.
		System.out.print("Digite o seu endere�o: ");
		p1.setAndress(entradaText.nextLine());
		System.out.print("Digite sua data de nascimento: ");
		p1.setDataDeNasc(entradaText.nextLine());
		System.out.print("Digite o n�mero do seu cart�o do SUS: ");
		p1.setCartaoSus(Integer.parseInt(entradaText.nextLine())); // --> parseInt � para converter uma String em um n�mero inteiro.
		System.out.print("Digite o seu email: ");
		p1.setEmail(entradaText.nextLine());
		
		medicamentoLista(entradaNum);
		
	}
	
}
