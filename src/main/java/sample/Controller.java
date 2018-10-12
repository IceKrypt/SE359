package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import sample.AgileWindow;

import java.util.Random;

public class Controller {

    /*
       Todo: - Add functionality for questions
       Todo: Create dialogbox for questions
       Todo: Comment my shit code
       Todo: Add record of player score, this comes AFTER question functionality is established though.
       Todo: Store "bank" of questions, able to distinguish which ones have been asked already, and  which ones have not been asked yet.
     */


    @FXML private  Button rollButton;
    @FXML private Text rollNumber;
    @FXML private Circle teamOne;
    @FXML private Circle teamTwo;
    @FXML private Text turn;

    @FXML private GridPane gridMap;

    int row = 0;
    int column = 0;




    @FXML
    private void roll(){

        Random number = new Random();
        int numberAsInt  = number.nextInt(7)+1;
        String numberAsString = Integer.toString(numberAsInt);

        rollNumber.setText(numberAsString);

        movePlayer(numberAsInt,getTurnOrder());
        if(turn.getText() =="Team One"){
            turn.setText("Team Two");
        }
        else{
            turn.setText("Team One");

        }



    }
    @FXML
    protected void initialize() {
            turn.setText(chooseTurnOrder());
    }

    private void movePlayer(int x,Circle team){

        if (column >= 35  && row >= 20 ){
            System.out.println("reached the end");
        }

        if (column >= 35){
            row = row + 1;
            column = 1;
            gridMap.setRowIndex(team,row);
            gridMap.setColumnIndex(team,column +x);

        }
        else{

            column = column+ x;
            System.out.println(row + " " +column);
            gridMap.setRowIndex(team,row);
            gridMap.setColumnIndex(team,column);
        }

    }
    private String chooseTurnOrder(){


        Random number = new Random();
        int numberAsInt  = number.nextInt(2)+1;
        if (numberAsInt == 1){
            return "Team One";
        }
        else{
            return "Team Two";
        }

    }
    private Circle getTurnOrder(){

        if (turn.getText() == "Team One"){
            return teamOne;
        }
        else{
            return teamTwo;
        }
    }


}
