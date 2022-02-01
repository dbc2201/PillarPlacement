module io.github.dbc.pillarplacement {
    requires javafx.controls;
    requires javafx.fxml;


    opens io.github.dbc.pillarplacement to javafx.fxml;
    exports io.github.dbc.pillarplacement;
}