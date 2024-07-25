package project.model.crud;

import project.model.DbConexion;
import project.model.Producto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ModifyP {

	Connection connection;

	public ModifyP() {
		try {
			this.connection = DbConexion.conexion_db();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void modificarProducto(Producto producto) {
		String query = "UPDATE Producto SET descripcion = ?, precio = ?, stock = ?, id_Categoria = ? WHERE idProducto = ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, producto.getDescripcionP());
			preparedStatement.setFloat(2, producto.getPrecio());
			preparedStatement.setInt(3, producto.getInv());
			preparedStatement.setInt(4, producto.getCategoria());
			preparedStatement.setInt(5, producto.getIdProducto());

			int rowsUpdated = preparedStatement.executeUpdate();
			if (rowsUpdated > 0) {
				System.out.println("Producto actualizado exitosamente!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ModifyP modifyP = new ModifyP();
		Producto producto = new Producto("Producto Creado 3 (modificacion)", 150.0f, 30, 4);
		producto.setIdProducto(93);
		modifyP.modificarProducto(producto);

	}
}
