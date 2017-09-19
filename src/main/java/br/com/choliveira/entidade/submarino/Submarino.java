package br.com.choliveira.entidade.submarino;

import br.com.choliveira.entidade.direcao.Direcao;
import br.com.choliveira.entidade.direcao.Norte;
import br.com.choliveira.entidade.ponto.Ponto;

/**
 * Classe representando o submarino, que ir� se mover e girar. Inicialmente, �
 * levado em considera��o que o submarino sempre come�ar� no ponto (0, 0, 0,
 * NORTE).
 * 
 * @author Carlos Henrique de Oliveira
 * @since 18/09/2017
 *
 */
public class Submarino {
	private Direcao direcao;
	private Ponto ponto;

	public String getDirecao() {
		return direcao.getClass().getSimpleName();
	}

	public void setDirecao(Direcao direcao) {
		this.direcao = direcao;
	}

	public Ponto getPonto() {
		return ponto;
	}

	public void setPonto(Ponto ponto) {
		this.ponto = ponto;
	}

	/**
	 * (0 0 0 Norte) -> Posici��o inicial do submarino.
	 */
	public Submarino() {
		direcao = new Norte();
		ponto = new Ponto();
	}

	public void movimentar() {
		direcao.mover(ponto);
	}

	public void girarEsquerda() {
		direcao = direcao.girarEsquerda();
	}

	public void girarDireita() {
		direcao = direcao.girarDireita();
	}

	public void subir() {
		ponto.setZ(ponto.getZ() + 1);
	}

	public void descer() {
		ponto.setZ(ponto.getZ() - 1);
	}

	/**
	 * M�todo utilizado para executar o comando passado pela lista de comando
	 * (inicialmente uma String contendo as movimenta��es).
	 * 
	 * @param comando
	 */
	public void executarComando(String comando) {
		if (comando.equalsIgnoreCase("L")) {
			girarEsquerda();
		}
		if (comando.equalsIgnoreCase("R")) {
			girarDireita();
		}
		if (comando.equalsIgnoreCase("D")) {
			descer();
		}
		if (comando.equalsIgnoreCase("U")) {
			subir();
		}
		if (comando.equalsIgnoreCase("M")) {
			movimentar();
		}
	}

	@Override
	public String toString() {
		return ponto.toString() + " " + getDirecao();
	}
}
