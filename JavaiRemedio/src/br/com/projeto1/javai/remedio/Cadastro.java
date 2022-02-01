package br.com.projeto1.javai.remedio;

import java.util.Scanner;

public class Cadastro {

	
	static int valida = 0; // --> Variavel Global
	
	public static void main(String[] args) {
		
		Scanner entradaText = new Scanner(System.in);
		Scanner entradaNum = new Scanner(System.in);
		Usuario p1 = new Usuario();
		
		
		validaPaciente(entradaText, entradaNum, p1); // --> Chamada da função que valida o Paciente.

	}

	
	//Função valida paciente, que está recebendo como parametro o Scanner
	public static void validaPaciente(Scanner entradaText, Scanner entradaNum, Usuario p1) {
		
		System.out.println("Você é maior de 18 anos? [ 1- SIM || 2- NÃO ]");
		valida = entradaNum.nextInt();
		
		if(valida == 1) {
			
			validaEndereco(entradaText, entradaNum, p1); // --> Caso seja validado, chama a função para validar o Endereço
			
		}else {
			
			System.out.println("Você não tem permissão!"); //--: Se não for, encerra o programa.
			
		}
		
	}

	private static void validaEndereco(Scanner entradaText, Scanner entradaNum, Usuario p1) {
		
		System.out.println("Você reside no Estado de São Paulo? [ 1- SIM || 2- NÃO ]");
		valida = entradaNum.nextInt();
		
		if(valida == 1) {
			
			possuiCadastro(entradaText, entradaNum, p1); // --> Caso seja validado, chama a função para verificar se contém cadastro.
			
		}else {
			
			System.out.println("Você não tem permissão!"); //--: Se não for, encerra o programa.
			
		}
		
	}


	private static void possuiCadastro(Scanner entradaText, Scanner entradaNum, Usuario p1) {
		
		System.out.println("Você possui cadastro? [ 1- SIM || 2- NÃO ]");
		valida = entradaNum.nextInt();
		
		if(valida == 1) {
			
			medicamentoLista(entradaNum); // --> Chama a função para verificar a lista de remedio.
			
		}else {
			
			cadastroPaciente(entradaText, entradaNum, p1); //--> Puxa para fazer o cadastro.
			
		}
		
	}
	
	private static void medicamentoLista(Scanner entradaNum) {
		//Caso não der para importar, colocar um link para o usuario acessar e verificar a lista.
		System.out.println("O remédio está na lista? [ 1- SIM || 2- NÃO ]");
		valida = entradaNum.nextInt();
		
		if(valida == 1) {
			
			System.out.println("Você pode retirar o seu medicamento na UBS mais próxima, verifique o endereço no seu email."
					+ "\nNão esqueça seu RG, cartão do SUS e receita médica atualizada.");
			
		}else {
			
			System.out.println("Não encontrou o medicamento que procura? Possívelmente ele"
					+ "\nnão está na lista procure a UBS mais próxima.");
			
		}
		
	}


	private static void cadastroPaciente(Scanner entradaText, Scanner entradaNum, Usuario p1) {
		
		System.out.print("Digite o seu nome completo: ");
		p1.setName(entradaText.nextLine()); // --> NextLine, pois ele pega a linha inteira, o Next após utilizar o espaço, ele não registra mais.
		System.out.print("Digite o seu endereço: ");
		p1.setAndress(entradaText.nextLine());
		System.out.print("Digite sua data de nascimento: ");
		p1.setDataDeNasc(entradaText.nextLine());
		System.out.print("Digite o número do seu cartão do SUS: ");
		p1.setCartaoSus(Integer.parseInt(entradaText.nextLine())); // --> parseInt é para converter uma String em um número inteiro.
		System.out.print("Digite o seu email: ");
		p1.setEmail(entradaText.nextLine());
		
		medicamentoLista(entradaNum);
		
	}
	
}
