package Entidad.Aliados;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Disparo.DisparoAliado.DisparoHulk;
import Estado.Caminando;
import Mapa.mapa;

public class HulkSegundaParte extends Aliado {
	private Hulk hulk;

	public HulkSegundaParte(Hulk hulk) {
		this.hulk = hulk;

		rango = hulk.getRango();
		precio = hulk.getPrecio();
		danio = hulk.getDanio();
		grafico = hulk.getGrafico();
		estado = hulk.getEstado();
		estado.actuar();
	}
	
	public void actuar() {}

	public void setVida(int v) {
		hulk.setVida(v);
	}

	public int getVida() {
		return hulk.getVida();
	}

	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}
	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}

	@Override
	public void crearDisparo() {
		DisparoHulk disparo = new DisparoHulk(danio, rango, posicionX, posicionY);

	}

}
