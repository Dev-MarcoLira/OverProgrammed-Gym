package br.cefet.dialogs;

import br.cefet.Treinador;
import javafx.geometry.Insets;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class AddTreinadorDialog  extends Dialog<Treinador> {
    
    public AddTreinadorDialog() {

        setTitle("Adicionar Treinador");
        setHeaderText("Preencha os dados do treinador");
        
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20));
        
        TextField nameField = new TextField();
        TextField roleField = new TextField();
        TextField salaryField = new TextField();
        
        grid.add(new Label("Nome:"), 0, 0);
        grid.add(nameField, 1, 0);
        grid.add(new Label("Cargo:"), 0, 1);
        grid.add(roleField, 1, 1);
        grid.add(new Label("Salário:"), 0, 2);
        grid.add(salaryField, 1, 2);
        
        getDialogPane().setContent(grid);
        getDialogPane().getButtonTypes().addAll(ButtonType.OK, ButtonType.CANCEL);
        
        setResultConverter(buttonType -> {
            if (buttonType == ButtonType.OK) {
                try {
                    String name = nameField.getText();
                    String role = roleField.getText();
                    float salary = Float.parseFloat(salaryField.getText());
                    return new Treinador(name, role, salary);
                } catch (NumberFormatException e) {
                    new ShowAlertDialog("Erro", "Formato de salário inválido");
                    return null;
                }
            }
            return null;
        });
    }
    

}
