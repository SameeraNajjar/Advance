module org.example.javadb {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.persistence;
    requires org.hibernate.orm.core;
    requires jdk.internal.le;
    requires java.naming;
    requires java.sql;
    requires mysql.connector.java;
    requires java.desktop;

    opens org.example.javadb to javafx.fxml;
    opens org.example.javadb.models;
    exports org.example.javadb;
}