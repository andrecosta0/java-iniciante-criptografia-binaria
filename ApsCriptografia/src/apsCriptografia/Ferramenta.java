package apsCriptografia;

public class Ferramenta {
	
	public static void criptografartexto (String usuario) {
		 boolean rodando = true;
		 while(rodando) {
			 System.out.println("\nSeja muito bem vindo, " + usuario + ", esta é a nossa ferramenta de criptografia\n");
			 System.out.print("Escreva abaixo a palavra que será criptada: ");
			 String frase = Utilitarios.entrada.nextLine();
			 System.out.println("\nSegue o texto criptado:\n" + LogicaCriptografia.paraBinario(frase));
			 
			 System.out.print("\nDigite [S] para sair ou [R] para repetir: ");
	         String escolha = Utilitarios.entrada.nextLine();
	         if (escolha.equalsIgnoreCase("s")) {
	        	 rodando = false;
	         } 
		 }
	}
	
	public static void descriptografarTexto(String usuario) {
		boolean rodando = true;
        while (rodando) {
            System.out.println("\nSeja muito bem vindo, " + usuario + ", esta é a nossa ferramenta de descriptografia\n");
            System.out.print("Escreva abaixo o texto em binário: ");
            String frase = Utilitarios.entrada.nextLine();
            System.out.println("\nSegue o texto descriptografado:\n" + LogicaCriptografia.deBinario(frase));

            System.out.print("\nDigite [S] para sair ou [R] para repetir: ");
            String escolha = Utilitarios.entrada.nextLine();
            if (escolha.equalsIgnoreCase("s")) rodando = false; 
        }
	}
}
