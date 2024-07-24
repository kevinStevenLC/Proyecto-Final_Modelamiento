package project.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.Stage;
import project.App;

public class PanelController implements Initializable {

	// App pincipal
	App app_main;
	// Escenario del Panel
	Stage stagePanel;
	// Escenario consultar productos
	Stage consultar_productos;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	public void setAppMain(App app_main) {
		this.app_main = app_main;
	}

	public void recivePanel(@SuppressWarnings("exports") Stage stage) {
		this.stagePanel = stage;
	}

	public void reciveConsultationProduct(@SuppressWarnings("exports") Stage stage) {
		this.consultar_productos = stage;
	}

	@FXML
	void BtnActualizarProducto(ActionEvent event) throws IOException {
		Stage act_p = app_main.GenerateFxmlTable("ventana_modifyP", "Actualizar Producto");
		act_p.show();
	}

	@FXML
	void BtnConsultarProductos(ActionEvent event) throws IOException {
		consultar_productos.show();
	}

	@FXML
	void btnAgregarProducto(ActionEvent event) throws IOException {
		Stage add_p = app_main.GenerateFxmlTable("ventana_addP", "Agregar Producto");
		add_p.show();

	}

	@FXML
	void btnEliminarProducto(ActionEvent event) throws IOException {
		Stage del_p = app_main.GenerateFxmlTable("ventana_deleteP", "Eliminar Producto");
		del_p.show();
	}

}
