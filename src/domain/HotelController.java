package domain;

import javafx.collections.ObservableList;
import javafx.scene.control.Label;

import java.net.URL;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ResourceBundle;


public class HotelController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        TableView<Person> table = new TableView<Person>();
        ObservableList<Person> teamMembers = getTeamMembers();
        table.setItems(teamMembers);
        TableColumn<Person,String> firstNameCol = new TableColumn<Person,String>("First Name");
        firstNameCol.setCellValueFactory(new PropertyValueFactory("firstName"));
        TableColumn<Person,String> lastNameCol = new TableColumn<Person,String>("Last Name");
        lastNameCol.setCellValueFactory(new PropertyValueFactory("lastName"));

        table.getColumns().setAll(firstNameCol, lastNameCol);

    }

    private ObservableList<Person> getTeamMembers() {

        return null;
    }


}
