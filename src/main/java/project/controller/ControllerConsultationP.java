package project.controller;

import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;

import javafx.scene.control.ComboBox;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import project.model.Producto;
import project.model.crud.ConsultationP;

public class ControllerConsultationP implements Initializable {

	@FXML
	private ComboBox<String> CbOrdB;

	@FXML
	private TableView<Producto> tblVProducts;

	@FXML
	private TableColumn<Producto, Integer> ColumnIdProducto;

	@FXML
	private TableColumn<Producto, String> ColumnNombre;

	@FXML
	private TableColumn<Producto, Float> ColumnPrecio;

	@FXML
	private TableColumn<Producto, Integer> ColumnInv;

	@FXML
	private TableColumn<Producto, Integer> ColumnCateg;

	ConsultationP objProductoR = new ConsultationP();

	List<Producto> list_P;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		// Inicializar ComboBox con valores de ejemplo
		CbOrdB.getItems().addAll("Hogar", "Cocina", "Electronica", "Juguete");

		CbOrdB.setOnAction(e -> {
			selectionMethod(e); //
		});

		this.ColumnIdProducto.setCellValueFactory(new PropertyValueFactory<>("idProducto"));
		this.ColumnNombre.setCellValueFactory(new PropertyValueFactory<>("descripcionP"));
		this.ColumnPrecio.setCellValueFactory(new PropertyValueFactory<>("precio"));
		this.ColumnInv.setCellValueFactory(new PropertyValueFactory<>("inv"));
		this.ColumnCateg.setCellValueFactory(new PropertyValueFactory<>("categoria"));

		// Cargar Producto al inicializar
		cargarProductos(listDefect(list_P));
	}

	public void cargarProductos(@SuppressWarnings("exports") List<Producto> ls_P) {
		tblVProducts.getItems().clear(); // Limpiar la tabla antes de agregar nuevos datos
		tblVProducts.getItems().addAll(ls_P); // Agregar productos a la tabla
	}

	private List<Producto> listDefect(List<Producto> listP) {
		List<Producto> ls_P = objProductoR.getDefaultProducts();
		return ls_P;
	}

	public void actualizarTablaEntidades() {
		String opcElejida = CbOrdB.getValue();
		switch (opcElejida) {
			case "Hogar":
				list_P = objProductoR.getProductsForHogar();
				break;
			case "Cocina":
				list_P = objProductoR.getProductsForKitchen();
				break;
			case "Electronica":
				list_P = objProductoR.getProductsForElectronics();
				break;
			case "Juguete":
				list_P = objProductoR.getProductsForToys();
				break;
			default:
				return;
		}

		cargarProductos(list_P);
	}

	@FXML
	public void selectionMethod(@SuppressWarnings("exports") ActionEvent event) {
		actualizarTablaEntidades();
	}
}
