/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cekberatbadan;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private JFXTextField Nama;
    @FXML
    private JFXTextField TinggiBadan;
    @FXML
    private JFXTextField BeratBadan;
    @FXML
    private RadioButton laki;
    @FXML
    private ToggleGroup pilih;
    @FXML
    private RadioButton perempuan;
    @FXML
    private JFXButton proses;
    @FXML
    private JFXButton reset;
    @FXML
    private JFXTextArea hasil;
    @FXML
    private JFXTextArea saran;
    @FXML
    private TextField ideals;
    @FXML
    private JFXTextField analisa;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void buttonProses(ActionEvent event) {
        
         int a = 50;
            String nama = Nama.getText();
            int berat = Integer.parseInt(BeratBadan.getText());
            String Saran = "";
            int tinggi = Integer.parseInt(TinggiBadan.getText());
            int ideal = 0;
            String analis = null;
            String kelamin="";
                if (laki.isSelected()){
                    kelamin = "Laki - laki";
                    ideal = tinggi - 110;
                    if(ideal == berat){
                        analis = "Ideal";
                        Saran = "Saran : \n1. Ok Mantap :v";
                    }else if(ideal > berat){
                        analis = "Kurus";
                        Saran = "Saran : \n1. Makan yang banyak \n2. Minum Susu \n3. Sering Olahraga";
                    }else{
                        analis = "Gemuk";
                        Saran ="Saran : \n1. Makan Secukupnya \n2. Perbanyak Olahraga \n3. Jangan minum Susu";
                    }
                }else if(perempuan.isSelected()){
                    kelamin = "Perempuan";
                    ideal = tinggi - 100;
                    if(ideal == berat){
                        analis = "Ideal";
                        Saran = "Saran : \n1. Ok Mantap !!!";
                    }else if(ideal > berat){
                        analis = "Kurus";
                        Saran = "Saran : \n1. Makan yang banyak \n2. Minum Susu \n3. Sering Olahraga";
                    }else{
                        analis = "Gemuk";
                        Saran ="Saran : \n1. Makan Secukupnya \n2. Perbanyak Olahraga \n3. Jangan minum Susu";
                    }
                }  
                 ideals.setText(" "+ideal);
            analisa.setText(" "+analis);
            hasil.setText("Nama : "+nama+"\nBerat Badan : "+berat+"\nTinggi Badan : "+tinggi+"\nJenis Kelamin : "+kelamin);
            saran.setText("Saran : "+Saran);
    }

    @FXML
    private void buttonHapus(ActionEvent event) {
        Nama.setText("");
        BeratBadan.setText("");
        TinggiBadan.setText("");
        ideals.setText("");
        hasil.setText("");
        saran.setText("");
        laki.setSelected(false);
        perempuan.setSelected(false);
        analisa.setText("");
    }

    @FXML
    private void ideals(ActionEvent event) {
    }
    
}
