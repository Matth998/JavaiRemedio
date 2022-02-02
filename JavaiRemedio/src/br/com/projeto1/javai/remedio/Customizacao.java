package br.com.projeto1.javai.remedio;

public class Customizacao implements InterfaceCustomizacao{

	@Override
	public void logo() {
		
		System.out.println("=======================================================================================");
		System.out.println("=         ==         ==                                                               =");
		System.out.println("=         =    ===    =               JAVAIREMEDIO                                    =");
		System.out.println("=          =         =                                                                =");
		System.out.println("=           =  _|_  =                Seu remédio aqui                                 =");
		System.out.println("=            =  |  =                                                                  =");
		System.out.println("=               =                                                                     =");
		System.out.println("=======================================================================================");
		
	}

	@Override
	public void separadorX() {
		
		System.out.println();
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.println();
		
	}

	@Override
	public void separadorLinha() {
		
		System.out.println();
		System.out.println("---------------------------------------------------------------------------");
		
	}

	
	
}
