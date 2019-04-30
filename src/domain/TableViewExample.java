package domain;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;


/**
 * https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/TableView.html
 */
public class TableViewExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {



        //1
        TableView tableView = new TableView();
        tableView.setMinSize(550,900);

        // 2 dawaj columny
        TableColumn<String, Person> column1 = new TableColumn<>("Name");
        column1.setCellValueFactory(new PropertyValueFactory<>("firstName"));


        TableColumn<String, Person> column2 = new TableColumn<>("Email");
        column2.setCellValueFactory(new PropertyValueFactory<>("lastName"));


        TableColumn<String, Person> column3 = new TableColumn<>("Age");
        column3.setCellValueFactory(new PropertyValueFactory<>("age"));

        // 2a
        tableView.getColumns().add(column1);
        tableView.getColumns().add(column2);
        tableView.getColumns().add(column3);



        // 3 populuj
        tableView.getItems().add(new Person("kri", "krieger.algrnp@gmail.com"));
        tableView.getItems().add(new Person("lw", "lukas.wilk@gmail.com"));
        tableView.getItems().add(new Person("lw", "lukasz0wilk@gmail.com"));



        // TODO CHANGE IT DB
//        ArrayList<Person> arrayList = new ArrayList<>();
//        for (int i = 0; i <100 ; i++) {
//        arrayList.add(new Person (i+"a", "b" +i));
//        }

        for (int i = 0; i < 100000; i++) {
            tableView.getItems().add(new Person (i+ "*", ""+i));
        }


       //FileInputStream input = new FileInputStream("a2.jpg");
        FileInputStream input = new FileInputStream("res/a4.jpg/");
        System.out.print(System.getProperty(String.valueOf(input)));


        Image image = new Image(input);
        ImageView imageView = new ImageView(image);

        // 4 jedno wlazi w drugie
        VBox vbox = new VBox(imageView, tableView );
        Scene scene = new Scene(vbox, 700, 900);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Experiment");
        primaryStage.show();
    }

}