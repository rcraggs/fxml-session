package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DestController {


    @FXML
    Label label;


    @FXML
    public void initialize() {
        label.setText(Model.getInstance().id);
    }
}
