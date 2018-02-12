package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private loginModel loginmodel = new loginModel();
    @FXML
    private Label dbStatus;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Button btnLogin;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        if (this.loginmodel.isDatabaseConnection()) {
            this.dbStatus.setText("Connected to DB");
        } else {
            this.dbStatus.setText("Not Connected to DB");
        }


    }//initialize
//    @FXML
//    public void Login(ActionEvent event)  {
//        try {
//            if(this.loginmodel.isLogin(this.username.getText(),this.password.getText())) {
//                Stage stage = this.btnLogin.getLocationOnScreen().getWindow();
//                stage.close();
//
//                admin
//            }else {
//                JOptionPane.showMessageDialog(null,"Your rsername or"+"password is not corrext");
//            }
//        }catch (Exception localExceptin){
//            localExceptin.printStackTrace();
        }
