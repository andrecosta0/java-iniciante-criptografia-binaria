package apsCriptografia;

import java.util.Scanner;

public class Utilitarios {

	public static final Scanner entrada = new Scanner(System.in);
	
    public static void imprimirMenuPrincipal() {
        System.out.println("\nExplorador de Arquivos APS\n"
        		+ "Escolha a pasta que deseja acessar\n"
                + "(1) - Pasta (Aps Criptografia)\n"
                + "(2) - Ferramenta para criptografar\n"
                + "(3) - Ferramenta para Descriptografar\n"
                + "(4) - Fechar programa\n");
        
    }
    public static void imprimirMenuPasta() {
        System.out.println("\nVocê está na pasta 01\n"
        		+ "Escolha qual arquivo você deseja\n"
                + "(1) - Objetivo do trabalho.\n"
                + "(2) - O que é Criptografia.\n"
                + "(3) - Modelo de criptografia escolhido.\n"
                + "(4) - Integrantes do Projeto.\n"
                + "(5) - Retornar para pasta principal\n");
    }
    
}
