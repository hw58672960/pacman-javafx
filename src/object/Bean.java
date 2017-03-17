package object;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import main.Data;
import main.Sound;

import java.nio.file.Paths;

/**
 * Created by dell-pc on 2017/2/19.
 */
public class Bean extends MapObject implements Data {
    public Bean(int x, int y, int type) {
        this.x = x;
        this.y = y;
        this.type = type;
        image = new ImageView(new Image(Paths.get("resource/bean" + type + ".jpg").toUri().toString()));
        initiateImage();
    }

    public void setImage(String filename) {
        image.setImage(new Image(Paths.get(filename).toUri().toString()));
    }

    @Override
    public void eat() {
        switch (type) {
            case 1:
                Sound.eatBeanSound();
                //showStatus.addScore(xiao)
                break;
            case 2:
                Sound.eatBeanSound();
//showStatus.addScore(da)
                //pacman.bigStrengthMode()
        }
        type = 0;
        setImage("resource/bean0.jpg");
    }

    @Override
    public char getTypeChar() {
        switch(type){
            case 0:return '0';
            case 1:return '.';
            case 2:return 'a';
            default:return ' ';
        }
    }
}
