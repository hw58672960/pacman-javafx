package object;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import main.Data;

import java.nio.file.Paths;

/**
 * Created by dell-pc on 2017/2/19.
 */
public class Bean extends MapObject implements Data {
    public Bean(int x,int y,int type){
        this.x=x;
        this.y=y;
        this.type=type;
        image=new ImageView(new Image(Paths.get("resource/bean"+type+".jpg").toUri().toString()));
        initiateImage();
    }
public void setImage(String filename){
      image.setImage(new Image(Paths.get(filename).toUri().toString()));
}
    @Override
    public void eat() {
switch(type){
    case 1:
}
    }

    @Override
    public char getTypeChar() {
        return 0;
    }
}
