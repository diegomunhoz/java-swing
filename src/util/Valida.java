package util;

/**
 * Classe respons�vel por armazenar os m�todos de valida��o do sistema
 * 
 * @author Diego Munhoz
 * @since 03/03/2021
 * @version 1.0
 *
 */
public class Valida {

	// m�todo para retornar se o valor String est� preenchido
	public static boolean isEmptyOrNull(String args) {
		return (args.trim().equals("") || args == null);
	}
}
