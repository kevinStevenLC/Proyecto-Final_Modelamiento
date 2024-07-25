package project.model.crud;

import project.model.DbConexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteP {
	Connection connection;

	public DeleteP() {
		try {
			this.connection = DbConexion.conexion_db();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void eliminarProducto(int idProducto) {
		String query = "DELETE FROM Producto WHERE idProducto = ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);

			preparedStatement.setInt(1, idProducto);

			int rowsDeleted = preparedStatement.executeUpdate();
			if (rowsDeleted > 0) {
				System.out.println("Producto eliminado exitosamente!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		DeleteP deleteP = new DeleteP();
		deleteP.eliminarProducto(78); // Eliminar producto con ID 1
	}
}