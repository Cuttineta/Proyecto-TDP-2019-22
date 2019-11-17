package Entidad;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import Visitor.Visitor;
import Estado.Estado;

public abstract class Entidad {

	protected int posicionX, posicionY;
	protected JLabel grafico;
	protected Estado estado;
	protected Visitor visitor;

	protected ImageIcon estatico;
	protected ImageIcon atacando;

	protected int vida;
	protected int danio;

	public int getPosicionX() {
		return posicionX;
	}

	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
		if (grafico != null) {
			grafico.setBounds(posicionX, posicionY, 100, 100);
		}
	}

	public int getPosicionY() {
		return posicionY;

	}

	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
		if (grafico != null) {
			grafico.setBounds(posicionX, posicionY, 100, 100);
		}
	}

	public JLabel getGrafico() {
		return grafico;
	}

	public void setGrafico(JLabel grafico) {
		this.grafico = grafico;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Visitor getVisitor() {
		return visitor;
	}

	public void setVisitor(Visitor visitor) {
		this.visitor = visitor;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getDano() {
		return danio;
	}

	public void setDano(int danio) {
		this.danio = danio;
	}

	public void atacar(Entidad e) {
	}
	
	public abstract void eliminarDeLaLista();

	public abstract void mover();
}
