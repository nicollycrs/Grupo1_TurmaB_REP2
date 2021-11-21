package com.senac.tads.turmanb.pi1.grupo1.pandemus;

import  java.util.Arrays;

import java.util.Scanner;

import java.util.Random;

import java.util.concurrent.TimeUnit;

public class Pandemus {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        
        Random aleatorio = new Random();
        
        int escolha;
        
        int fragmento = 0;
        
        String nome;
        
        //Menu inicial - Nicolly
        
        System.out.println(" ____   _    _   _ ____  _____ __  __ _   _ ____  \n" +
        "|  _ \\ / \\  | \\ | |  _ \\| ____|  \\/  | | | / ___| \n" +
        "| |_) / _ \\ |  \\| | | | |  _| | |\\/| | | | \\___ \\ \n" +
        "|  __/ ___ \\| |\\  | |_| | |___| |  | | |_| |___) |\n" +
        "|_| /_/   \\_\\_| \\_|____/|_____|_|  |_|\\___/|____/ \n" +
        "                                                  ");
        escreverTexto("...\n...\n...\n...\n...\n...\n...\n...\n...\n...\n...\n...\n...\n...\n...\n...\n",60);
        System.out.println("******************************************");
        System.out.println("Digite o seu nome: ");
        nome = input.next();
        System.out.println("******************************************");
        System.out.println("Bem-vindo a Pandemus, " + nome + "!\nSelecione uma opção: ");
        System.out.println("(1)JOGAR\n(2)INSTRUÇÕES\n(3)CRÉDITOS\n(4)SAIR");
        int opcao = input.nextInt();
        
        while (opcao != 4 && opcao != 1) {
            switch (opcao) {
                case 1:
                    System.out.println("Jogar");
                    break;
                case 2:
                    System.out.println("INSTRUÇÕES: Pandemus é um jogo baseado em desafios.\n Todos eles devem ser resolvidos digitando a resposta,\n que pode ser a opção de uma lista ou uma palavra digitada por você.");
                    System.out.println("(1)JOGAR\n(2)INSTRUÇÕES\n(3)CRÉDITOS\n(4)SAIR");
                    opcao = input.nextInt();
                    break;
                case 3:
                    escreverTexto("CRÉDITOS: Codificado por \nFILIP LUIZ DE ALCANTARA MACHADO\nGUILHERME HENRIQUE DE SOUZA VITORIO\nGUILHERME SANTOS PEREIRA\nNICOLLY CANDIDA RODRIGUES DE SOUZA.\n", 20);
                    System.out.println("\nSelecione uma opção: \n(1)JOGAR\n(2)INSTRUÇÕES\n(3)CRÉDITOS\n(4)SAIR");
                    opcao = input.nextInt();
                    break;
                case 4:
                    System.out.println("Até a próxima!");
                    System.exit(0);
                    break;
                default:
                    validacao3(opcao);
            }
        }
        
        if (opcao == 4) {
           System.out.println("Até a próxima!");
           System.exit(0); 
        }
        
        escreverTexto("JOGAR: PANDEMUS.\nDivirta-se!\n", 10);
        escreverTexto("...\n...\n...\n...\n...\n...\n...\n...\n...\n...\n...\n...\n...\n...\n...\n...\n",40);
        
        //Início - Filip
        
        escreverTexto(" Nosso personagem faz parte de um grupo de cientistas que busca a cura para o vírus desde a sua primeira aparição. \n "
         + "Descontentes após tanto tempo de pesquisa com resultados falhos, onde seu único progresso foi uma \n " 
         + "possível forma de retardar o vírus vem desanimando cada vez mais. \n " 
         + "Nesse cenário caótico sem mais esperanças para resolver esse problema, surge um boato na cidade de que cientistas \n" 
         + "do lado sul do mapa descobriram a cura há muito tempo, entretanto devida tal conquista impactar fortemente \n" 
         + "principalmente os “Rebeldes” (grupo religioso extremista anti cura. Eles acreditam fortemente na ideia de purificação) eles \n" 
         + "foram obrigados a separar sua pesquisa em fragmentos na esperança de que algum cientista possa dar continuidade em seu trabalho. \n", 30);
        
        escreverTexto("...\n...\n...\n...\n...\n...\n...\n...\n...\n...\n...\n...\n...\n...\n...\n...\n",40);
        
