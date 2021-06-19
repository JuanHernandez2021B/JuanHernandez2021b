package invernaderoproyecto1;

public class Fruta extends Planta {
	
	public Fruta(String Nombre, String Habitat, String Comestible) {
		super(Nombre, Habitat, Comestible);
	}
	
	@Override
	public void Definir() {
		System.out.println("\n\nEsta Planta es una fruta");
	}
}
