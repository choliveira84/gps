/**
 * 
 */
package br.com.choliveira.entidade.ponto;

/**
 * @author Carlos Henrique de Oliveira
 * @since 18/09/2017
 */
public class Ponto {
	private int x;
	private int y;
	private int z;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	/**
	 * A posição do submarino é representado pela notação (0, 0, 0, NORTE)
	 */
	public Ponto() {
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}

	@Override
	public String toString() {
		return getX() + " " + getY() + " " + getZ();
	}
}