        escreverTexto ("" + nome + " se vê em um impasse; ir atrás de supostas respostas com base em boatos espalhados por pessoas \n"
         + "que em meio a todo caos ainda tem esperança de uma salvação ou tentar entender o que está\n"
         + " acontecendo mas não tomar nenhuma atitude relevante sobre.\n", 10);
        
        escreverTexto("1 - Ir em busca de respostas.\n" 
         + "2 - Entender o que está acontecendo e não tomar nenhuma atitude sobre.\n", 5);
        
        escolha = input.nextInt();
        
        while (escolha != 1 && escolha != 2) {
            escreverTexto("Escolha inválida. Digite o número da opção:", 5);
            
            escreverTexto("1 - Juntar-se com seu amigo em busca de respostas.\n" 
                 + "2 - Entender o que está acontecendo e não tomar nenhuma atitude sobre\n", 5);
         
           
            escolha = input.nextInt();
        }
        
        if (escolha == 1) {
            escreverTexto(nome + " parte em sua jornada.\n", 10);
        } else {
            escreverTexto(nome + " recebe uma ligação de seu superior designando-o para busca dos fragmentos, "
                    + "\nentendendo que não são mais apenas boatos e sim informações verídicas sobre a possível chance de cura.\n", 10);
        }
        
        escreverTexto(nome +" encontra-se em um dilema, decidir entre dois caminhos sendo eles o mais rápido, entretanto mais perigoso onde \n"
                    + "deverá atravessar uma floresta na madrugada ou o mais longo porém seguro passando por dentro da cidade. \n", 15);
        System.out.println("1)Rápido e perigoso\n2)Longo e seguro\n");
        
        escolha = input.nextInt();
        
        while (escolha != 1 && escolha != 2) {
            System.out.println("Escolha inválida. Digite o número da opção: ");
            
            escreverTexto("1 - Juntar-se com seu amigo em busca de respostas.\n" 
                 + "2  - Entender o que está acontecendo e não tomar nenhuma atitude sobre\n", 5);
         
           
            escolha = input.nextInt();
        }
        
        if (escolha == 1) {
            escreverTexto(nome + " se depara com um acampamento abandonado e reconhece itens de um antigo companheiro de trabalho.\n"
                    + "\nNesses itens há um caderno no qual chamou a atenção, na capa havia a seguinte anotação\n"
                    + "\n“Nunca esqueça a ordem de precedência de um equação!!!”.\n"
                    + "\nSem entender o por que dessa anotação " + nome + " apenas o guarda em sua mochila e segue sua viagem.\n", 40);
        }
        
        //Laboratório 1 - Guilherme Henrique
        
        escreverTexto("Após um cansativo caminho, " + nome + " chega esperançoso/a ao seu destino. \n"
        + "Para seu descontentamento, a contrução encontra-se cercada de membros Rebeldes\n"
        + "Desistir no primeiro obstaculo não era algo que ele/a faria \n"
        + "Um grupo de cientistas se aproxima com muita agressividade, mas logo reconhecem o/a colega de profissão.\n"
        + nome + " explica toda a situação, e a equipe admira a determinação, pois tentaram por meses burlar o sistema de segurança do arquivo, sem sucesso.\n"
        + nome + " é levado/a à sala de documentação.\n"
        + "Há um computador em sua frente. Ele/a se aproxima.\n", 40);
        
        //Desafio 1
        
        System.out.println("\n**1 Desafio**\n Há somente um arquivo = FRAGMENTO 1.\n"
		+ "\n Clicando neste arquivo a seguinte mensagem aparece \n"
		+ "\n Para que o arquivo seja liberado, resolva a seguinte equação \n"
		+ "-----------( 20 - 2 + 9 * 3 - 2 / 2 )---------\n"
                + "\nDigite sua resposta: ");
        
        int resposta = input.nextInt();
        
        while (resposta != 44) {
            System.out.println("Resposta errada.\n"
                    + "Digite novamente: ");
            resposta = input.nextInt();
        }
        
        fragmento++; //Jogador ganha um fragmento
        
        System.out.println("\n Com muito sucesso, ele obteve acesso ao fragmento da pesquisa. \n"
		    + "\n No topo da folha é possivel ler: ADIUVAIT - 1/5 \n"
		    + "\n Ir atrás das 6 partes seria uma tarefa dificil,\n"
		    + "\n mas " + nome + " sabia que continuar vivendo em um mundo assim seria ainda mais.\n"
		    + "\n Ao sair da sala " + nome + " pode ir para a\n1)Esquerda\n2)Direita ");
        
