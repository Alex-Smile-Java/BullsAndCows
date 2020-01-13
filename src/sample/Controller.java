package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableView;

public class Controller {


    public TableView<Turn> turnList;
    public Spinner<Integer> userNum1;
    public Spinner<Integer> userNum2;
    public Spinner<Integer> userNum3;
    public Spinner<Integer> userNum4;
    private  int turnCounter;

    public void doTurn() {
        turnCounter++;

        int n1 = userNum1.getValue();
        int n2 = userNum2.getValue();
        int n3 = userNum3.getValue();
        int n4 = userNum4.getValue();
        var guess = String.format("%d %d %d %d", n1, n2, n3, n4);
        var turn = new Turn();
        turn.setUserGuess(guess);
        turn.setTurnNr(turnCounter);

        turnList.getItems().add(0,turn);
        turnList.sort();

    }
}
