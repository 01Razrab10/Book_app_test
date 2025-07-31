package org.example.book_app_test;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class Controller {
    Algorithm ex;

    {
        try {
            ex = new Algorithm();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @FXML
    private TextArea listArea;


    @FXML
    private Label quoteLabel;


    @FXML
    protected void getList() {
        if (!listArea.getText().isEmpty()) {
            listArea.replaceText(0, listArea.getLength(), " ");
        }
        for (int i = 1; i < 5; i++) {
            listArea.appendText(i + "." + ex.getRandomTitle() + "\n");

            for (int j = 0; j < ex.newList.size(); j++) {
                if (ex.newList.get(j).equals(ex.getRandomTitle())) {
                    ex.newList.remove(j);
                }
            }
        }
    }
}