        escolha = input.nextInt();
        
        while (escolha != 1 && escolha != 2) {
            escreverTexto("Escolha inválida. Digite o número da opção:\n1)Esquerda\n2)Direita\n", 5);
            escolha = input.nextInt();
        }
        
        if (escolha == 1) {
            System.out.println("Seguindo pela esquerda, encontra-se uma sala visivelmente não utilizada há muito tempo.\n"
                    + "Em um quadro empoeirado, a seguinte frase aparece: “Não conte as plantas. Conte os meus”.\n"
                    + "Não há nada mais a ser explorado na sala. A/O personagem volta e segue para a direita.\n");
        }
        
        System.out.println("No caminho de volta, uma sala chama a atenção de " + nome);
        System.out.println("Entrar na sala?\n1)Sim\n2)Não");
        
        escolha = input.nextInt();
        
        
        
        // Desafio 2
        if (escolha == 1) {
            do {
                System.out.println("Há somente um cofre e em sua lateral um bilhete diz o seguinte:\n"
                        + "“No meu jardim existem 3 pés de alface, 1 de pepino e 5 de cenoura.\n"
                        + "Quantos pés eu tenho no total?”\n"
                        + "Digite a resposta: ");
                resposta = input.nextInt();
            } while (resposta != 2);
            
            fragmento++;
            
            System.out.println("O cofre se abre, revelando o segundo fragmento.\n"
                    + "É possível observar ADIUVAT - 2/5 no documento.");
        }
        
        System.out.println("Tendo atingido seus objetivos, " + nome + " parte em direção ao segundo laboratório.");
        
        //Laboratório 2 - Nicolly
        
        System.out.println("**********LABORATÓRIO 2**********");
        escreverTexto("A região parece ter sido evacuada há muito tempo, fazendo com que a vegetação dominasse todo o tipo de construção, incluindo o segundo laboratório.\n"
                + "Aquele local certamente não viu vida humana até a chegada de " + nome + ".\n"
                + "A entrada encontra-se interditada por uma enorme árvore, impossibilitando a passagem. Há duas possibilidades:\n", 25);
        
        System.out.println("\n1)Escalar a árvore caída e pular o buraco que dá no segundo andar. \n2)Contornar o prédio e procurar outra entrada.\n3)Pular para o próximo laboratório.\nDigite o número da opção: ");
        int escolhaCaminho = input.nextInt();
        
        validacao3(escolhaCaminho);
        
        if (escolhaCaminho == 3) {
            System.out.println("Deseja realmente pular esse laboratório? 1)Sim 2)Não");
            escolha = input.nextInt();
            if (escolha == 2) {
                System.out.println("\n1)Escalar a árvore caída e pular o buraco que dá no segundo andar. \n2)Contornar o prédio e procurar outra entrada.\n3)Pular para o próximo laboratório.\nDigite o número da opção: ");
                escolhaCaminho = input.nextInt();
            }
        }
        
