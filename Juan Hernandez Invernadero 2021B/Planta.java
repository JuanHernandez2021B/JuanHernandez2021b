package invernaderoproyecto1;

public abstract class Planta {
	private String Nombre;
	private String Habitat;
	private String Comestible;
	public boolean Nocturno;
	
	public Planta (String Nombre,String Habitat, String Comestible) {
		this.Nombre=Nombre;
		this.Habitat=Habitat;
		this.Comestible=Comestible;
		Nocturno=false;
	}

	public abstract void Definir();
	
	public void setHabitat(String Habitat) {
		this.Habitat=Habitat;
	}
	public void setComestible(String Comestible) {
		this.Comestible=Comestible;
	}
	public void setNombre(String Nombre) {
		this.Nombre=Nombre;
	}
	public String getHabitat(String Habitat) {
		return Habitat;
	}
	public String getComestible(String Comestible) {
		return Comestible;
	}
	public String getNombre(String Nombre) {
		return Nombre;
	}
}
