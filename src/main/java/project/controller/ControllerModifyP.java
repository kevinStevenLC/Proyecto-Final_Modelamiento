package project.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import project.model.Producto;
import project.model.crud.ModifyP;

public class ControllerModifyP {

	@FXML
	private TextField idField;

	@FXML
	private TextField descripcionField;

	@FXML
	private TextField cantidadField;

	@FXML
	private TextField precioField;

	@FXML
	private TextField categoriaField;

	@FXML
	public void initialize() {
	}

	@FXML
	void actualizarProducto(ActionEvent event) {
		try {
			int id = Integer.parseInt(idField.getText());
			String descripcion = descripcionField.getText();
			int cantidad = Integer.parseInt(cantidadField.getText());
			float precio = Float.parseFloat(precioField.getText());
			int categoria = Integer.parseInt(categoriaField.getText());

			Producto producto = new Producto(descripcion, precio, cantidad, categoria);
			producto.setIdProducto(id);
			ModifyP modifyP = new ModifyP();
			modifyP.modificarProducto(producto);

		} catch (NumberFormatException e) {
			System.err.println("Error: " + e.getMessage());
			// Aquí puedes agregar un diálogo para mostrar el error al usuario
		}
	}

}
