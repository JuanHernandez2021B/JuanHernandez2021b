package invernaderoproyecto1;

public class Vegetal extends Planta {
	
	public Vegetal(String Nombre, String Habitat, String Comestible) {
		super(Nombre, Habitat, Comestible);
	}

	@Override
	public void Definir() {
		System.out.println("\n\nEsta planta es un Vegetal.");
	}
}
