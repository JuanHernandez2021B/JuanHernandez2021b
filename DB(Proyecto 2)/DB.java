import java.sql.*;
public class DB {
	private static DB DB = new DB();
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private String driverDB = "org.postgresql.Driver";
	private String dbName = "Register";
	private String urlDB = "jdbc:postgresql://localhost:5432/"+this.dbName;
	private String userDB = "postgres";
	private String passDB = "admin";
	
	public static DB getinstances() {
		return DB;
	}
	private DB() {
		try {
			Class.forName(driverDB);
			this.conn=DriverManager.getConnection(urlDB,userDB,passDB);
		}catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
	}
	
	public String Mostrar(String sentencia) {
		String texto="";
		try {
			this.stmt = this.conn.createStatement();
			this.rs = this.stmt.executeQuery(sentencia); 
			while(rs.next()) {
				texto+="-->ID: "+rs.getString("Id")+", Nombre: "+rs.getString("Nombre")+", Clase:"+ rs.getString("Clase")
				+ ", Habitat: " +rs.getString("Habitat")+ ", Comestible:"+rs.getString("Comestible")
				+", Nocturno"+rs.getString("Nocturno")+"\n";
			}
		}catch(SQLException e) {
			return "SERVER: "+e.getMessage()+"\n";
		}finally {
			try {
				this.stmt.close();
				this.rs.close();
			}catch(Exception e) {
			}
		}
		return texto;
	}
	
	
	public void Editar(String obj[]) {
		try {
			this.pstmt = conn.prepareStatement("UPDATE Planta SET Clase=?,Nombre=?,Habitat=?,Comestible=?,Horario=? WHERE Id= "+obj[0]);
			this.pstmt.setString(1, obj[1]);
			this.pstmt.setString(2, obj[2]);
			this.pstmt.setString(3, (obj[3]));
			this.pstmt.setString(4, (obj[4]));
			this.pstmt.setBoolean(5, Boolean.parseBoolean(obj[5]));
			System.out.println("Planta EDITADO");
		}catch(SQLException l) {
			System.out.println("ERROR "+l.getMessage());
		}finally {
			try {
				this.pstmt.close();
			}catch(Exception f) {
				f.getStackTrace();
			}
		}
	}
	
	public String BuscarNombre(String nom) {
		try {
			this.stmt = this.conn.createStatement();
			this.rs = this.stmt.executeQuery("SELECT*FROM Planta");
			while(rs.next()) {
				if(rs.getString("nombre").equalsIgnoreCase(nom)) {
					return "-->ID: "+rs.getString("Id")+", Nombre: "+rs.getString("Nombre")+", Clase:"+ rs.getString("Clase")
					+ ", Habitat: " +rs.getString("Habitat")+ ", Comestible:"+rs.getString("Comestible")
					+", Nocturno"+rs.getString("Nocturno")+"\n";
				}
			}
		}catch(SQLException e) {
			return "SERVIDOR: ERROR AL BUSCAR";
		}finally {
			try {
				this.stmt.close();
				this.rs.close();
			}catch(SQLException e) {
				e.getStackTrace();
			}
		}
		return null;
	}
	
	public void dbClose() {
		try {
			this.conn.close();
		}catch(SQLException u) {
			u.printStackTrace();
		}
	}
}