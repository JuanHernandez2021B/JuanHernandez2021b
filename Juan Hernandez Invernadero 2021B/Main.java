package invernaderoproyecto1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		System.out.println("Esta aplicacion es para el uso de una persona con invernadero, contiene vegetales, frutas, y flores, Eliga la clase de planta para Anadir:");
		try (Scanner entrada = new Scanner(System.in)) {
			int bucle=1, repetir=0;
			int i=0;
			String Nombre1[]= new String[10];
			String Habitat1[]=new String[10];
			String Comestible1[]=new String[10];
			do {
				System.out.println("\n1.- Flor" + "\n2.- Vegetal" + "\n3.- Fruta" + "\n4.- Ver lista de de Plantas" + "\n5.- Salir" + "\nEliga:");
				int eleccion=entrada.nextInt();
				switch(eleccion) {
				case 1: while(i<=9) {
					Planta nuevo=new Flor("","",""); 
					System.out.println("\nNombre de la Flor?:\n ");
					nuevo.setNombre(entrada.nextLine()); 
					Nombre1[i]=entrada.nextLine(); 
					System.out.println("\nHabitat? : \n ");
					nuevo.setHabitat(entrada.nextLine());
					Habitat1[i]=entrada.nextLine();
					System.out.println("\nEs comestible? (Si o No) \n ");
					nuevo.setComestible(entrada.nextLine());
					Comestible1[i]=entrada.nextLine();
					System.out.println("\nEs una flor que solo crece en la noche?: (Si o No) \n ");
					String horario_nuevo=entrada.nextLine();
					if((horario_nuevo.equals("Si"))||(horario_nuevo.equals("si"))){ 
						nuevo.Nocturno=true;}
					nuevo.Definir();
					System.out.println("Su nombre es " + nuevo.getNombre(Nombre1[i]) + ", vive en un habitat " + nuevo.getHabitat(Habitat1[i]) + ", es comestible? " + nuevo.getComestible(Comestible1[i]));
					if(nuevo.Nocturno){
						System.out.println("y es una Flor nocturna.");
					}else {System.out.println("y es una Flor diurna.");}
					i++;
					System.out.println("Introducir Otra Flor? (Si=0/No=1)"); 
					repetir=entrada.nextInt();
					if(repetir==1) {
						break;
					}
				}
					break;
				case 2: while(i<=9) {
					Planta nuevo=new Vegetal("","",""); 
					System.out.println("\n\nNombre del Vegetal?: ");
					nuevo.setNombre(entrada.nextLine());
					Nombre1[i]=entrada.nextLine();
					System.out.println("\n\nHabitat?:");
					nuevo.setHabitat(entrada.nextLine());
					Habitat1[i]=entrada.nextLine();
					System.out.println("\n\nEs comestible? (Si o No): ");
					nuevo.setComestible(entrada.nextLine());
					Comestible1[i]=entrada.nextLine();
					System.out.println("\nEs un Vegetal que solo crece en la noche?: (Si o No) ");
					String horario_nuevo=entrada.nextLine();
					if((horario_nuevo.equals("Si"))||(horario_nuevo.equals("si"))){
						nuevo.Nocturno=true;}
					nuevo.Definir();
					System.out.println("Su nombre es " + nuevo.getNombre(Nombre1[i]) + ", vive en un habitat " + nuevo.getHabitat(Habitat1[i]) + ", es comestible? " + nuevo.getComestible(Comestible1[i]));
					if(nuevo.Nocturno){
						System.out.println("y es un Vegetal nocturna.");
					}else {System.out.println("y es un Vegetal diurna.");}
					i++;
					System.out.println("Introducir Otro Vegetal? (Si=0/No=1)");
					repetir=entrada.nextInt();
					if(repetir==1) {
						break;
					}
				}
					break;
				case 3: while(i<=9) {
					Planta nuevo=new Fruta("","",""); //<- Instanciar en blanco
					System.out.println("\n\nNombre de la fruta ");
					nuevo.setNombre(entrada.nextLine());
					Nombre1[i]=entrada.nextLine(); 
					System.out.println("\n\nHabitat?:");
					nuevo.setHabitat(entrada.nextLine());
					Habitat1[i]=entrada.nextLine();
					System.out.println("\n\nEs comestible? (Si o No): ");
					nuevo.setComestible(entrada.nextLine());
					Comestible1[i]=entrada.nextLine();
					System.out.println("\nEs una Fruta que solo crece en la noche?: (Si o No)  ");
					String horario_nuevo=entrada.nextLine();
					if((horario_nuevo.equals("Si"))||(horario_nuevo.equals("si"))){
						nuevo.Nocturno=true;}
					nuevo.Definir();
					System.out.println("Su nombre es " + nuevo.getNombre(Nombre1[i]) + ", vive en un habitat" + nuevo.getHabitat(Habitat1[i]) + ", este se alimenta de " + nuevo.getComestible(Comestible1[i]));
					if(nuevo.Nocturno){
						System.out.println("y es un Fruta nocturna.");
					}else {System.out.println("y es un Fruta diurna.");}
					i++;
					System.out.println("Introducir Otra Fruta? (Si=0/No=1)");
					repetir=entrada.nextInt();
					if(repetir==1) {
						break;
					}
				}
					break;
				case 4: System.out.println("Nombre | Habitat | Comestible");
					for(int j=0; j<10; j++) {
					System.out.println(Nombre1[j] + "|" + Habitat1[j] + "|" + Comestible1[j]);
				}
					break;
				case 5: break;
					default: System.out.println("Ingrese Opcion del menu");
						break;
				}
				if(eleccion!=5) {
				System.out.println("Regresar al Menu? (Si=0/No=1): ");
				bucle=entrada.nextInt();
				}
			}while(bucle==0);
		}
		System.out.println("Listo.");
	}

}
