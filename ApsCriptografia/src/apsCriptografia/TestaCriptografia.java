package apsCriptografia;

public class TestaCriptografia {
	
	public static void main(String[] args) {
		
		System.out.println("Olá Usuário, Seja muito bem vindo ao nosso programa de Criptografia!\n");
		System.out.println("Para iniciar o programa precisaremos que digite seu nome de usuário e a sua senha\n");
		
		System.out.print("Digite o nome do usuário: ");
		String nomeUsuario = Utilitarios.entrada.nextLine();
		
		System.out.print("Digite sua senha: ");
		String senhaUsuario = Utilitarios.entrada.nextLine();
		
		
		if (senhaUsuario.equals(Senhas.getSenhaPadrao()) && nomeUsuario.equalsIgnoreCase(Senhas.getUsuarioPadrao())) {
			boolean executarCodigo = true;
			while(executarCodigo) {
				 Utilitarios.imprimirMenuPrincipal();
	             
	            int escolha = Integer.parseInt(Utilitarios.entrada.nextLine());
	 			
	 			switch (escolha) {
	 				case 1:
	 					Pastas.acessarPasta();
	 					break;
	 				case 2: 
	 					Ferramenta.criptografartexto(nomeUsuario);
	 					break;
	 				case 3: 
	 					Ferramenta.descriptografarTexto(nomeUsuario);
	 					break;
	 				case 4:
	 					executarCodigo = false;
	 					break;
	 				default:
	 					System.out.println("Opção Invalida");
	 			}
			}
		} else {
			System.out.println("Acesso Negado");
			}

		
	}
	
}
