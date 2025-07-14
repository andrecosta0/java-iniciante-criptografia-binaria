package apsCriptografia;

public class Pastas {
	
	public static void acessarPasta() {
		boolean acessar = true;
		while (acessar) {
			Utilitarios.imprimirMenuPasta();
           
            int escolha = Integer.parseInt(Utilitarios.entrada.nextLine());
            
            if (escolha >= 1 && escolha <= 4) {
            	System.out.println("\nVocê precisa digitar a sua senha para ter acesso ao documento");
                System.out.print("Senha: ");
                String senha = Utilitarios.entrada.nextLine();
                
                if (senha.equals(Senhas.getSenhaPadrao())) {
                	mostrarArquivo(escolha);
                } else {
                	System.out.println("\nVocê não tem acesso ao arquivo " + escolha + "\n");
                }
            } else if (escolha == 5) {
            	acessar = false;
            } else {
            	 System.out.println("Opção inválida.");
            }
		}
	}
	
	private static void mostrarArquivo (int numeroArquivo) {
		switch (numeroArquivo) {
		case 1: 
			System.out.println("\n[Arquivo 01 - Objetivo do Trabalho]\n");
			System.out.println("O objetivo deste trabalho é explorar e compreender os fundamentos da criptografia,"
					+ " uma ciência essencial para a segurança da informação na área da tecnologia."
					+ "\nA criptografia é a prática de proteger informações através da transformação de dados legíveis"
					+ " em um formato codificado, que só pode ser decifrado por aqueles que possuem a chave apropriada."
					+ "\n\nEste trabalho visa abordar os seguintes pontos:\n\nHistória e Evolução da Criptografia."
					+ "\nAnalisar a origem e o desenvolvimento da criptografia ao longo dos séculos,"
					+ "desde os métodos mais antigos utilizados em eras passadas até as técnicas avançadas empregadas"
					+ " atualmente.\n\nPrincípios Básicos da Criptografia.\nExplicar os conceitos fundamentais,"
					+ " como cifragem, decifragem, chaves criptográficas (simétricas e assimétricas),"
					+ " e algoritmos de criptografia mais comuns, como AES (Advanced Encryption Standard),"
					+ " RSA (Rivest-Shamir-Adleman) e Cifra de César (Criptografia usada para ser apresentada ao fim do"
					+ " projeto)\n\nAplicações da Criptografia.\nInvestigar as diversas aplicações da criptografia no"
					+ " mundo moderno, incluindo a proteção de dados pessoais, transações financeiras, comunicações"
					+ " seguras, e a segurança em redes de computadores.\n\nDesafios e Futuro da Criptografia."
					+ "\nDiscutir os desafios atuais enfrentados pela criptografia, como a ameaça de computadores"
					+ " quânticos, e as possíveis inovações e avanços que podem surgir no futuro para garantir a"
					+ " segurança da informação.\n\nEstudo de Casos.\nApresentar exemplos práticos e estudos de casos"
					+ " em que a criptografia desempenhou um papel crucial na proteção de informações sensíveis,"
					+ " destacando tanto sucessos quanto falhas.\n\nPor fim agradecemos nosso professor Alvaro Padro por"
					+ " todo o apoio e suporte para a criação desse código, utilizamos todas as ferramentas que aprendemos"
					+ " em laboratório nas aulas de IPE.");
			 break;
		case 2:
			 System.out.println("\n[Arquivo 02 - O que é Criptografia]\n");
			 System.out.println("Criptografia é a prática de proteger informações transformando-as em um formato"
			 		+ " ilegível para qualquer pessoa que não tenha a chave de decodificação.\nIsso é feito usando "
			 		+ "algoritmos matemáticos complexos. A criptografia é essencial para garantir a confidencialidade,"
			 		+ " integridade e autenticidade dos dados, sendo amplamente utilizada em transações financeiras,"
			 		+ " comunicações seguras e armazenamento de dados sensíveis.\n\nA palavra Criptografia vem do grego"
			 		+ " “Kryptós” (escondido), e sua função principal em toda a história da humanidade foi escrever"
			 		+ " mensagens de forma escondida e que apenas o destinatário possa reconhecer e compreender."
			 		+ " Técnicas para ocultar uma mensagem e transmiti-la de maneira secreta têm sido usadas há muitos"
			 		+ " anos, sendo algumas bem inventivas, quando não curiosas."
			 		+ "\n\nHeródoto (o historiador grego Heródoto, 484 a.C. - 426 a.C.) conta a história de um grego"
			 		+ " que precisava transmitir uma mensagem de forma secreta. A solução para a época foi raspar"
			 		+ " o cabelo do mensageiro e tatuar a mensagem na cabeça raspada. Após o cabelo crescer novamente,"
			 		+ " o mensageiro partia em sua jornada; ao chegar no seu destino final, ele raspava novamente o"
			 		+ " cabelo, revelando assim a sua mensagem. Essa técnica ficou conhecida como esteganografia."
			 		+ " A palavra deriva do grego “steganos” (coberto) e “graphia” (escrita).");
			break;
		case 3:
			System.out.println("\n[Arquivo 03 - Modelo de Criptografia escolhido]\n");
			System.out.println("A cifra de César é uma das técnicas mais antigas de criptografia, atribuída ao general"
					+ " romano Júlio César, que a usava para proteger mensagens militares.\nEsta cifra é um exemplo"
					+ " clássico de cifra de substituição, na qual cada letra de uma mensagem é substituída por outra,"
					+ " deslocada por um número fixo de posições no alfabeto.\nApesar de sua simplicidade, a cifra de"
					+ " César é historicamente significativa, pois introduziu o conceito de criptografia de chave "
					+ "simétrica, onde tanto o emissor quanto o receptor precisam conhecer a chave para cifrar e "
					+ "decifrar a mensagem.\nA cifra de César funciona de maneira simples: cada letra do texto original "
					+ "é substituída por uma letra que se encontra a um número fixo de posições à frente ou atrás no "
					+ "alfabeto.\nPor exemplo, com um deslocamento de três, a letra 'A' seria substituída pela letra "
					+ "'D', 'B' por 'E', e assim por diante. Após o 'Z', o alfabeto circula de volta para 'A', "
					+ "o que confere à cifra sua natureza cíclica.\nMatematicamente, a operação pode ser descrita da "
					+ "seguinte forma:\n\nPara cifrar uma letra, aplicamos a fórmula:\nC = (P + k) mod 26, onde C é a "
					+ "letra cifrada, P é a posição da letra original no alfabeto (A = 0, B = 1, ..., Z = 25),\nk é o "
					+ "valor do deslocamento (chave) e mod é a operação de módulo 26, que garante que o resultado esteja "
					+ "dentro do intervalo de 0 a 25.\n\nPara decifrar a mensagem, usamos a fórmula inversa:"
					+ "\nP = (C - k) mod 26. Por exemplo, ao cifrar a palavra CESAR com um deslocamento de 3, "
					+ "obtemos FHVDU.");
			break;
		case 4: 
			System.out.println("\n[Arquivo 04 - Integrantes do Projeto]\n");
			System.out.println("Muito obrigado por acessar o meu código/projeto de criptografia,"
					+ " a seguir será exibido os alunos participantes do projeto:\nAndré Costa Sampaio - R0711E0");
			break;
		}
		System.out.println("Digite [S] para sair do arquivo: ");
		while (!Utilitarios.entrada.nextLine().equalsIgnoreCase("s")) {
			System.out.println("Digite [S] para sair do arquivo: ");
		}
	}
	
	
}
