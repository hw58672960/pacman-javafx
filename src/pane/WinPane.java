package pane;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import main.Data;

/**
 * Created by dell-pc on 2017/3/20.
 */
public class WinPane extends VBox implements Data {
    private Label lbplayAgain = new Label("PlayAgain");
    private Label lbBack = new Label("Menu");

    public WinPane() {
        Label lbwin = new Label("You win!!");
        lbwin.setFont(new Font("Calibre", 60));
        lbwin.setTextFill(Color.GOLD);
        lbplayAgain.setFont(new Font("Calibre", 30));
        lbplayAgain.setTextFill(Color.GOLD);
        lbplayAgain.setOnMouseEntered(e -> lbplayAgain.setFont(new Font("Calibre", 35)));
        lbplayAgain.setOnMouseExited(e -> lbplayAgain.setFont(new Font("Calibre", 30)));
        lbBack.setFont(new Font("Calibre", 30));
        lbBack.setTextFill(Color.GOLD);
        lbBack.setOnMouseEntered(e -> lbBack.setFont(new Font("Calibre", 35)));
        lbBack.setOnMouseExited(e -> lbBack.setFont(new Font("Calibre", 30)));
        setAlignment(Pos.CENTER);
        setStyle("-fx-background-color: black");
        getChildren().addAll(lbwin, lbplayAgain, lbBack);
    }

    public Label getLbPlayAgain() {
        return lbplayAgain;
    }

    public Label getLbBack() {
        return lbBack;
    }
}
