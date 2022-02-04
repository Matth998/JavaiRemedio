package br.com.projeto1.javai.remedio;

import java.util.Scanner;

public class Validacao implements InterfaceValida{

	static int valida = 0; // --> Variavel Global
	static String valida1;
	static Integer test = 0;
	static Customizacao custom = new Customizacao();
	
	//Fun��o valida paciente, que est� recebendo como parametro o Scanner
		public void validaPaciente(Scanner entradaText, Scanner entradaNum, Usuario p1) {
			
			System.out.println("Voc� � maior de 18 anos? [ 1- SIM || 2- N�O ]");
			valida = entradaNum.nextInt();
			custom.separadorX();
			
			if(valida == 1) {
				
				validaEndereco(entradaText, entradaNum, p1); // --> Caso seja validado, chama a fun��o para validar o Endere�o
				
			}else {
				
				System.out.println("Voc� n�o tem permiss�o!"); //--: Se n�o for, encerra o programa.
				
			}
			
		}

		public void validaEndereco(Scanner entradaText, Scanner entradaNum, Usuario p1) {
			
			System.out.println("Voc� reside no Estado de S�o Paulo? [ 1- SIM || 2- N�O ]");
			valida = entradaNum.nextInt();
			custom.separadorX();
			
			if(valida == 1) {
				
				possuiCadastro(entradaText, entradaNum, p1); // --> Caso seja validado, chama a fun��o para verificar se cont�m cadastro.
				
			}else {
				
				System.out.println("Voc� n�o tem permiss�o!"); //--: Se n�o for, encerra o programa.
				
			}
			
		}


		public void possuiCadastro(Scanner entradaText, Scanner entradaNum, Usuario p1) {
			
			System.out.println("Voc� possui cadastro? [ 1- SIM || 2- N�O ]");
			valida = entradaNum.nextInt();
			custom.separadorX();
			
			if(valida == 1) {
				
				medicamentoLista(entradaNum); // --> Chama a fun��o para verificar a lista de remedio.
				
			}else if (valida == 2){
				
				cadastroPaciente(entradaText, entradaNum, p1); //--> Puxa para fazer o cadastro.
				
			}else {
				
				System.out.println("Op��o inv�lida!");
				
			}
			
		}
		
		public void medicamentoLista(Scanner entradaText) {
			//Caso n�o der para importar, colocar um link para o usuario acessar e verificar a lista.
			System.out.println("Voc� procura uma medica��o de alto custo? [ 1- SIM || 2- N�O ]");
			valida = entradaText.nextInt();
			custom.separadorX();
			
			if(valida == 1) {
				
				custom.separadorX();
				ListaRemedio.listaRemedio();
				custom.separadorX();
				System.out.println("O rem�dio que voc� procura, est� na lista? [ 1- SIM || 2- N�O ]");
				valida = entradaText.nextInt();
				
				if(valida == 1) {
					
					custom.separadorX();
					BuscaServidor.achouRemedio();
					
				}else if(valida == 2) {
					
					System.out.println("Para mais informa��es procure a UBS mais pr�xima.");
					
				}
				
			}else if (valida == 2){
				
				System.out.println("Para mais informa��es procure a UBS mais pr�xima.");
				
			}else {
				
				System.out.println("Op��o Inv�lida");
				
			}
			
		}


		public void cadastroPaciente(Scanner entradaText, Scanner entradaNum, Usuario p1) {
			
			System.out.print("Digite o seu nome completo: ");
			p1.setName(entradaText.nextLine());
			System.out.println();// --> NextLine, pois ele pega a linha inteira, o Next ap�s utilizar o espa�o, ele n�o registra mais.
			System.out.print("Digite o seu endere�o: ");
			p1.setAndress(entradaText.nextLine());
			System.out.println();
			System.out.print("Digite sua data de nascimento: ");
			p1.setDataDeNasc(entradaText.nextLine());
			System.out.println();
			System.out.print("Digite o n�mero do seu cart�o do SUS: ");
			p1.setCartaoSus(Integer.parseInt(entradaText.nextLine())); // --> parseInt � para converter uma String em um n�mero inteiro.
			System.out.println();
			System.out.print("Digite o seu email: ");
			p1.setEmail(entradaText.nextLine());	
			
			medicamentoLista(entradaNum);
			
		}
	
}
