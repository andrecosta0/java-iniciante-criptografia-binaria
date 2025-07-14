package apsCriptografia;

public class LogicaCriptografia {

	public static String paraBinario(String texto) {
	    StringBuilder resultado = new StringBuilder();
	    for (char c : texto.toCharArray()) {
	       
	        if (Character.isLetterOrDigit(c) || c == ' ') {
	            String bin = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
	            resultado.append(bin);
	        } else {
	            System.out.println("Caractere não suportado para criptografia: '" + c + "'");
	            return "[ERRO] Texto contém caracteres inválidos.";
	        }
	    }
	    return resultado.toString();
	}	

	public static String deBinario(String binarioCompleto) {
	    StringBuilder resultado = new StringBuilder();

	    if (binarioCompleto.length() % 8 != 0) {
	        return "[ERRO] O texto binário está incompleto ou mal formatado.";
	    }

	    for (int i = 0; i < binarioCompleto.length(); i += 8) {
	        String byteBinario = binarioCompleto.substring(i, i + 8);

	        if (!byteBinario.matches("[01]{8}")) {
	            return "[ERRO] Binário inválido encontrado: '" + byteBinario + "'";
	        }

	        try {
	            int codigoAscii = Integer.parseInt(byteBinario, 2);
	            resultado.append((char) codigoAscii);
	        } catch (NumberFormatException e) {
	            return "[ERRO] Não foi possível converter o binário: '" + byteBinario + "'";
	        }
	    }

	    return resultado.toString();
	}

	
}
