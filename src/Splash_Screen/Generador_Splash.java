package Splash_Screen;

public class Generador_Splash {

	Splash ventana;

	public Generador_Splash() {
		ventana = new Splash();
	}

	public void cargarSplash() {
		ventana.setLocationRelativeTo(null);

		ventana.setVisible(true);

		for (int i = 0; i <= 100; i++) {
			try {
				Thread.sleep(60);
				if (i > 0 && i < 20)
					ventana.textfield.setText("Cargando archivos");
				if (i > 20 && i < 40)
					ventana.textfield.setText("Renderizando imagenes");
				if (i > 40 && i < 80)
					ventana.textfield.setText("Finalizando carga");
			} catch (InterruptedException e) {

			}
			ventana.progressBar.setValue(i);
		}
		ventana.dispose();
	}

}