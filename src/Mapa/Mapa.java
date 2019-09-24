package Mapa;

public class Mapa {

	protected Celda[][] matriz;
	protected Juego juego;

	public Mapa(Juego juego) {
		this.juego = juego;
		matriz = new Celda[6][10];
		for (int i = 0; i < matriz.length; i++)
			for (int j = 0; j < matriz[0].length; j++)
				matriz[i][j] = new Celda(i, j, this);
	}

	public Celda getCelda(int f, int c) {
		Celda toRet = null;
		if (f >= 0 && f < matriz.length && c >= 0 && c < matriz[0].length)
			toRet = matriz[f][c];
		return toRet;
	}

	public Juego getJuego() {
		return juego;
	}
}
