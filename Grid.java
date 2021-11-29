package com.example.gameoflife;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.Random;

import static java.lang.Integer.parseInt;
import static javafx.geometry.Pos.CENTER;
import static javafx.scene.paint.Color.*;

public class Grid extends Application {

    private javafx.scene.shape.Rectangle rectangle;

    @Override
    public void start(Stage stage) {
        GridPane pane = new GridPane();
        pane.setMaxHeight(200);
        pane.setMaxWidth(400);
        pane.setAlignment(CENTER);

        for (int i=0;i<75;i++){
            for(int j = 0;j<50; j++){
                pane.add(new javafx.scene.shape.Rectangle(10,10),i,j);
            }
        }

        GridPane pane2 = new GridPane();
        pane2.setMaxHeight(200);
        pane2.setMaxWidth(400);
        pane2.setAlignment(CENTER);

        for (int i=0;i<75;i++){
            for(int j = 0;j<50; j++){
                pane2.add(new javafx.scene.shape.Rectangle(10,10, BLACK),i,j);
            }
        }

        GridPane pane1 = new GridPane();
        pane1.setMaxHeight(200);
        pane1.setMaxWidth(400);
        pane1.setAlignment(CENTER);

        for (int i=0;i<75;i++){
            for(int j = 0;j<50; j++){
                pane1.add(new javafx.scene.shape.Rectangle(10,10),i,j);
            }
        }
        Button choice1 = new Button("Automated_Game_of_life");
        choice1.setFont(Font.font(14));
        choice1.setTextFill(Color.RED);

        Button choice2 = new Button("Semi_Automated_Game_Of_Life");
        choice2.setFont(Font.font(14));
        choice2.setTextFill(Color.BLUE);

        Button choice3 = new Button("Manual_Game_Of_Life");
        choice3.setFont(Font.font(14));
        choice3.setTextFill(Color.GREEN);

        Button back1 = new Button("Back");
        back1.setTextFill(Color.RED);
        back1.setFont(Font.font(14));

        Label label1 = new Label("Case 1: Automated Game of life");
        label1.setAlignment(CENTER);
        label1.setFont(Font.font(20));
        label1.setTextFill(GRAY);

        Label labelfood = new Label("Units of food:");
        labelfood.setAlignment(CENTER);
        labelfood.setFont(Font.font(14));
        labelfood.setTextFill(GRAY);
        TextField food_field = new TextField("Introduce Food");
        food_field.setMaxWidth(100);

        Button start1 = new Button("Start");
        start1.setFont(Font.font(14));
        start1.setTextFill(Color.GREEN);
        start1.setOnAction(e-> {
                    food_field.getText();
                    Food.food = parseInt(food_field.getText());
            Random random = new Random();
            int count = 0;
            for (int i=0;i<75;i++){
                for(int j = 0;j<50; j++){
                    while(count < Food.food) {
                        int xcoord = random.nextInt(75);
                        int ycoord = random.nextInt(50);
                        rectangle = new javafx.scene.shape.Rectangle(10, 10, YELLOW);
                        pane.add(rectangle, xcoord, ycoord);
                        //index begin with 1
                        System.out.println(xcoord + " " + ycoord);
                        count++;
                    }
                }
            }
                    System.out.println(Food.food);
            food_field.clear();
                }
        );
        Button stop1= new Button("Stop");
        stop1.setTextFill(Color.RED);
        stop1.setFont(Font.font(14));

        HBox hbox1 = new HBox();
        hbox1.setSpacing(50);
        hbox1.setAlignment(CENTER);
        hbox1.getChildren().addAll(start1,stop1,back1);

        Button back2 = new Button("Back");
        back2.setTextFill(Color.RED);
        back2.setFont(Font.font(14));

        Label label2 = new Label("Case 2: Semi-Automated Game of life");
        label2.setAlignment(CENTER);
        label2.setFont(Font.font(20));
        label2.setTextFill(GRAY);

        Label labelfood2 = new Label("Food Units");
        labelfood2.setFont(Font.font(14));
        labelfood2.setTextFill(GRAY);

        Label labelcell = new Label("Number of sexed cells");
        labelcell.setFont(Font.font(14));
        labelcell.setTextFill(GRAY);

        Label labelcell1 = new Label("Number of sexed cells");
        labelcell1.setFont(Font.font(14));
        labelcell1.setTextFill(GRAY);

        HBox labelbox1 = new HBox();
        labelbox1.setAlignment(CENTER);
        labelbox1.setSpacing(75);
        labelbox1.setAlignment(CENTER);
        labelbox1.getChildren().addAll(labelfood2,labelcell,labelcell1);

        Button start2 = new Button("Start");
        start2.setFont(Font.font(14));
        start2.setTextFill(Color.GREEN);

        Button stop2= new Button("Stop");
        stop2.setTextFill(Color.RED);
        stop2.setFont(Font.font(14));

        HBox startstop = new HBox();
        startstop.getChildren().addAll(start2,stop2,back2);
        startstop.setAlignment(CENTER);
        startstop.setSpacing(50);

        TextField food2 = new TextField("Units of food");
        food2.setMaxWidth(100);
        food2.setAlignment(CENTER);

        TextField sexedcell = new TextField("Number of sexed cells");
        sexedcell.setMaxWidth(200);
        sexedcell.setAlignment(CENTER);

        TextField asexualcell = new TextField("Number of assexual cell");
        asexualcell.setMaxWidth(200);
        asexualcell.setAlignment(CENTER);

        HBox textfields = new HBox();
        textfields.setSpacing(50);
        textfields.setAlignment(CENTER);
        textfields.getChildren().addAll(food2,sexedcell,asexualcell);

        start2.setOnAction(e->{
            Food.food = parseInt(food2.getText());

            Random random = new Random();
            int count = 0;
            for (int i=0;i<75;i++){
                for(int j = 0;j<50; j++){
                    while(count < Food.food) {
                        int xcoord = random.nextInt(75);
                        int ycoord = random.nextInt(50);
                        rectangle = new javafx.scene.shape.Rectangle(10, 10, YELLOW);
                        pane.add(rectangle, xcoord, ycoord);
                        //index begin with 1
                        System.out.println(xcoord + " " + ycoord);
                        count++;
                    }
                }
            }

            System.out.println(Food.food);
            System.out.println(sexedcell.getText());
            System.out.println(asexualcell.getText());
            food2.clear();
        });
        Button back3 = new Button("Back");
        back3.setTextFill(Color.RED);
        back3.setFont(Font.font(14));

        Label label3 = new Label("Case 3: Manual Game Of Life");
        label3.setAlignment(CENTER);
        label3.setFont(Font.font(20));
        label3.setTextFill(GRAY);

        TextField food3 = new TextField();
        food3.setMaxWidth(150);
        food3.setText("Units of food:");
        food3.setAlignment(CENTER);

        Button start3 = new Button("Start");
        start3.setFont(Font.font(14));
        start3.setTextFill(Color.GREEN);

        Button stop3= new Button("Stop");
        stop3.setTextFill(Color.RED);
        stop3.setFont(Font.font(14));

        Button addcell1 = new Button("Add sexed cell");
        Button addcell2 = new Button("Add asexual cell");
        //int randomx = (int) Math.ceil(Math.random() * 75);
        //int randomy = (int) Math.ceil(Math.random() *50);
        start3.setOnAction(e->{
            Food.food = parseInt(food3.getText());
            System.out.println(Food.food);
            Random random = new Random();
            int count = 0;
            for (int i=0;i<75;i++){
                for(int j = 0;j<50; j++){
                    while(count < Food.food) {
                        int xcoord = random.nextInt(75);
                        int ycoord = random.nextInt(50);
                        rectangle = new javafx.scene.shape.Rectangle(10, 10, YELLOW);
                        pane.add(rectangle, xcoord, ycoord);
                        //index begin with 1
                        System.out.println(xcoord + " " + ycoord);
                        count++;
                    }
                }
            }
            food3.clear();
        });

        stop3.setOnAction(e->food3.clear());

        addcell1.setFont(Font.font(14));
        addcell2.setFont(Font.font(14));
        addcell1.setTextFill(Color.RED);
        addcell2.setTextFill(Color.BLUE);
        Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
        Alert alert2 = new Alert(Alert.AlertType.INFORMATION);

        alert1.setContentText("You selected Sexed cell type!");
        alert2.setContentText("You selected Assexual cell type");

        alert1.setTitle("Sexed cell");
        alert2.setTitle("Asexual cell");

        alert1.setHeaderText("Nice choice!");
        alert2.setHeaderText("Right choice for population!");

        addcell1.setOnAction(e-> alert1.show());
        addcell2.setOnAction(e-> alert2.show());

        HBox hbox3 = new HBox();
        hbox3.setAlignment(CENTER);
        hbox3.getChildren().addAll(food3,addcell1,addcell2);
        HBox startstop2 = new HBox();

        startstop2.getChildren().addAll(start3,stop3,back3);
        startstop2.setAlignment(CENTER);
        startstop2.setSpacing(50);

        Label home_label = new Label("Game Of Life");
        home_label.setTextFill(GRAY);
        home_label.setAlignment(CENTER);
        home_label.setFont(Font.font(22));
        hbox3.setSpacing(50);
        VBox homebox = new VBox();
        homebox.setAlignment(CENTER);
        homebox.setSpacing(100);
        homebox.getChildren().addAll(home_label,choice1,choice2,choice3);

        VBox casebox1 = new VBox();
        casebox1.setAlignment(CENTER);
        casebox1.getChildren().addAll(label1,pane1,labelfood,food_field,hbox1);

        VBox casebox2 = new VBox();
        casebox2.setAlignment(CENTER);
        casebox2.getChildren().addAll(label2,pane2,labelbox1,textfields,startstop);

        VBox casebox3 = new VBox();
        casebox3.setAlignment(CENTER);
        casebox3.getChildren().addAll(label3,pane,hbox3,startstop2);

        casebox1.setSpacing(10);
        casebox2.setSpacing(10);
        casebox3.setSpacing(10);

        pane1.setAlignment(CENTER);
        pane2.setAlignment(CENTER);
        pane.setAlignment(CENTER);
        Scene home_scene = new Scene(homebox,500,500);

        Scene case1 = new Scene(casebox1,900,800);
        Scene case2 = new Scene(casebox2,900,800);
        Scene case3 = new Scene(casebox3,900,800);

        stage.setAlwaysOnTop(true);
        stage.setTitle("Game of Life");

        choice1.setOnAction(e-> stage.setScene(case1));
        choice2.setOnAction(e-> stage.setScene(case2));
        choice3.setOnAction(e-> stage.setScene(case3));

        back1.setOnAction(e->{
            stage.setScene(home_scene);
            food_field.clear();
        });
        stop1.setOnAction(e->food_field.clear());
        stop2.setOnAction(e->{
            food2.clear();
            sexedcell.clear();
            asexualcell.clear();
        });

        back2.setOnAction(e->{
            stage.setScene(home_scene);
            food2.clear();
            sexedcell.clear();
            asexualcell.clear();
        });

        back3.setOnAction(e->stage.setScene(home_scene));

        stage.setScene(home_scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}