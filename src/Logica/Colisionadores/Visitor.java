package Logica.Colisionadores;

import Logica.Entidades.Aliados.*;
import Logica.Entidades.Enemigos.*;
import Logica.Entidades.Obstaculos.Barro;
import Logica.Entidades.Obstaculos.Piedra;

public abstract class Visitor {
		
	public abstract void serChocado(Thanos e);
	public abstract void serChocado(DrStrange e);
	public abstract void serChocado(Ironman e);
	public abstract void serChocado(Hulk e);
	public abstract void serChocado(Hawkeye e);
	public abstract void serChocado(CapAmerica e);
	public abstract void serChocado(Thor e);
	public abstract void serChocado(Piedra e);
	public abstract void serChocado(Barro barro);



}
