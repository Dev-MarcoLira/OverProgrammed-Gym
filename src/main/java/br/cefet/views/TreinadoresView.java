package br.cefet.views;

import br.cefet.Academia;
import br.cefet.Treinador;
import br.cefet.dialogs.AddTreinadorDialog;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

public class TreinadoresView extends VBox {
    
    private TableView<Treinador> employeeTable;
    private Academia academia;

    

    public TreinadoresView(Academia academia) {
        
        setAcademia(academia);
        this.setSpacing(10);
        this.setPadding(new Insets(10));

        employeeTable = new TableView<>();
        
        TableColumn<Treinador, String> nameCol = new TableColumn<>("Nome");
        nameCol.setCellValueFactory(new PropertyValueFactory<>("nome"));
        
        TableColumn<Treinador, String> roleCol = new TableColumn<>("Cargo");
        roleCol.setCellValueFactory(new PropertyValueFactory<>("cargo"));
        
        TableColumn<Treinador, Double> salaryCol = new TableColumn<>("Salário");
        salaryCol.setCellValueFactory(new PropertyValueFactory<>("salario"));
        
        employeeTable.getColumns().addAll(nameCol, roleCol, salaryCol);
        
        Button addButton = new Button("Adicionar Treinador");
        addButton.setOnAction(e -> {

            AddTreinadorDialog dialog = new AddTreinadorDialog();
            dialog.showAndWait().ifPresent(treinador -> {
                if (treinador != null) {
                    academia.addTreinador(treinador);
                    employeeTable.getItems().add(treinador);
                }
            });
        });
        
        getChildren().addAll(employeeTable, addButton);
    }

    public TableView<Treinador> getEmployeeTable() {
        return this.employeeTable;
    }

    public void setEmployeeTable(TableView<Treinador> employeeTable) {
        this.employeeTable = employeeTable;
    }

    public Academia getAcademia() {
        return this.academia;
    }

    public void setAcademia(Academia academia) {
        this.academia = academia;
    }

}
