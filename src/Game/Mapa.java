package Game;

public class Mapa {

//	protected Juego juego;
	protected int filas, columnas;

	public Mapa(Juego juego) {
		// this.juego = juego;
		matriz = new Celda[6][10];
		filas = 6;
		columnas = 10;
		for (int i = 0; i < matriz.length; i++)
			for (int j = 0; j < matriz[0].length; j++)
				matriz[i][j] = new Celda(i, j, this);
	}

	public int getFilas() {
		return filas;
	}

	public int getColumnas() {
		return columnas;
	}

}
