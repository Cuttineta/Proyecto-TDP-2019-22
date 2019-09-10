package Mapa;

public class Mapa {

	private Celda[][] matriz;
	
	public Mapa() {
		matriz = new Celda[6][10];
		for (int i = 0; i < matriz.length; i++)
			for (int j = 0; i < matriz[0].length; j++) {
				if ((i + j) / 2 != 0) {
					matriz[i][j] = new Celda(i,j);
				} else
					matriz[i][j] = new Celda(i,j);

			}

	}
}
