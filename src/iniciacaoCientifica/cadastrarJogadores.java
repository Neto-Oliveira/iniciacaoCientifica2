package iniciacaoCientifica;
//finalizar a parte de cadastro de jogadores.
import java.util.Scanner;
public class cadastrarJogadores extends jogador {
	
	public cadastrarJogadores(String nome, String nomeJogo, int id, int pontuacaoInicialBAI, int pontuacaoFinalBAI) {
		super(nome, nomeJogo, id, pontuacaoInicialBAI, pontuacaoFinalBAI);
		// TODO Auto-generated constructor stub
	}
	public void cadastrar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o nome do participante: ");
		this.nome = scan.nextLine();
		
		
		
		this.nomeJogo = null;
		while(nomeJogo == null) {
			System.out.println("Escolha o jogo: ");
			System.out.println("_______________________________________"); //ver depois uma biblioteca que centraliza bonitinho
			System.out.println("|1 - Dark Souls | 2 - Dead by Daylight |");
			System.out.println("|3 - FIFA | 4 - Genshin Impact |");
			System.out.println("|5 - League of Legends | 6- Mobile Legends |");
			System.out.println("|7 - Mortal Kombat | 8 - Stardew valley |");
			System.out.println("|9 - Valorant |  |");
			System.out.println("_______________________________________");
				int opjogo = scan.nextInt();
				switch(opjogo) {
				case 1:
					System.out.println("Jogo escolhido: Dark Souls");
					this.nomeJogo = "Dark Souls";
					break;
				case 2:
					System.out.println("Jogo escolhido: Dead by Daylight");
					this.nomeJogo = "Dead by Daylight";
					break;
				case 3:
					System.out.println("Jogo escolhido: FIFA");
					this.nomeJogo = "FIFA";
					break;
				case 4:
					System.out.println("Jogo escolhido: Genshin Impact");
					this.nomeJogo ="Genshin Impact";
					break;
				case 5:
					System.out.println("Jogo escolhido: League of Legends");
					this.nomeJogo ="League of Legends";
					break;
				case 6:
					System.out.println("Jogo escolhido: Mobile Legends");
					this.nomeJogo ="Mobile Legends";
					break;
				case 7:
					System.out.println("Jogo escolhido: Mortal Kombat");
					this.nomeJogo ="Mortal Kombat";
					break;
				case 8:
					System.out.println("Jogo escolhido: Stardew valley");
					this.nomeJogo ="Stardew valley";
					break;
				case 9:
					System.out.println("Jogo escolhido: Valorant");
					this.nomeJogo ="Valorant";
					break;
		    	default:
		    		System.out.println("\nJogo inválido! Tente novamente.\n");
				}
		}
		
		
		System.out.println("digite seu ID"); //quero auto incrementar esse ID depois
		this.id = scan.nextInt(); ///ADICIONAR UM TRY EXCEPTION AQUI DEPOISSSSSSSSSSSSSSSSSSSSSSSSSSSSSS
		scan.nextLine();
		//System.out.println("Pontuação inicial do teste de BAI");
	//	this.pontuacaoInicialBAI = scan.nextInt();
		//scan.nextLine();
		System.out.println("Pontuação final do teste de BAI");
		this.pontuacaoFinalBAI = scan.nextInt();
		scan.nextLine();
		//scan.close(); //testando para o commit novos  PORQUE SE FECHAR ESSE MERDINHA AQUI VAI DAR PROBLEMA NO SCANNER DE BAIXO???????
		/*
		 * 
		 * 			Scanner scan = new Scanner(System.in);
			System.out.println("Digite seu Nome: ");
			String nome = scan.nextLine();
			int quantidadeRiso = scan.nextInt();
			scan.nextLine();
			System.out.println("Quantidade de risos: "+quantidadeRiso);
			scan.close();*/
	}
	@Override
	void calcularBAIInicial() {
		this.pontuacaoInicialBAI = 0;
		Scanner scan2 = new Scanner(System.in);
		//System.out.println(this.pontuacaoInicialBAI);
		System.out.println("Abaixo está uma lista de sintomas comuns à ansiedade. Por favor, leia cuidadosamente cada\r\n"
				+ "item da lista. Identifique o quanto você tem sido incomodado(a) por cada um dos sintomas durante\r\n"
				+ "a última semana, incluindo hoje, informe um “1, 2, 3 ou 4” no espaço correspondente, na mesma linha\r\n"
				+ "de cada sintoma. ");
		String [] frases = {"01 - Atualmente você está com dormência ou formigamento?", "02 - Alguma Sensação de calor?","03 - Tremores nas pernas","04 - Incapaz de relaxar","05- Medo que aconteça o pior","06 - Atordoado (a) ou tonto(a)","07 - Palpitação ou aceleração do coração","08 - sem equilibrio ou inseguro","09- Aterrorizado (a)\r\n"
								, "10 - Nervoso (a)","11 - Sensação de sufocação","12 - Tremores nas mãos","13 - Trêmulo (a)","14 - Medo de perder o controle","15 -Dificuldade de respirar","16 - Medo de morrer","17 - Assustado","18 - Dor de barriga","19 - Sensanção de desmaio"
										 ,"20 - Rosto avermelhado","21- Suor (não deve levar em consideração calor"};
		System.out.println("informe um ''1, 2, 3 ou 4'' de acordo com a frequência "
				+ "\n_____________________________________________________________\n"
				+ "1- Absolutamente nada || 2- Levemente, não me incomodou muito || 3- Moderadamente, foi desagradável mas pude suportar || 4- Gravemente, pude suportar ");
		for(int i = 0;i<21;i++) {
			
			System.out.println(frases[i]);
			int op2 = scan2.nextInt();
			scan2.nextLine();
			//scan2.close();
			switch (op2) {
			case 1:
				this.pontuacaoInicialBAI += 0;
				break;
			case 2:
				this.pontuacaoInicialBAI += 1;
				break;
			case 3:
				this.pontuacaoInicialBAI += 2;
				break;
			case 4:
				this.pontuacaoInicialBAI += 3;
				break;
			default:
	    		System.out.println("\nOpção inválida! Tente novamente.\n");	
			}
		}
		//System.out.println("Atualmente você está com dormência ou formigamento?");
		
		
		//ta bem gambiarra, mas finalizar amanhã
		//scan2.close();
	}

	@Override
	void calcularBAIFinal() {
		// TODO Auto-generated method stub
		
	}
	
}
