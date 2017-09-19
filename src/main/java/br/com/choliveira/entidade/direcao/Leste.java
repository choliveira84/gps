/**
 * 
 */
package br.com.choliveira.entidade.direcao;

import br.com.choliveira.entidade.ponto.Ponto;

/**
 * Todo movimento que o submarino fizer apontando para o LESTE somará 1 ao eixo
 * X.
 * 
 * @author Carlos Henrique de Oliveira
 * @since 18/09/2017
 *
 */
public class Leste implements Direcao {

	/**
	 * Todo para o LESTE: soma 1 ao eixo X.
	 */
	public void mover(Ponto ponto) {
		ponto.setX(ponto.getX() + 1);
	}

	/**
	 * Se o submarino estiver no leste e girar à esquerda, o mesmo irá girar
	 * para norte.
	 */
	public Direcao girarEsquerda() {
		return new Norte();
	}

	/**
	 * Se o submarino estiver no leste e girar à esquerda, o mesmo irá girar
	 * para osul.
	 */
	public Direcao girarDireita() {
		return new Sul();
	}

}
