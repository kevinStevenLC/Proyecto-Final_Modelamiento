package project.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import project.model.crud.DeleteP;

public class ControllerDeleteP {
	@FXML
	private TextField txtIdProducto;

	@FXML
	void btnEliminarProducto(ActionEvent event) {
		try {
			int idProducto = Integer.parseInt(txtIdProducto.getText());
			DeleteP deleteP = new DeleteP();
			deleteP.eliminarProducto(idProducto);
			txtIdProducto.clear();
		} catch (NumberFormatException e) {

			System.out.println("Please enter a valid product ID");
		}
	}

}