        switch (escolhaCaminho) {
            case 1:
                escreverTexto( "" + nome + " decide se arriscar e, com sucesso, entra no laboratório. Estranhamente, ele/a observa uma luz ao lado oposto.\n"
                        + "Em teoria, não seria possível que houvesse nenhum tipo de energia reserva.\n"
                        + "Uma voz canta alegremente.\n"
                        + nome + " se aproxima.\n"
                        + "Um senhor nos seus 80 anos se assusta, mas logo o/a recebe com um grande sorriso!\n"
                        + "“Ah, olá!!! Desculpe-me a vestimenta, não recebo visita há anos!” – diz o velho com apenas seu jaleco de cientista.\n"
                        + "“Sei o que lhe traz aqui. Esperei muito tempo por alguém corajoso o suficiente para nos tirar dessa loucura.\n"
                        + "Mas antes, vamos jogar algo! Diga o número que estou pensando e então lhe entrego o terceiro fragmento.”\n"
                        + "“Valendo!!!”\n"
                        + "Digite um número de 1 a 5: \n", 30);
                int escolhaNumero = input.nextInt();
                
                int valorGerado = aleatorio.nextInt(5) + 1;
                
                while (escolhaNumero != valorGerado) {
                    System.out.println("“Errado!!! Tente novamente: ”");
                    escolhaNumero = input.nextInt();
                }
                
                escreverTexto("“UAU! Você é bom nisso.\n"
                        + "Aqui está, agora ande!!!\n"
                        + "O mundo não vai se salvar sozinho!!!” – diz o velho, virando as costas e voltando a cantarolar.\n"
                        + "\nVocê lê no topo da folha FORTUNA - 3/5 e se dirige a saída.\n", 10);
                
                        fragmento++;
                
                break;
                
            case 2:
                escreverTexto("" + nome + " contorna o prédio e se depara com vários caminhos.\n"
                + "Após alguns minutos, ele/a percebe que passou pelo mesmo lugar diversas vezes, com os mesmos passarinhos a observando nesse loop.\n"
                + nome + " sabia que se os pássaros pudessem rir, iriam rir dele/a naquele momento.\n", 10);
                                
                escreverTexto("Tendo analisado seu trajeto, ele/a percebe que se encontra no centro do que parece ser um labirinto. Há duas opções, escolha:\n"
                + "1)Esquerda\n2)Direita\n", 10);
                int escolhaLabirinto = input.nextInt();
                            
                caminhoErrado(escolhaLabirinto, 2, nome);
                            
                System.out.println(nome + " caminha e se depara com outra escolha:\n1)Esquerda\n2)Direita\nEscolha: \n");
                escolhaLabirinto = input.nextInt();
                            
                caminhoErrado(escolhaLabirinto, 2, nome);
                            
                System.out.println(nome + " avança.\n1)Esquerda\n2)Direita\nEscolha: ");
                escolhaLabirinto = input.nextInt();
                            
                caminhoErrado(escolhaLabirinto, 1, nome);
                            
                escreverTexto(nome + " se depara com um baú velho.\nEle/a abre o baú e se depara com mais um fragmento.\nFORTUNA 4/5.\nA saída encontra-se logo à frente.\n", 10);
                break;
			
             default:
                    validacao3(escolhaCaminho);              
        }
	
	escreverTexto("\nCom mais um fragmento em mãos, " + nome + " continua sua jornada em direção ao próximo laboratório.\n", 15);
        
        //Laboratório 3 - Guilherme Pereira
        escreverTexto("Na chegada ao laboratório 3, observava-se que o clima entre os cientistas era de tensão pois eles sabiam que estavam próximos de unificar todos os fragmentos e salvar a humanidade.\n"
                + "Todos haviam reunido-se nesse último laboratório com a esperança de que os fragmentos de pesquisa juntados por " + nome + " pudessem mudar toda a situação atual.\n", 20);
        
        escreverTexto("Logo " + nome + " encontra o desafio 5, sendo necessário vencer uma disputa de pedra, papel e tesoura entre a máquina que guarda o último fragmento.\n"
                + "As tentativas são limitadas, ele/a tem 3 chances.\n", 20);
        
