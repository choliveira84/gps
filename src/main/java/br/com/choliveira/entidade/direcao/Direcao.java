/**
 * 
 */
package br.com.choliveira.entidade.direcao;

import br.com.choliveira.entidade.ponto.Ponto;

/**
 * @author Carlos Henrique de Oliveira
 * @since 18/09/2017
 *
 */
public interface Direcao {

	void mover(Ponto ponto);

	Direcao girarEsquerda();

	Direcao girarDireita();
}
