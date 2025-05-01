package br.cefet.views;

import br.cefet.Academia;
import br.cefet.Aluno;
import br.cefet.dialogs.AddAlunoDialog;
import javafx.beans.property.SimpleStringProperty;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

public class AlunosView extends VBox {

    private TableView<Aluno> memberTable;
    private Academia academia;
    
    
    public AlunosView(Academia academia) {
        
        setAcademia(academia);
        this.setSpacing(10);
        this.setPadding(new Insets(10));
        
        memberTable = new TableView<>();
        
        TableColumn<Aluno, String> nameCol = new TableColumn<>("Nome");
        nameCol.setCellValueFactory(new PropertyValueFactory<>("nome"));
        
        TableColumn<Aluno, Integer> ageCol = new TableColumn<>("Nascimento");
        ageCol.setCellValueFactory(new PropertyValueFactory<>("dtNascimento"));
        
        TableColumn<Aluno, String> planCol = new TableColumn<>("Plano");
        planCol.setCellValueFactory(cellData -> {
            Aluno aluno = cellData.getValue();
            return new SimpleStringProperty(aluno.getPlano().getNome());
        });
        
        memberTable.getColumns().addAll(nameCol, ageCol, planCol);
        
        Button addButton = new Button("Adicionar Aluno");
        addButton.setOnAction(e -> {

            AddAlunoDialog dialog = new AddAlunoDialog();
            dialog.showAndWait().ifPresent(aluno ->{
                if (aluno != null) {
                    academia.addAluno(aluno);
                    memberTable.getItems().add(aluno);
                }
            });
        });
        
        this.getChildren().addAll(memberTable, addButton);
    }

    public TableView<Aluno> getMemberTable() {
        return this.memberTable;
    }

    public void setMemberTable(TableView<Aluno> memberTable) {
        this.memberTable = memberTable;
    }

    public Academia getAcademia() {
        return this.academia;
    }

    public void setAcademia(Academia academia) {
        this.academia = academia;
    }
    
}
