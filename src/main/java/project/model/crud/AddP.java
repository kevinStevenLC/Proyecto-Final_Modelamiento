package project.model.crud;

import project.model.DbConexion;
import project.model.Producto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddP {
	Connection connection;

	public AddP() {
		try {
			this.connection = DbConexion.conexion_db();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void agregarProducto(Producto producto) {
		String query = "INSERT INTO Producto (descripcion, precio, stock, id_Categoria) VALUES (?, ?, ?, ?)";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, producto.getDescripcionP());
			preparedStatement.setFloat(2, producto.getPrecio());
			preparedStatement.setInt(3, producto.getInv());
			preparedStatement.setInt(4, producto.getCategoria());

			int rowsInserted = preparedStatement.executeUpdate();
			if (rowsInserted > 0) {
				System.out.println("Producto agregado exitosamente!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		AddP addP = new AddP();
		Producto producto = new Producto("Nuevo producto", 100.0f, 50, 2);
		addP.agregarProducto(producto);
	}
}
