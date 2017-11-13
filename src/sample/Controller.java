package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    TextField textbox;

    @FXML
    Button button;

    public void doit() {

        Model.getInstance().id = textbox.getText();

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("dest.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene((Parent) fxmlLoader.load()));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
