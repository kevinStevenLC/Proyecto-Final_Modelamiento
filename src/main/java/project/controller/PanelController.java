package project.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

public class PanelController implements Initializable {
	Stage stagePanel;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	public void recivePanel(@SuppressWarnings("exports") Stage stage) {
		this.stagePanel = stage;
	}

	@FXML
	void frame() {
		// show
	}

}
