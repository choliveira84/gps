/**
 * 
 */
package br.com.choliveira.entidade.direcao;

import br.com.choliveira.entidade.ponto.Ponto;

/**
 * * Todo movimento que o submarino fizer apontando para o OESTE subtrair� 1 ao
 * eixo X.
 * 
 * @author Carlos Henrique de Oliveira
 * @since 18/09/2017
 *
 */
public class Oeste implements Direcao {

	/**
	 * Todo para o LESTE: subtrai 1 ao eixo X.
	 */
	public void mover(Ponto ponto) {
		ponto.setX(ponto.getX() - 1);
	}

	/**
	 * Se o submarino estiver no oeste e girar � esquerda, o mesmo ir� girar
	 * para sul.
	 */
	public Direcao girarEsquerda() {
		return new Sul();
	}

	/**
	 * Se o submarino estiver no oeste e girar � direita, o mesmo ir� girar para
	 * o norte.
	 */
	public Direcao girarDireita() {
		return new Norte();
	}

}
