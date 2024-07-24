package project.model.crud;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import project.model.DbConexion;
import project.model.Producto;

public class ConsultationP {

	private Connection cnx;

	public ConsultationP() {
		try {
			this.cnx = DbConexion.conexion_db();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public List<Producto> getDefaultProducts() {
		List<Producto> objlProductos = new ArrayList<>();
		String query = "SELECT idProducto, descripcion, precio, stock, id_Categoria AS categoria \n"
				+ //
				"FROM Producto;";

		try {
			Statement statement = cnx.createStatement();

			ResultSet rs = statement.executeQuery(query);

			// procesar los datos
			while (rs.next()) {
				int idProducto = rs.getInt("idProducto");
				String descripcionP = rs.getString("descripcion");
				float precio = rs.getFloat("precio");
				int inv = rs.getInt("stock");
				int categoria = rs.getInt("categoria");

				Producto objProductos = new Producto(idProducto, descripcionP, precio, inv, categoria);
				objlProductos.add(objProductos); // Añadir producto a la lista
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return objlProductos;

	}

	public List<Producto> getProductsForHogar() {
		List<Producto> objlProductos = new ArrayList<>();
		String query = "SELECT idProducto AS ID_PRODUCTO, descripcion AS Nombre, precio AS Precio, stock AS Inventario, id_Categoria AS Categoria \n"
				+
				"FROM Producto \n" +
				"WHERE\n" +
				"id_Categoria = 1;";

		try {
			Statement statement = cnx.createStatement();

			ResultSet rs = statement.executeQuery(query);

			// procesar los datos
			while (rs.next()) {
				int idProducto = rs.getInt("ID_PRODUCTO");
				String descripcionP = rs.getString("Nombre");
				float precio = rs.getFloat("Precio");
				int inv = rs.getInt("Inventario");
				int categoria = rs.getInt("Categoria");

				Producto objProductos = new Producto(idProducto, descripcionP, precio, inv, categoria);
				objlProductos.add(objProductos); // Añadir producto a la lista
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return objlProductos;
	}

	public List<Producto> getProductsForKitchen() { // cocina
		List<Producto> objlProductos = new ArrayList<>();
		String query = "SELECT idProducto AS ID_PRODUCTO, descripcion AS Nombre, precio AS Precio, stock AS Inventario, id_Categoria AS Categoria \n"
				+
				"FROM Producto \n" +
				"WHERE\n" +
				"id_Categoria = 2;";

		try { // para mandar el stage o panel esa vaina// mira ahi si salen los de la
					// categoria cocina XD

			Statement statement = cnx.createStatement();

			ResultSet rs = statement.executeQuery(query);

			// procesar los datos
			while (rs.next()) {
				int idProducto = rs.getInt("ID_PRODUCTO");
				String descripcionP = rs.getString("Nombre");
				float precio = rs.getFloat("Precio");
				int inv = rs.getInt("Inventario");
				int categoria = rs.getInt("Categoria");

				Producto objProductos = new Producto(idProducto, descripcionP, precio, inv, categoria);
				objlProductos.add(objProductos); // Añadir producto a la lista
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return objlProductos;
	}

	public List<Producto> getProductsForElectronics() {
		List<Producto> objlProductos = new ArrayList<>();
		String query = "SELECT idProducto AS ID_PRODUCTO, descripcion AS Nombre, precio AS Precio, stock AS Inventario, id_Categoria AS Categoria \n"
				+
				"FROM Producto \n" +
				"WHERE\n" +
				"id_Categoria = 3;";

		try { // para mandar el stage o panel esa vaina// mira ahi si salen los de la
					// categoria cocina XD

			Statement statement = cnx.createStatement();

			ResultSet rs = statement.executeQuery(query);

			// procesar los datos
			while (rs.next()) {
				int idProducto = rs.getInt("ID_PRODUCTO");
				String descripcionP = rs.getString("Nombre");
				float precio = rs.getFloat("Precio");
				int inv = rs.getInt("Inventario");
				int categoria = rs.getInt("Categoria");

				Producto objProductos = new Producto(idProducto, descripcionP, precio, inv, categoria);
				objlProductos.add(objProductos); // Añadir producto a la lista
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return objlProductos;
	}

	public List<Producto> getProductsForToys() {
		List<Producto> objlProductos = new ArrayList<>();
		String query = "SELECT idProducto AS ID_PRODUCTO, descripcion AS Nombre, precio AS Precio, stock AS Inventario, id_Categoria AS Categoria \n"
				+
				"FROM Producto \n" +
				"WHERE\n" +
				"id_Categoria = 4;";

		try { // para mandar el stage o panel esa vaina// mira ahi si salen los de la
					// categoria cocina XD
			Statement statement = cnx.createStatement();

			ResultSet rs = statement.executeQuery(query);

			// procesar los datos
			while (rs.next()) {
				int idProducto = rs.getInt("ID_PRODUCTO");
				String descripcionP = rs.getString("Nombre");
				float precio = rs.getFloat("Precio");
				int inv = rs.getInt("Inventario");
				int categoria = rs.getInt("Categoria");

				Producto objProductos = new Producto(idProducto, descripcionP, precio, inv, categoria);
				objlProductos.add(objProductos); // Añadir producto a la lista
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return objlProductos;
	}

	public static void main(String[] args) {
		ConsultationP objProducto = new ConsultationP();
		List<Producto> List_P = objProducto.getDefaultProducts();
		for (Producto rs : List_P) {
			System.out.println("id producto: " + rs.getIdProducto());
		}
	}

}
