/**
 * 
 */
package br.com.choliveira.teste;

import br.com.choliveira.entidade.submarino.Submarino;

/**
 * @author Carlos Henrique de Oliveira
 * @since 18/09/2017
 *
 */
public class TesteDeGPS {

	private static final String EXEMPLO_1 = "LMRDDMMUUM";
	private static final String EXEMPLO_2 = "RMMLMMMDDLL";
	private static final String EXEMPLO_3 = "xhas";

	public static void main(String[] args) {
		Submarino submarino = new Submarino();

		String comandos = EXEMPLO_3;
		String[] arrayComandos = comandos.split("");

		for (int i = 0; i < arrayComandos.length; i++) {
			submarino.executarComando(arrayComandos[i]);
			// System.out.println("Iteração " + i + ": " +
			// submarino.toString());
		}
		System.out.println("Direção do submarino: " + submarino.toString());

	}
}
