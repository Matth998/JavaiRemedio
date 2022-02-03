package br.com.projeto1.javai.remedio;

import java.util.Scanner;

public class PesquisaSatisfacao {

	public static void pesquisa(Scanner leia) {
		
		int entrada =0 ;
		
		Customizacao custom = new Customizacao();
		
		custom.separadorLinha();
		System.out.println("Escreva aqui a Nota para programa: [1 à 5 || Sendo 1 a nota mais baixa e 5 a mais alta] ");
			entrada=leia.nextInt();
		custom.separadorLinha();
		if(entrada ==1) {
			System.out.println("Precisamos e vamos melhorar... \nMuito obrigado pelo seu feedback!");
			}
		if(entrada ==2) {
					System.out.println("Precisamos melhorar ainda mais... \nMuito obrigado pelo seu feedback!");	
					}
		if(entrada ==3) {
					System.out.println("Estamos crescendo e evoluindo com a sua ajuda...\nMuito obrigado pelo seu feedback!");
					}
		if(entrada ==4) {
					System.out.println("É uma boa nota, mas vamos melhorar ainda mais...\nMuito obrigado pelo seu feedback!");
					}
		if(entrada ==5) {
					System.out.println("Muito obrigado pelo seu feedback!\nVocê é a causa do nosso crescimento! ");
					}
		if(entrada != 1 && entrada != 2 && entrada != 3 && entrada != 4 && entrada != 5) {
					System.out.println("Você digitou um número inválido... vamos tentar de novo?");
					}
		custom.separadorLinha();
			}
	
}
