package invernaderoproyecto1;

public class Flor extends Planta{
	
	public Flor(String Nombre, String Habitat, String Comestible) {
		super(Nombre, Habitat, Comestible);
	}

	
	@Override
	public void Definir() {
		System.out.print("\n\nEsta Planta es una flor");
	}
}
