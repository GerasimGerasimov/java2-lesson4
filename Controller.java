/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

/**
 *
 * @author Gerasimov V. Gerasim
 */
public class Controller implements Initializable {
    

    @FXML
    public TextField userMsg;
    public TextArea chatField;
    
    @FXML
    private void handleSendButtonAction(ActionEvent event) {
        String s = userMsg.getText();
        if (!s.isEmpty()) {
            chatField.appendText(s+"\n\n");//добавляю строку в чат
        }
        System.out.println("Sent a message:"+s);
       userMsg.clear();//стираю сообщение пользователя из поля ввода
       userMsg.requestFocus();//перемеща фокус на строку ввода сообщения
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    
}