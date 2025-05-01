package br.cefet.dialogs;

import br.cefet.Aluno;
import br.cefet.Plano;
import javafx.geometry.Insets;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class AddAlunoDialog extends Dialog<Aluno> {
 
    public AddAlunoDialog() {
        setTitle("Adicionar Aluno");
        setHeaderText("Preencha os dados do aluno");
        
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20));
        
        TextField nameField = new TextField();
        TextField ageField = new TextField();
        ageField.setPromptText("dd/MM/yyyy");
        
        ComboBox<String> planCombo = new ComboBox<>();
        planCombo.getItems().addAll("Mensal", "Anual", "Trimestral");
        
        grid.add(new Label("Nome:"), 0, 0);
        grid.add(nameField, 1, 0);
        grid.add(new Label("Nascimento:"), 0, 1);
        grid.add(ageField, 1, 1);
        grid.add(new Label("Plano:"), 0, 2);
        grid.add(planCombo, 1, 2);
        
        getDialogPane().setContent(grid);
        getDialogPane().getButtonTypes().addAll(ButtonType.OK, ButtonType.CANCEL);
        
        setResultConverter(buttonType -> {
            if (buttonType == ButtonType.OK) {
                try {
                    String name = nameField.getText();
                    String dtNascimento = ageField.getText();
                    String plan = planCombo.getValue();
                    return new Aluno(name, dtNascimento, new Plano(plan));
                } catch (NumberFormatException e) {
                    new ShowAlertDialog("Erro", "Formato de data inválido");
                    return null;
                }
            }
            return null;
        });
    }

}
