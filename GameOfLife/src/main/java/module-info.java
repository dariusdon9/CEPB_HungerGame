module com.example.gameoflife {
    requires javafx.fxml;
    requires javafx.web;
    requires javafx.controls;
    requires javafx.base;
    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires java.desktop;
    requires java.sql;

    opens com.example.gameoflife to javafx.fxml;
    exports com.example.gameoflife;
}