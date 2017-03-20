package pane;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/**
 * Created by dell-pc on 2017/2/19.
 */
public class InputNamePane extends VBox {
    private TextField txName = new TextField();
    private Label lbok = new Label("OK");

    public InputNamePane(String message) {
        Label lbMessage = new Label(message);
        setStyle("-fx-background-color:black");
        setAlignment(Pos.CENTER);
        lbMessage.setFont(new Font("Calibre", 20));
        lbMessage.setTextFill(Color.GOLD);
        txName.setPrefColumnCount(10);
        txName.setAlignment(Pos.CENTER);
        txName.setStyle("-fx-background-color:lightgoldenrodyellow");
        lbok.setFont(new Font("Calibre", 30));
        lbok.setTextFill(Color.GOLD);
        lbok.setOnMouseEntered(e -> lbok.setFont(new Font("Calibre", 30)));
        lbok.setOnMouseExited(e -> lbok.setFont(new Font("Calibre", 30)));
        getChildren().addAll(lbMessage,txName,lbok);
    }
}
