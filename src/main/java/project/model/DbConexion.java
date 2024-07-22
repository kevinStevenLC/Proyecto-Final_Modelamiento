package project.model;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbConexion {
	String bd = "b1bnfkha32b26wpcjpsh";
	String host = "b1bnfkha32b26wpcjpsh-mysql.services.clever-cloud.com";
	String url = "jdbc:mysql://" + host + ":3306";
	String user = "udypiwtnffa0xvx7";
	String pass = "COTivAtmSCLYS0OoGEEg";
	String driver = "com.mysql.cj.jdbc.Driver";

	Connection conn;

	public Connection conexion_db() {
		try {
			// cargar controlador JDBC
			Class.forName(driver);

			// establecer conexion

			conn = DriverManager.getConnection(url + "/" + bd, user, pass);

			System.out.println("Conexion Establecida.");

		} catch (ClassNotFoundException | SQLException sqlE) {
			System.err.println("Error de conexion: " + sqlE.getMessage());
			Logger.getLogger(DbConexion.class.getName()).log(Level.SEVERE, null, sqlE);
			return null;
		}

		return conn;
	}

	public static void main(String[] args) {
		DbConexion db_conexion = new DbConexion();

		db_conexion.conexion_db();

	}
}