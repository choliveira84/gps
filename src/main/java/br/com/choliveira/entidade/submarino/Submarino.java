package br.com.choliveira.entidade.submarino;

import br.com.choliveira.entidade.direcao.Direcao;
import br.com.choliveira.entidade.direcao.Norte;
import br.com.choliveira.entidade.ponto.Ponto;

/**
 * Classe representando o submarino, que irá se mover e girar. Inicialmente, é
 * levado em consideração que o submarino sempre começará no ponto (0, 0, 0,
 * NORTE).
 * 
 * @author carlo
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

	/*
	 * (0 0 0 Norte)
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

	@Override
	public String toString() {
		return ponto.toString() + " " + getDirecao();
	}
}
