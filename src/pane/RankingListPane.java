package pane;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by dell-pc on 2017/2/19.
 */
public class RankingListPane extends VBox {
    private ArrayList<String> names = new ArrayList<>();
    private ArrayList<Integer> scores = new ArrayList<>();
    private Label lbBack = new Label("Menu");

    public RankingListPane() {
        Label lbRankingList = new Label("Ranking list");
        Label[] lbnames = new Label[5];
        for (int i = 0; i < names.size(); i++) {
            lbnames[i] = new Label(names.get(i) + ":" + scores.get(i));
            lbnames[i].setFont(new Font("Calibre", 30));
            lbnames[i].setTextFill(Color.GOLD);
        }
        lbRankingList.setFont(new Font("Calibre", 60));
        lbRankingList.setTextFill(Color.GOLD);

        lbBack.setFont(new Font("Calibre", 60));
        lbBack.setTextFill(Color.GOLD);
        lbBack.setOnMouseEntered(e -> lbBack.setFont(new Font("Calibre", 35)));
        lbBack.setOnMouseExited(e -> lbBack.setFont(new Font("Calibre", 30)));
        setAlignment(Pos.CENTER);
        setStyle("-fx-background-color:black");
        getChildren().add(lbRankingList);
        for (int i = 0; i < names.size(); i++) {
            getChildren().add(lbnames[i]);
        }
        getChildren().add(lbBack);
    }
    public void writeRecord(String name,int score){
       try(PrintWriter output=new PrintWriter(new File("resource/rankinglist.txt"))){
           if(names.size()==0){
               names.add(name);
               scores.add(score);
           }
           else{
               boolean isAdd=false;
               for(int i=0;i<names.size();i++){
                   if(score>=scores.get(i)){
                       names.add(i,name);
                       scores.add(i,score);
                       isAdd=true;
                       if(names.size()>5){
                           names.remove(names.size()-1);
                           scores.remove(names.size()-1);
                       }
                       break;
                   }
               }
               if(names.size()<5&&!isAdd){
                   names.add(name);
                   scores.add(score);
               }
           }
           for(int i=0;i<names.size();i++){
               output.println(names.get(i));
               output.println(scores.get(i));
           }

       }
       catch (FileNotFoundException e) {
           e.printStackTrace();
       }
    }
    private void getScoresFromFile(){
        Scanner input=null;
        try{
            input=new Scanner(new File("resource/rankinglist.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        assert input!=null;
        for(int i=0;i<5;i++){
            if(input.hasNextLine()){
                names.add(input.nextLine());
                scores.add(Integer.parseInt(input.nextLine()));
            }
            else
                break;
        }
    }
    public ArrayList<Integer>getScores(){
        return scores;
    }
    public Label getLbBack(){
        return lbBack;
    }
}

