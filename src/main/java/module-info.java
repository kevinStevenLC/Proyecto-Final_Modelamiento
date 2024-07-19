module project {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires javafx.graphics;

    opens project to javafx.fxml;
    opens project.controller;

    exports project;
    exports project.controller;

    opens project.model to javafx.base;
}
