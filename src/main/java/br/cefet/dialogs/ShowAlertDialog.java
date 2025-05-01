package br.cefet.dialogs;

import javafx.scene.control.Alert;

public class ShowAlertDialog {
    /**
     * Construtor da classe ShowAlertDialog.
     * Cria um diálogo de alerta com o título e conteúdo fornecidos.
     *
     * @param title   O título do diálogo.
     * @param content O conteúdo do diálogo.
     */

    public ShowAlertDialog(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
