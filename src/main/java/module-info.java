module project {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires javafx.graphics;
    requires com.zaxxer.hikari;
    requires org.slf4j;

    opens project to javafx.fxml;
    opens project.controller;

    exports project;
    exports project.controller;

    opens project.model to javafx.base;
}
