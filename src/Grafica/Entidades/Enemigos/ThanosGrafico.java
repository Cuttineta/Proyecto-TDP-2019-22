package Grafica.Entidades.Enemigos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Grafica.Mapa.PanelMapa;
import Logica.Entidades.Entidad;

public class ThanosGrafico extends EnemigoGrafico {
	private String palabras[] = { "animacion_thanos", "animacion_thanos", "animacion_thanos" };

	public ThanosGrafico(int x, int y, PanelMapa m, Entidad e) {
		super(x, y, m, e);
		graficos = new ImageIcon[3];

		for (int i = 0; i < palabras.length; i++) {
			graficos[i] = new ImageIcon("SpritesAvengers/Enemigos/Thanos/" + palabras[i] + ".gif");
		}
		setGraficoInicio(x, y);
	}

	public JLabel getGraficoActual() {
		return graficoActual;
	}

	public void setGraficoInicio(int x, int y) {
		graficoActual.setIcon(graficos[0]);
		graficoActual.setBounds(x, y, ancho, alto);
	}

}