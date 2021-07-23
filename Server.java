import java.io.*;
import java.net.*;
import java.sql.SQLException;

public class Server extends Thread {
	DB db = DB.getinstances();
	private Socket socket=null;
	private ServerSocket Ssocket=null;
	private DataInputStream in=null;
	private DataOutputStream out=null;
	
	@Override
	public void run() {
		try {
			Ssocket=new ServerSocket(3000);
			while(true) {
				try {
					socket=Ssocket.accept();
					in=new DataInputStream(socket.getInputStream());
					String command[] = in.readUTF().split("");
					out=new DataOutputStream(socket.getOutputStream());
					out.writeUTF(Consulta(command));
					in.close();
					out.close();
				}catch(IOException e) {
					System.out.println("ERROR AL ESCRIBIR SERVIDOR: "+ e.getMessage());
				}
			}
		}catch(IOException l) {
			System.out.println("ERROR AL INICIAR SERVIDOR: "+ l.getMessage());
		}finally {
			try {
				Ssocket.close();
				socket.close();
			}catch(IOException i) {
				System.out.println("ERROR AL CERRAR SERVIDOR: "+ i.getMessage());
			}
		}
	}
	
	private String Consulta(String command[]) {
		try {
			if(command[0].equalsIgnoreCase("Iniciar")) {
				return "\nSERVER: ¡Bienvenido al sistema\n"
						+ "Los comandos para utilizar la consola son:\n"
						+ "-> /mostrar\n"
						+ "-> /buscar (Por ID)\n"
						+ "-> /buscarN (por grupo)\n"
						+ "-> /Surprise (es una sorpresa)\n"
						+ "-> /Clear (Borrar Texto)\n"
						+ "¡Qué tenga un buen día!";
			}
			
			if(command[0].equalsIgnoreCase("/mostrar")) {
				return db.Mostrar("SELECT *FROM Plantas ORDER BY Id ASC");
			}
			
			if(command[0].equalsIgnoreCase("/buscar")) {
				if(db.Mostrar("SELECT*FROM Plantas WHERE Id="+command[1])!="") {
					return db.Mostrar("SELECT*FROM Plantas WHERE Id="+command[1]);
				}else {
					return "\nSERVER: SIN INFORMACIÓN. PRUEBE CON OTRA ID.";
				}
			}
			
			if(command[0].equalsIgnoreCase("/buscarN")) {
				if(db.BuscarNombre(command[1])!=null) {
					return db.BuscarNombre(command[1]);
				}
				else {
					return "\nSERVER: SIN INFORMACIÓN. PRUEBE CON OTRO NOMBRE.";
				}
			}
			
			//Si lee esto quiero agradecer de leer mi esfuerzo como estudiante autodidacto, no ha sido sencillo...
			if(command[0].equalsIgnoreCase("/Surprise")) {
				return "\nSERVER: ¡Gracias por optar por esta aplicación!"
						+ "\nEl equipo de desarrolladores siente orgullo al ver usuarios utilizar su esfuerzo, y eso no debe ser ovbiado ☻";
			}
		}catch(Exception p) {
			return "SERVER: COMANDO ERRÓNEO: " + p.getMessage();
		}
		return"SERVER: ERROR CRÍTICO";
	}
}
