package project.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

public class PanelController implements Initializable {
	// Escenario del Panel
	Stage stagePanel;

	// Escenarios de las 4 ventanas del CRUD
	Stage w_addP, w_deleteP, w_modifyP, w_consulteP;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	public void reciveWindowsOptions(@SuppressWarnings("exports") Stage w_addP,
			@SuppressWarnings("exports") Stage w_deleteP, @SuppressWarnings("exports") Stage w_modifyP,
			@SuppressWarnings("exports") Stage w_consulteP) {
		this.w_addP = w_addP;
		this.w_deleteP = w_deleteP;
		this.w_modifyP = w_modifyP;
		this.w_consulteP = w_consulteP;

	}

	public void recivePanel(@SuppressWarnings("exports") Stage stage) {
		this.stagePanel = stage;
	}

	@FXML
	void BtnActualizarProducto(ActionEvent event) {
		w_modifyP.show();
	}

	@FXML
	void BtnConsultarProductos(ActionEvent event) {
		System.out.println("Hola XD");
	}

	@FXML
	void btnAgregarProducto(ActionEvent event) {
		w_addP.show();
	}

	@FXML
	void btnEliminarProducto(ActionEvent event) {
		w_deleteP.show();
	}

}
