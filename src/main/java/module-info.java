module com.example.crudjpa {
    requires javafx.controls;
    requires javafx.fxml;

// configurações do Hibernat, Postgres e Lombok
    requires org.hibernate.orm.core;
    requires java.naming;
    requires java.sql;
    requires org.postgresql.jdbc;
    requires jakarta.persistence;
    requires static lombok;

    opens com.example.crudjpa to javafx.fxml;
    opens com.example.crudjpa.model.entities to org.hibernate.orm.core;
    exports com.example.crudjpa;
}