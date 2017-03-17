package object;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import main.Data;

import java.nio.file.Paths;

/**
 * Created by dell-pc on 2017/2/19.
 */
public class Wall extends MapObject implements Data{

   public Wall(int x,int y,int type){
       this.x=x;
       this.y=y;
       this.type=type;
       image=new ImageView(new Image(Paths.get("resource/map"+type+".jpg").toUri().toString()));
       initiateImage();
   }

    @Override
    public void eat() {

    }

    @Override
    public char getTypeChar() {
        return (char)(type+'0');
    }
}
