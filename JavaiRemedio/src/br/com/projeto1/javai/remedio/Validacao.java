package br.com.projeto1.javai.remedio;

import java.util.Scanner;

public class Validacao implements InterfaceValida{

	static int valida = 0; // --> Variavel Global
	static String valida1;
	static Integer test = 0;
	static Customizacao custom = new Customizacao();
	
	//Função valida paciente, que está recebendo como parametro o Scanner
		public void validaPaciente(Scanner entradaText, Scanner entradaNum, Usuario p1) {
			
			System.out.println("Você é maior de 18 anos? [ 1- SIM || 2- NÃO ]");
			valida = entradaNum.nextInt();
			custom.separadorX();
			
			if(valida == 1) {
				
				validaEndereco(entradaText, entradaNum, p1); // --> Caso seja validado, chama a função para validar o Endereço
				
			}else {
				
				System.out.println("Você não tem permissão!"); //--: Se não for, encerra o programa.
				
			}
			
		}

		public void validaEndereco(Scanner entradaText, Scanner entradaNum, Usuario p1) {
			
			System.out.println("Você reside no Estado de São Paulo? [ 1- SIM || 2- NÃO ]");
			valida = entradaNum.nextInt();
			custom.separadorX();
			
			if(valida == 1) {
				
				possuiCadastro(entradaText, entradaNum, p1); // --> Caso seja validado, chama a função para verificar se contém cadastro.
				
			}else {
				
				System.out.println("Você não tem permissão!"); //--: Se não for, encerra o programa.
				
			}
			
		}


		public void possuiCadastro(Scanner entradaText, Scanner entradaNum, Usuario p1) {
			
			System.out.println("Você possui cadastro? [ 1- SIM || 2- NÃO ]");
			valida = entradaNum.nextInt();
			custom.separadorX();
			
			if(valida == 1) {
				
				medicamentoLista(entradaNum); // --> Chama a função para verificar a lista de remedio.
				
			}else if (valida == 2){
				
				cadastroPaciente(entradaText, entradaNum, p1); //--> Puxa para fazer o cadastro.
				
			}else {
				
				System.out.println("Opção inválida!");
				
			}
			
		}
		
		public void medicamentoLista(Scanner entradaText) {
			//Caso não der para importar, colocar um link para o usuario acessar e verificar a lista.
			System.out.println("Você procura uma medicação de alto custo? [ 1- SIM || 2- NÃO ]");
			valida = entradaText.nextInt();
			custom.separadorX();
			
			if(valida == 1) {
				
				custom.separadorX();
				ListaRemedio.listaRemedio();
				custom.separadorX();
				System.out.println("O remédio que você procura, está na lista? [ 1- SIM || 2- NÃO ]");
				valida = entradaText.nextInt();
				
				if(valida == 1) {
					
					custom.separadorX();
					BuscaServidor.achouRemedio();
					
				}else if(valida == 2) {
					
					System.out.println("Para mais informações procure a UBS mais próxima.");
					
				}
				
			}else if (valida == 2){
				
				System.out.println("Para mais informações procure a UBS mais próxima.");
				
			}else {
				
				System.out.println("Opção Inválida");
				
			}
			
		}


		public void cadastroPaciente(Scanner entradaText, Scanner entradaNum, Usuario p1) {
			
			System.out.print("Digite o seu nome completo: ");
			p1.setName(entradaText.nextLine());
			System.out.println();// --> NextLine, pois ele pega a linha inteira, o Next após utilizar o espaço, ele não registra mais.
			System.out.print("Digite o seu endereço: ");
			p1.setAndress(entradaText.nextLine());
			System.out.println();
			System.out.print("Digite sua data de nascimento: ");
			p1.setDataDeNasc(entradaText.nextLine());
			System.out.println();
			System.out.print("Digite o número do seu cartão do SUS: ");
			p1.setCartaoSus(Integer.parseInt(entradaText.nextLine())); // --> parseInt é para converter uma String em um número inteiro.
			System.out.println();
			System.out.print("Digite o seu email: ");
			p1.setEmail(entradaText.nextLine());	
			
			medicamentoLista(entradaNum);
			
		}
	
}
