/**
 * 
 */
package br.com.choliveira.entidade.direcao;

import br.com.choliveira.entidade.ponto.Ponto;

/**
 * Todo movimento quando o submarino estiver apontada para o NORTE: somar� 1 ao
 * eixo Y.
 * 
 * @author Carlos Henrique de Oliveira
 * @since 18/09/2017
 *
 */
public class Norte implements Direcao {

	/**
	 * Todo para o NORTE: soma 1 ao eixo Y.
	 */
	public void mover(Ponto ponto) {
		ponto.setY(ponto.getY() + 1);
	}

	/**
	 * Se o submarino estiver no norte e girar � esquerda, o mesmo ir� girar
	 * para o oeste.
	 */
	public Direcao girarEsquerda() {
		return new Oeste();
	}

	/**
	 * Se o submarino estiver no norte e girar � direita, o mesmo ir� girar para
	 * o leste.
	 */
	public Direcao girarDireita() {
		return new Leste();
	}

}
