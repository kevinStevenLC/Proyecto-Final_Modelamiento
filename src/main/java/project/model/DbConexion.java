package project.model;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class DbConexion {
	private static HikariDataSource dataSource;

	static {
		String bd = "b1bnfkha32b26wpcjpsh";
		String host = "b1bnfkha32b26wpcjpsh-mysql.services.clever-cloud.com";
		String url = "jdbc:mysql://" + host + ":3306/" + bd;
		String user = "udypiwtnffa0xvx7";
		String pass = "COTivAtmSCLYS0OoGEEg";
		String driver = "com.mysql.cj.jdbc.Driver";

		HikariConfig config = new HikariConfig();
		config.setJdbcUrl(url);
		config.setUsername(user);
		config.setPassword(pass);
		config.setDriverClassName(driver);
		config.addDataSourceProperty("cachePrepStmts", "true");
		config.addDataSourceProperty("prepStmtCacheSize", "250");
		config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

		dataSource = new HikariDataSource(config);
	}

	public Connection conexion_db() {
		try {
			return dataSource.getConnection();
		} catch (SQLException e) {
			System.err.println("Error de conexion: " + e.getMessage());
			Logger.getLogger(DbConexion.class.getName()).log(Level.SEVERE, null, e);
			return null;
		}
	}

	public static void main(String[] args) {
		DbConexion db_conexion = new DbConexion();

		try (Connection connection = db_conexion.conexion_db()) {
			if (connection != null) {
				System.out.println("Conexion Establecida.");
			}
		} catch (SQLException e) {
			System.err.println("Error al cerrar la conexion: " + e.getMessage());
			Logger.getLogger(DbConexion.class.getName()).log(Level.SEVERE, null, e);
		}
	}

}