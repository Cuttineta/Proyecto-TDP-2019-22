package Grafica.Mapa;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Logica.Entidades.Entidad;
import Logica.Entidades.Aliados.Aliado;
import Logica.Entidades.Enemigos.Thanos;
import Logica.Mapa.Mapa;
//import Logica.Mapa.Posicion;

public class PanelMapa extends JPanel {
	private static final long serialVersionUID = 1L;
	private Image fondo = new ImageIcon("SpritesAvengers/Fondo/asfalto.png").getImage();
	private Aliado aColocar;
	private JLabel enemigo;
	private Entidad entidad;
	private Mapa mapa;

	public PanelMapa(Mapa m) {
		mapa = m;
		this.setLayout(null);
		this.setBounds(100, 50, 1100, 650);
		this.addMouseListener(new OyenteMouse());

		entidad = new Thanos(1200, 460, mapa);
		enemigo = entidad.getGrafico().getGraficoActual();
		this.add(enemigo);

	}

	public void eliminar() {
		enemigo.setVisible(false);
		this.remove(enemigo);
	}

	public void enemigo(JLabel n) {
		enemigo = n;
	}

	public Entidad getEntidadMapa() {
		return entidad;
	}

	public Mapa getMapa() {
		return mapa;
	}

	public void eliminarDefensorG(JLabel d) {
		this.remove(d);
		repaint();
	}

	private class OyenteMouse implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent arg0) {

		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();

			x = (x / 110) * 110 +15; // Lo posiciona en el eje x
			y = (y / 104) * 104 +27;// Lo posiciona en el eje y
			
			aColocar = mapa.getTienda().getPersonajeActual();
			if (y != 0 && aColocar != null && !mapa.hayEnPos(x,y)) {
				aColocar.cambiarPosLogica(x, y);
				mapa.setEntidad(aColocar);
				JLabel nuevo = aColocar.getGrafico().getGraficoActual();
				add(nuevo);
				repaint();
			}			
		}
		
		@Override
		public void mouseReleased(MouseEvent arg0) {

		}

	}

	public void setAColocar(Aliado a) {
		//if chekeos plata y que no sea null
		aColocar = a;
		
	}
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(fondo, 0, 0, this.getWidth(), this.getHeight(), this);
	}

	protected void repaintComponent(Image i) {// Para ponerle otro fondo al mapa
		Graphics g = this.getGraphics();
		g.drawImage(i, 0, 0, this.getWidth(), this.getHeight(), this);
	}

}