        int jogador, computador;
		// variaveis usadas para criar um score e "melhor de 3"
		int scoreJogador = 0;
		int scoreComputador = 0;
		int rodada = 1;
		System.out.println(" ------ Laboratorio 3 ------");
                System.out.println(" Pedra, Papel ou Tesoura");
		System.out.println("");
                // uso da estrutura while para fazer um melhor de 3
		while (rodada < 4) {
			System.out.println("Rodada: " + rodada);
			System.out.println("");
			System.out.println("1. Pedra");
			System.out.println("2. Papel");
			System.out.println("3. Tesoura");
			System.out.print("Digite a opção desejada: ");
			jogador = input.nextInt();
			System.out.println("");
			// logica do jogador
			switch (jogador) {
			case 1:
				System.out.println("Jogador escolheu: Pedra");
				break;
			case 2:
				System.out.println("Jogador escolheu: Papel");
				break;
			case 3:
				System.out.println("Jogador escolheu: Tesoura");
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
			// logica do computador
			computador = (int) (Math.random() * 3 + 1);
			switch (computador) {
			case 1:
				System.out.println("Computador escolheu: Pedra");
				break;
			case 2:
				System.out.println("Computador escolheu: Papel");
				break;
			case 3:
				System.out.println("Computador escolheu: Tesoura");
				break;
			}
			// logica para determinar o vencedor
			if (jogador == computador) {
				System.out.println("EMPATE");
			} else {
				if ((jogador == 2 && computador == 1)
						|| (jogador == 3 && computador == 2)) {
					System.out.println("JOGADOR VENCEU");
                                        System.out.println("FRAGMENTO FORTIS");
					scoreJogador = scoreJogador + 1;
                                        fragmento++;
				} else {
					System.out.println("COMPUTADOR VENCEU");
					scoreComputador = scoreComputador + 1;
				}
			}
			// placar
			System.out.println("");
			System.out.println("--------------------------");
			System.out.println("         PLACAR");
			System.out.println("--------------------------");
			System.out.println(" Jogador " + scoreJogador + " x Computador " + scoreComputador);
			System.out.println("--------------------------");
			System.out.println("");
			rodada = rodada + 1;
		}
	
                escreverTexto("Com isso, alguns fragmentos estão unidos.\n"
                        + "A equipe de cientistas se anima com a possibilidade de desenvolver a cura para a humanidade.\n"
                        + nome + ", depois de passar por tantos desafios complexos, se emociona.\n"
                                + "Sua jornada valeu a pena.\n"
                                + "Enfim conseguiram, mas agora eles precisam correr contra o tempo para que todos os habitantes sejam curados.\n ", 25);
                
                // Final - Nicolly
                
        if (fragmento < 2) {
            escreverTexto(nome + " conseguiu " + fragmento + " elementos. Após muito tempo de pesquisa, os resultados foram inconclusivos.\n"
                + "Frustrados, cientistas de todo o mundo desistem da ideia de cura.\n"
                + "Dentro de cinco anos toda a população é contaminada.\n"
                + "Metade sobrevive, entretanto, o vírus continua circulando.\n"
                + "Após 10 anos, toda a população é exterminada. No fim, as crenças rebeldes venceram.\n", 35);
            
                    System.out.println(" _______ _________ _        _______  _          _______          _________ _______ \n" +
                    "(  ____ \\\\__   __/( (    /|(  ___  )( \\        (  ____ )|\\     /|\\__   __/(       )\n" +
                    "| (    \\/   ) (   |  \\  ( || (   ) || (        | (    )|| )   ( |   ) (   | () () |\n" +
                    "| (__       | |   |   \\ | || (___) || |        | (____)|| |   | |   | |   | || || |\n" +
                    "|  __)      | |   | (\\ \\) ||  ___  || |        |     __)| |   | |   | |   | |(_)| |\n" +
                    "| (         | |   | | \\   || (   ) || |        | (\\ (   | |   | |   | |   | |   | |\n" +
                    "| )      ___) (___| )  \\  || )   ( || (____/\\  | ) \\ \\__| (___) |___) (___| )   ( |\n" +
                    "|/       \\_______/|/    )_)|/     \\|(_______/  |/   \\__/(_______)\\_______/|/     \\|");
                    
        } else {
            escreverTexto(nome + " conseguiu " + fragmento + " elementos. Espera-se que os resultados sejam excelentes.\n"
                    + "Para isso, o/a cientista deve organizar sua pesquisa. A ordem das palavras (Adiuvat, Fortuna, Fortis) é: \n", 25);
            
            String[] ordemCorreta = new String [3];
            ordemCorreta[0] = "fortis";
            ordemCorreta[1] = "fortuna";
            ordemCorreta[2] = "adiuvat";
        
            String [] usuario = new String [3];
                      
            for (int i = 0; i < 3; i++) {
                System.out.println((i) + "ª palavra. ");
                usuario[i] = input.next().toLowerCase();
            }

            while (!Arrays.equals(ordemCorreta, usuario)) {
                System.out.println("Ordem incorreta. Deseja continuar a pesquisa?\n1)Sim\n2)Não");
                escolha = input.nextInt();
                switch(escolha){
                    case 1:
                        for (int i = 0; i < 3; i++) {
                            System.out.println(i + "ª palavra.");
                            usuario[i] = input.next().toLowerCase();
                        }
                        break;
                    case 2:
                        escreverTexto(nome + " conseguiu " + fragmento + " elementos. Após muito tempo de pesquisa, os resultados foram inconclusivos.\n"
                        + "Frustrados, cientistas de todo o mundo desistem da ideia de cura.\n"
                        + "Dentro de cinco anos toda a população é contaminada.\n"
                        + "Metade sobrevive, entretanto, o vírus continua circulando.\n"
                        + "Após 10 anos, toda a população é exterminada. No fim, as crenças rebeldes venceram.\n", 35);
                        System.out.println(" _______ _________ _        _______  _          _______          _________ _______ \n" +
                        "(  ____ \\\\__   __/( (    /|(  ___  )( \\        (  ____ )|\\     /|\\__   __/(       )\n" +
                        "| (    \\/   ) (   |  \\  ( || (   ) || (        | (    )|| )   ( |   ) (   | () () |\n" +
                        "| (__       | |   |   \\ | || (___) || |        | (____)|| |   | |   | |   | || || |\n" +
                        "|  __)      | |   | (\\ \\) ||  ___  || |        |     __)| |   | |   | |   | |(_)| |\n" +
                        "| (         | |   | | \\   || (   ) || |        | (\\ (   | |   | |   | |   | |   | |\n" +
                        "| )      ___) (___| )  \\  || )   ( || (____/\\  | ) \\ \\__| (___) |___) (___| )   ( |\n" +
                        "|/       \\_______/|/    )_)|/     \\|(_______/  |/   \\__/(_______)\\_______/|/     \\|");
                        System.exit(0);
                        break;
                    default:
                        validacao2(escolha);
                }
            }
            
            escreverTexto("Com essa descoberta revolucionária, cientistas do mundo todo correm para formular a cura.\n" +
                "Dentro de 3 meses toda a população está curada e completamente imune ao vírus.\n" +
                "Após um ano, a humanidade se vê no estado anterior à pandemia. " + nome + " está sentado/a\n" +
                "na varanda de casa, observando a rua: há crianças brincando, vizinhos conversando e\n" +
                "festejando, bares e restaurantes abertos… " + nome + " respira profundamente, feliz e aliviado/a.\n" +
                "Tudo era como deveria ser.", 50);
            escreverTexto("...\n...\n...\n...\n...\n...\n...\n...\n...\n...\n...\n", 80);
            escreverTexto("Acorde, " + nome, 20);
            escreverTexto("...\n...\n...\n...\n...\n...\n...\n...\n...\n...\n...\n...\n...\n", 25);
            System.out.println(" _____  _                _   ____                     _ \n" +
                "|  ___|(_) _ __    __ _ | | | __ )   ___   _ __ ___  | |\n" +
                "| |_   | || '_ \\  / _` || | |  _ \\  / _ \\ | '_ ` _ \\ | |\n" +
                "|  _|  | || | | || (_| || | | |_) || (_) || | | | | ||_|\n" +
                "|_|    |_||_| |_| \\__,_||_| |____/  \\___/ |_| |_| |_|(_)");
        }
        
        escreverTexto("CRÉDITOS: Codificado por \nFILIP LUIZ DE ALCANTARA MACHADO\nGUILHERME HENRIQUE DE SOUZA VITORIO\nGUILHERME SANTOS PEREIRA\nNICOLLY CANDIDA RODRIGUES DE SOUZA.\n", 50);
    }
            

