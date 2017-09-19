/**
 * 
 */
package br.com.choliveira.entidade.direcao;

import br.com.choliveira.entidade.ponto.Ponto;

/**
 * Todo movimento quando o submarino estiver apontada para o SUL: subtrair� 1 ao
 * eixo Y.
 * 
 * @author Carlos Henrique de Oliveira
 * @since 18/09/2017
 *
 */
public class Sul implements Direcao {

	/**
	 * Todo para o SUL: subtrai 1 ao eixo Y.
	 */
	public void mover(Ponto ponto) {
		ponto.setY(ponto.getY() - 1);
	}

	/**
	 * Se o submarino estiver no sul e girar � esquerda, o mesmo ir� girar para
	 * o leste.
	 */
	public Direcao girarEsquerda() {
		return new Leste();
	}

	/**
	 * Se o submarino estiver no sul e girar � direita, o mesmo ir� girar para o
	 * oeste.
	 */
	public Direcao girarDireita() {
		return new Oeste();
	}

}
