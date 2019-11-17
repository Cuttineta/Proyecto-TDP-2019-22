package Entidad;

import Disparo.Disparo;
import Visitor.Visitor;

public abstract class Personaje extends Entidad {
	protected int velocidad;
	protected int i;

	public void cambiarGraficoEstatico() {
		grafico.setIcon(estatico);
	}

	public void cambiarGraficoAtacando() {
		grafico.setIcon(atacando);
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public void atacar(Entidad e) {
		estado.cambiarAAtacar();
		i++;
		if (i % 40 == 0) {
			crearDisparo();
			i = 0;
		}
	}

	public void setVida(int vida) {
		this.vida = vida;
		if (vida <= 0) {
			estado.cambiarAMuerto();
			estado.actuar();

		}
	}

	public abstract void aceptarDisparo(Disparo d);

	public abstract void crearDisparo();

}
