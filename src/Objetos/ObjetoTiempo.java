package Objetos;

public abstract class ObjetoTiempo extends Objeto {
	protected int tiempoDeVida;

	public void actuar() {
		tiempoDeVida--;
		if (tiempoDeVida == 0) {
			eliminarDeLaLista();
			this.grafico.setVisible(false);
		}

	}

}
