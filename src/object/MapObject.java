package object;

import main.Data;
import main.Main;
import javafx.scene.image.ImageView;


/**
 * Created by dell-pc on 2017/2/19.
 */
public abstract class MapObject implements Data {
    protected int x, y;
    protected int type;
    protected ImageView image;

    public void initiateImage() {
        image.setX(WIDTH_OF_NODES * x);
        image.setY(WIDTH_OF_NODES * y);
        image.setFitHeight(WIDTH_OF_NODES);
        image.setFitWidth(WIDTH_OF_NODES);
    }

    public int getType() {
        return type;
    }

    public ImageView getImagee() {
        return image;
    }

    public abstract void eat();
    public abstract char getTypeChar();
}
