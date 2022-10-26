package com.example.pr1_2;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;

public class HelloController {
    @FXML
    private Label LBL_n;
    @FXML
    private Label LBL_k;
    @FXML
    private Label LBL_r;
    @FXML
    private TextField TF_x;
    @FXML
    private TextField TF_y;
    @FXML
    private ImageView IV_f;


    @FXML
    protected void onHelloButtonClick() {
        double x,y,n,r,k;
        try{
            x = Double.parseDouble(TF_x.getText().replace(',','.'));
            y = Double.parseDouble(TF_y.getText().replace(',','.'));
            n = Math.pow(10*Math.pow(10,1/10),1/10)*Math.log(x);
            r = 1+Math.pow(Math.log(Math.pow(y,x)),5);
            LBL_n.setText("n="+n);
            LBL_r.setText("r="+r);
            if(n+r<5){
                IV_f.setImage(new Image(new File("src/main/resources/com/example/img/less.png").toURI().toString()));
                k = Math.sin(3.14*n + Math.pow(Math.E,r));
            } else {
                IV_f.setImage(new Image(new File("src/main/resources/com/example/img/more.png").toURI().toString()));
                k = Math.sin((3.14*n+r));
            }
            LBL_k.setText("k="+k);
        } catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Внимание!");
            alert.setHeaderText(null);
            alert.setContentText("Проверьте правильность заполнения полей!");
            alert.showAndWait();
        }
    }
}