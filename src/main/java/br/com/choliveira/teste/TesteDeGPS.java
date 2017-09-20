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

	private static final String EXEMPLO_1 = "LMRDDMMUU";
	private static final String EXEMPLO_2 = "RMMLMMMDDLL";
	private static final String EXEMPLO_3 = "UUUU";

	public static void main(String[] args) {
		Submarino submarino = new Submarino();

		submarino.executarComando(EXEMPLO_3);

		System.out.println("Direção do submarino: " + submarino.toString());
	}
}
