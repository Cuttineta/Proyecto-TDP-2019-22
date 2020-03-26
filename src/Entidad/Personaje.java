package Entidad;

import Visitor.Visitor;

public abstract class Personaje extends Entidad {
	protected int recompensaMonedas, recompensaPuntos;
	protected int velocidadInicial, velocidad;
	protected int vidaInicial;
	protected int i, a;

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
		if (a == 0) {
			this.velocidad = velocidad;
			a++;
		}
	}

	public void atacar() {
		estado.cambiarAAtacar();
		i++;
		if (i % 15 == 0) {
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

	public int getRecompensaMonedas() {
		return recompensaMonedas;
	}

	public int getVidaInicial() {
		return vidaInicial;
	}

	public void setRecompensaMonedas(int recompensaM) {
		this.recompensaMonedas = recompensaM;
	}

	public int getRecompensaPuntos() {
		return recompensaPuntos;
	}

	public abstract void aceptarVisitor(Visitor v);

	public abstract void crearDisparo();

}
