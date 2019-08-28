/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filme;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author Theo
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private CheckBox cbA;
    @FXML
    private CheckBox cbT;
    @FXML
    private CheckBox cbR;
    @FXML
    private CheckBox cbC;
    @FXML
    private RadioButton rbJ;
    @FXML
    private RadioButton rbT;
    @FXML
    private RadioButton rbO;
    @FXML
    private TextArea taOpiniao;
    @FXML
    private Label lRespostas;
    @FXML
    private ToggleGroup filme;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void pegarInfo(ActionEvent event) {
        String info = "";
        
        if(cbA.isSelected()){
            info+=cbA.getText();
        }
        if(cbT.isSelected()){
            info+="\n"+cbT.getText();
        }
        if(cbR.isSelected()){
            info+="\n"+cbR.getText();
        }
        if(cbC.isSelected()){
            info+="\n"+cbC.getText();
        }
        
        if(rbJ.isSelected()){
            info+="\n"+rbJ.getText();
        }
        if(rbT.isSelected()){
            info+="\n"+rbT.getText();
        }
        if(rbO.isSelected()){
            info+="\n"+rbO.getText();
        }
        
        info+="\n"+taOpiniao.getText();
        
       
        lRespostas.setText(info);

    }
    
}
