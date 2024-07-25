package project.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import project.model.Producto;
import project.model.crud.AddP;

public class ControllerAddP {
	@FXML
	private TextField txtDescripcion;

	@FXML
	private TextField txtCantidad;

	@FXML
	private TextField txtPrecio;

	@FXML
	private TextField txtCategoria;

	@FXML
	void btnAgregarProducto(ActionEvent event) {
		String descripcion = txtDescripcion.getText();
		int cantidad = Integer.parseInt(txtCantidad.getText());
		float precio = Float.parseFloat(txtPrecio.getText());
		int categoria = Integer.parseInt(txtCategoria.getText());

		Producto producto = new Producto(descripcion, precio, cantidad, categoria);
		AddP addP = new AddP();
		addP.agregarProducto(producto);

		// Limpiar campos después de agregar el producto
		txtDescripcion.clear();
		txtCantidad.clear();
		txtPrecio.clear();
		txtCategoria.clear();
	}

}
