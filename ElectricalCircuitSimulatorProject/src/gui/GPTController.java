package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class GPTController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label answerField;

    @FXML
    private TextField textField;

    @FXML
    void inputPress(ActionEvent event) {
        String input = textField.getText();
        String answer = Main.chatGPT(input);
        answerField.setText(answer);
    }

    @FXML
    void initialize() {
        assert answerField != null : "fx:id=\"answerField\" was not injected: check your FXML file 'ChatGPT.fxml'.";
        assert textField != null : "fx:id=\"textField\" was not injected: check your FXML file 'ChatGPT.fxml'.";
    }
}
