package main;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.nio.file.Paths;

/**
 * Created by dell-pc on 2017/2/19.
 */
public class Sound {
    public static void backGroundMusic() {
        new Thread() {
            public synchronized void start() {
                MediaPlayer backgroundMusic = new MediaPlayer(new Media(Paths.get("resource/background.mp3").toUri().toString()));
                backgroundMusic.setCycleCount(MediaPlayer.INDEFINITE);
                backgroundMusic.play();
            }
        }.start();
    }

    public static void eatBeanSound() {
        new MediaPlayer(new Media(Paths.get("resource/eatbean.wav").toUri().toString()));
    }

    public static void winSound() {
        new MediaPlayer(new Media(Paths.get("resource/win.wav").toUri().toString()));
    }


    public static void dieSound() {
        new MediaPlayer(new Media(Paths.get("resource/win.wav").toUri().toString()));
    }
}