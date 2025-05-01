package br.cefet;

import br.cefet.views.AlunosView;
import br.cefet.views.TreinadoresView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AcademiaGUI extends Application {

    private Academia academia;

    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage) {
        academia = new Academia();
        
        TabPane tabPane = new TabPane();
        
        // Members Tab
        Tab membersTab = new Tab("Alunos");
        VBox membersView = new AlunosView(getAcademia());
        membersTab.setContent(membersView);
        
        // Employees Tab
        Tab employeesTab = new Tab("Professores");
        VBox employeesView = new TreinadoresView(getAcademia());
        employeesTab.setContent(employeesView);
        
        tabPane.getTabs().addAll(membersTab, employeesTab);
        
        Scene scene = new Scene(tabPane, 1000, 800);
        primaryStage.setTitle("Academia do Cefet RJ - Maria da Graça");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
    
    public Academia getAcademia() {
        return this.academia;
    }
    
    public void setAcademia(Academia academia) {
        this.academia = academia;
    }
    
    
    
}
