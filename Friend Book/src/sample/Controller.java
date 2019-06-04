package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;


public class Controller {
    public TextField textGetName;
    public TextField textGetAge;
    public TextField textGetColour;
    public ListView<Friend> printListView = new ListView<>();
    public Label labelPrintAge;
    public Label labelPrintName;
    public Label labelPrintColour;



    //create a friend
    public void createFriend(ActionEvent actionEvent) {
       Friend f = new Friend(textGetName.getText(),Integer.parseInt(textGetAge.getText()),textGetColour.getText());
       printListView.getItems().add(f);
       textGetName.clear();
       textGetAge.clear();
       textGetColour.clear();
    }
    //display a friend
    public void displayFriends(javafx.scene.input.MouseEvent mouseEvent) {
        Friend f;
        f = printListView.getSelectionModel().getSelectedItem();

        labelPrintName.setText(f.name);
        labelPrintAge.setText(Integer.toString(f.getAge()));
        labelPrintColour.setText(f.colour);
    }
    //delete a friend
    public void deleteFriend(ActionEvent actionEvent) {
        Friend f;
        f = printListView.getSelectionModel().getSelectedItem();
        printListView.getItems().remove(f);
    }

}
