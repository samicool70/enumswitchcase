import javafx.application.Application;
import javafx.scene.control.ChoiceDialog;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Optional;

public class enumswitchcase extends Application {
    public enum bdaymonths {
        January, February, March, April, May, June, July, August, September, October, November, December
    }
    public static void main(String[]args){
        launch(args);
    }
    @Override
    public void start(Stage PrimaryStage) throws Exception{
        ArrayList<String> choices= new ArrayList<>();
        choices.add("January");
        choices.add("February");
        choices.add("March");
        choices.add("April");
        choices.add("May");
        choices.add("June");
        choices.add("July");
        choices.add("August");
        choices.add("September");
        choices.add("October");
        choices.add("November");
        choices.add("December");
        ChoiceDialog<String>dialog=new ChoiceDialog<>("January", choices);
        Optional<String>input=dialog.showAndWait();
        String value=input.get();
        switch(value){
            case "December":
                System.out.println("Do you want to build a snow man?");
                break;
            case "January":
                System.out.println("Do you want to build a snow man?");
                break;
            case "February":
                System.out.println("Do you want to build a snow man?");
                break;
            case "March":
                System.out.println("Happy spring days");
                break;
            case "April":
                System.out.println("Happy spring days");
                break;
            case "May":
                System.out.println("Happy spring days");
                break;
            case "June":
                System.out.println("It is a summer time");
                break;
            case "July":
                System.out.println("It is a summer time");
                break;
            case "August":
                System.out.println("It is a summer time");
                break;
            case "September":
                System.out.println("Welcome to the foliage season");
                break;
            case "October":
                System.out.println("Welcome to the foliage season");
                break;
            case "November":
                System.out.println("Welcome to the foliage season");
                break;
        }
    }

}
