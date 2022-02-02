package br.com.projeto1.javai.remedio;

import java.util.ArrayList;
import java.util.Scanner;

public class Servidor {

	static ArrayList<String> server = new ArrayList<>();
	static int available = 0;
	static Customizacao custom = new Customizacao();
	
	public static void servidor(Integer valida, Scanner entrada) {
		
		server.add("abatacepte");
		server.add("acetazolamida");
		server.add("ácido nicotínico");
		server.add("ácido ursodesoxicólico");
		server.add("ácido zoledrônico");
		server.add("acitretina");
		server.add("adalimumabe");
		server.add("alfaglicosidase");
		server.add("alfadornase");
		server.add("alfaelosulfase");
		server.add("alfaepoetina");
		server.add("alfainterferona 2b");
		server.add("amantadina");
		server.add("ambrisentana");
		server.add("atorvastatina");
		server.add("azatioprina");
		server.add("baricitinibe");
		server.add("betainterferona");
		server.add("bezafibrato");
		server.add("biotina");
		server.add("brimonidina");
		server.add("brinzolamida");
		server.add("budesonida");
		server.add("cabergolina");
		server.add("calcipotriol");
		server.add("calcitonina");
		server.add("calcitriol");
		server.add("certolizumabe pegol");
		server.add("ciclofosfamida");
		server.add("ciclosporina");
		server.add("cinacalcete");
		server.add("ciprofibrato");
		server.add("ciproterona");
		server.add("clobazam");
		server.add("clobetasol");
		server.add("clopidogrel");
		server.add("cloroquina");
		server.add("clozapina");
		server.add("codeína");
		server.add("complemento alimentar para paciente fenilcetonúrico (fórmula de aminoácidos isenta de fenilalanina");
		server.add("danazol");
		server.add("dapagliflozina");
		server.add("deferasirox");
		server.add("deferiprona");
		server.add("desferroxamina");
		server.add("desmopressina");
		server.add("dicloridrato de sapropterina");
		server.add("donepezila");
		server.add("dorzolamida");
		server.add("eltrombopague olamina");
		server.add("enoxaparina sódica");
		server.add("entacapona");
		server.add("etanercepte");
		server.add("etossuximida");
		server.add("everolimo");
		server.add("fenofibrato");
		server.add("fenoterol");
		server.add("filgrastim");
		server.add("fingolimode");
		server.add("fludrocortisona");
		server.add("formoterol");
		server.add("formoterol + budesonida");
		server.add("fumarato de dimetila");
		server.add("gabapentina");
		server.add("galantamina");
		server.add("galsulfase");
		server.add("genfibrozila");
		server.add("glatiramer");
		server.add("golimumabe");
		server.add("gosserrelina"); 
		server.add("hidroxicloroquina");
		server.add("hidroxiuréia");
		server.add("idursulfase alfa");
		server.add("iloprosta");
		server.add("imiglucerase");
		server.add("imunoglobulina humana");
		server.add("infliximabe");
		server.add("Insulina Asparte");
		server.add("insulina glulisina ");
		server.add("isotretinoína");
		server.add("lamotrigina");
		server.add("lanreotida");
		server.add("laronidase");
		server.add("latanoprosta");
		server.add("leflunomida");
		server.add("leuprorrelina");
		server.add("levetiracetam");
		server.add("memantina");
		server.add("mesalazina");
		server.add("metadona");
		server.add("metilprednisolona");
		server.add("metotrexato");
		server.add("micofenolato de mofetila");
		server.add("micofenolato de sódio");
		server.add("miglustate");
		server.add("morfina");
		server.add("naproxeno");
		server.add("natalizumabe");
		server.add("nusinersena");
		server.add("octreotida");
		server.add("olanzapina");
		server.add("omalizumabe");
		server.add("pamidronato");
		server.add("pancreatina");
		server.add("paricalcitol");
		server.add("penicilamina");
		server.add("pilocarpina");
		server.add("piridostigmina");
		server.add("pramipexol");
		server.add("pravastatina");
		server.add("primidona");
		server.add("quetiapina");
		server.add("raloxifeno");
		server.add("rasagilina");
		server.add("riluzol");
		server.add("risedronato");
		server.add("risperidona");
		server.add("rituximabe");
		server.add("rivastigmina");
		server.add("sacarato de hidróxido férrico");
		server.add("sacubitril/valsartana");
		server.add("secuquinumabe");
		server.add("selegilina" );
		server.add("sevelamer");
		server.add("sildenafila");
		server.add("sirolimo");
		server.add( "somatropina");
		server.add("sulfassalazina");
		server.add("tafamidis");
		server.add("tacrolimo");
		server.add("taliglucerase alfa");
		server.add("teriflunomida");
		server.add("timolol");
		server.add("tobramicina");
		server.add("tocilizumabe");
		server.add("tofacitinibe");
		server.add( "topiramato");
		server.add( "toxina botulínica tipo a");
		server.add("travoprosta");
		server.add("trientina");
		server.add("triexifenidil");
		server.add("triptorrelina" );
		server.add("vedolizumabe");
		server.add("vigabatrina");
		server.add("ustequinumabe");
		server.add("ziprasidona");
		
		System.out.println("Lista de remédios e seus códigos: ");
		System.out.println();
		
		for(int i = 0; i < server.size(); i++) {
			
			System.out.println(i + " " +server.get(i));
			
		}
		
		System.out.println();
		System.out.println("Digite o código do remédio que deseja: ");
		valida = entrada.nextInt();
		System.out.println();

		for(long i = 0; i < server.size(); i++) {
			
			if(valida == i) {
				
				custom.separadorLinha();
				System.out.println();
				System.out.println("Você pode retirar o seu medicamento na Farmácia de Alto Custo mais próxima, "
						+ "\nverifique o endereço no seu email."
					+ "\nNão esqueça seu RG, cartão do SUS e laudo do médico atualizado.");
				custom.separadorLinha();
			}else {
				
				available++;
				
			}
			
		}
		
		if(available >= server.size()) {
			
			custom.separadorLinha();
			System.out.println();
			System.out.println("Não encontrou o medicamento que procura? Possívelmente ele"
					+ "\nnão está na lista procure a Farmácia de Alto Custo mais próxima.");
			custom.separadorLinha();
			
		}
		
	}
}
