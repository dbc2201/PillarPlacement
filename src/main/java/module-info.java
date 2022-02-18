module io.github.dbc.pillarplacement {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.logging.log4j;

    opens io.github.dbc.pillarplacement to javafx.fxml;
    exports io.github.dbc.pillarplacement;
}