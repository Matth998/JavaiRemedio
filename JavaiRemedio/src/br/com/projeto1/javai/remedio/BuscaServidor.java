package br.com.projeto1.javai.remedio;

import java.util.Scanner;

import br.com.projeto1.javai.bancodedados.BancoDeDados;
import br.com.projeto1.javai.servidor.Servidor;

public class BuscaServidor {

	
	public static void achouRemedio() {
	
		Servidor servidor = new Servidor();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o nome do rem�dio?");
		BancoDeDados consulta = servidor.remedioNome(entrada.nextLine());
		Customizacao custom = new Customizacao();
		
		if(consulta.getRemedio() != null) {
			
			custom.separadorLinha();
			System.out.println();
			System.out.println("Voc� pode retirar o seu rem�dio na Farm�cia de Alto Custo mais pr�xima,"
					+ "\nverifique o endere�o no seu email."
					+ "\nN�o esque�a seu RG, cart�o do SUS e laudo do m�dico atualizado.");
		}
		
		entrada.close();
	}
	
	
}
