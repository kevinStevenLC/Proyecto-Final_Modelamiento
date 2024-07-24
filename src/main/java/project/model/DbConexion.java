package project.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbConexion {
	// Constantes de la base de datos
	private static final String BD = "b1bnfkha32b26wpcjpsh";
	private static final String HOST = "b1bnfkha32b26wpcjpsh-mysql.services.clever-cloud.com";
	private static final String URL = "jdbc:mysql://" + HOST + ":3306";
	private static final String USER = "udypiwtnffa0xvx7";
	private static final String PASS = "COTivAtmSCLYS0OoGEEg";
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

	// Conexión única
	private static Connection conn;

	// Constructor privado para evitar instanciación
	private DbConexion() {
	}

	/**
	 * Obtiene la conexión única a la base de datos.
	 * 
	 * @return la conexión a la base de datos.
	 * @throws SQLException si ocurre un error al establecer la conexión.
	 */
	public static Connection conexion_db() throws SQLException {
		if (conn == null || conn.isClosed()) {
			try {
				// Cargar controlador JDBC
				Class.forName(DRIVER);
				// Establecer conexión
				conn = DriverManager.getConnection(URL + "/" + BD, USER, PASS);
				System.out.println("Conexion Establecida.");
			} catch (ClassNotFoundException | SQLException sqlE) {
				System.err.println("Error de conexion: " + sqlE.getMessage());
				Logger.getLogger(DbConexion.class.getName()).log(Level.SEVERE, null, sqlE);
				return null;
			}
		}
		return conn;
	}

	/**
	 * Cierra la conexión a la base de datos.
	 * 
	 * @throws SQLException si ocurre un error al cerrar la conexión.
	 */
	public static void closeConection_db() throws SQLException {
		if (conn != null && !conn.isClosed()) {
			try {
				conn.close();
				System.out.println("Conexion Cerrada.");
			} catch (SQLException sqlE) {
				System.err.println("Error al cerrar la conexion: " + sqlE.getMessage());
				Logger.getLogger(DbConexion.class.getName()).log(Level.SEVERE, null, sqlE);
			}
		}
	}

	public static void main(String[] args) throws SQLException {
		// Probar la conexión a la base de datos
		// Connection db_conexion = DbConexion.conexion_db();
		DbConexion.closeConection_db();
	}
}
