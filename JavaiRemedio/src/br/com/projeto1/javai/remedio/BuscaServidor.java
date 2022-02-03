package br.com.projeto1.javai.remedio;

import java.util.Scanner;

import br.com.projeto1.javai.bancodedados.BancoDeDados;
import br.com.projeto1.javai.servidor.Servidor;

public class BuscaServidor {

	
	public static void achouRemedio(Scanner entrada) {
	
		Servidor servidor = new Servidor();
		
		System.out.println("Qual o nome do remédio?");
		BancoDeDados consulta = servidor.remedioNome(entrada.next());
		Customizacao custom = new Customizacao();
		
		if(consulta.getRemedio() != null) {
			
			custom.separadorLinha();
			System.out.println();
			System.out.println("Você pode retirar o seu remédio na Farmácia de Alto Custo mais próxima,"
					+ "\nverifique o endereço no seu email."
					+ "\nNão esqueça seu RG, cartão do SUS e laudo do médico atualizado.");
		}
	}
	
	
}