    //*********************************FUNÇÕES*********************************
    //Escrever texto lentamente
    public static void escreverTexto(String mensagem, long tempoEspera) throws InterruptedException {
        for (char caractere : mensagem.toCharArray()) {
            System.out.print(caractere);
            System.out.flush();
            TimeUnit.MILLISECONDS.sleep(tempoEspera);
        }
    }
    
    //Validação entre 1 e 2 - Nicolly
    static void validacao2(int escolha) {
        Scanner input = new Scanner(System.in);
        
        while (escolha != 1 && escolha != 2) {
            System.out.println("Escolha inválida. Digite novamente: ");
            escolha = input.nextInt();
        }
    }
    
    //Validação entre 1, 2 e 3 - Nicolly
    static void validacao3(int escolha) {
        Scanner input = new Scanner(System.in);
        
        while (escolha != 1 && escolha != 2 && escolha != 3) {
            System.out.println("Escolha inválida. Digite novamente: ");
            escolha = input.nextInt();
        }
    }
    
    //Validação caminhos do labirinto
    static void caminhoErrado(int escolha, int caminho, String nome) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        
        while (escolha != caminho) {
            escreverTexto(nome + " retorna à posição anterior. Há duas opções, escolha:\n"
                            + "1)Esquerda\n2)Direita\n", 10);
            escolha = input.nextInt();
        }
    }
}
