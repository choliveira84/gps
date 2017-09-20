/**
 * 
 */
package br.com.choliveira.testes;

import junit.framework.Assert;

import org.junit.Test;

import br.com.choliveira.entidade.submarino.Submarino;

/**
 * Classe utilizada para os testes unitários via JUnit.
 * 
 * @author Carlos Henrique de Oliveira
 * @since 19/09/2017
 */
public class Teste {

	private static final String EXEMPLO_1 = "LMRDDMMUU";
	private static final String EXEMPLO_2 = "RMMLMMMDDLL";
	private static final String EXEMPLO_3 = "UUUUUUUUU";

	@Test
	public void cenario1() {
		Submarino submarino = new Submarino();

		submarino.executarComando(EXEMPLO_1);

		String resultado = submarino.toString();

		Assert.assertEquals(resultado, "-1 2 0 Norte");
	}

	@Test
	public void cenario2() {
		Submarino submarino = new Submarino();

		submarino.executarComando(EXEMPLO_2);

		String resultado = submarino.toString();

		Assert.assertEquals(resultado, "2 3 -2 Sul");
	}

	@Test
	public void cenario3() {
		Submarino submarino = new Submarino();

		submarino.executarComando(EXEMPLO_3);

		String resultado = submarino.toString();

		Assert.assertEquals(resultado, "0 0 0 Norte");
	}
}
