package project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import project.controller.PanelController;
import project.model.DbConexion;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(@SuppressWarnings("exports") Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("view/fxml/pagePanel.fxml"));
        Parent root = loader.load();
        stage.setScene(new Scene(root));
        stage.setTitle("Panel de control");
        // Panel de control
        PanelController controller = loader.getController();
        // Enviando panel de control.
        controller.recivePanel(stage);
        // enviando las 4 ventanas del CRUD
        controller.reciveWindowsOptions(GenerateFxmlTable("ventana_addP", "Agregar Producto"),
                GenerateFxmlTable("ventana_deleteP", "Eliminar Producto"),
                GenerateFxmlTable("ventana_modifyP", "Actualizar Producto"),
                GenerateFxmlTable("ventana_consultationP", "Consultar Productos"));
        stage.show();
    }

    @SuppressWarnings("exports")
    public Stage GenerateFxmlTable(String file, String title) throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("view/fxml/" + file + ".fxml"));
        Parent root = loader.load();
        stage.setScene(new Scene(root));
        stage.setTitle(title);

        return stage;
    }

    @Override
    public void stop() throws Exception {
        // Cerrar la conexion a la base de datos.
        DbConexion.closeConection_db();
    }

    public static void main(String[] args) {
        launch();
    }

}