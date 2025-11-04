package com.fahrenfarther;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FahrenFartherService {
    @FXML private Label lblTotalCars;
    @FXML private Label lblTotalUsers;
    @FXML private Label lblActiveRentals;

    public void initialize() {
        // Example dynamic values
        lblTotalCars.setText("24");
        lblTotalUsers.setText("132");
        lblActiveRentals.setText("5");
    }
}
