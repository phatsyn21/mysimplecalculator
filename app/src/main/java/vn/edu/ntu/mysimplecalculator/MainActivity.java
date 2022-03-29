package vn.edu.ntu.mysimplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
// khai bao cac doi tuong se lam viec
    EditText editSoA, editSoB;
    TextView textViewKetQua;
    Button nutCong, nutTru, nutNhan, nutChia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            editSoA= (EditText)findViewById(R.id.edSoA);
            editSoB= (EditText)findViewById(R.id.edSoB);
            textViewKetQua= (TextView)findViewById(R.id.tvKetQua);
        TimWidget();
    }
    void TimWidget(){
        nutCong= (Button) findViewById(R.id.btnCong);
        nutTru= (Button) findViewById(R.id.btnTru);
        nutNhan= (Button) findViewById(R.id.btnNhan);
        nutChia= (Button) findViewById(R.id.btnChia);

    }
    // ham xu ly
    public void XuLyCong(View v){
        //Lay du lieu
        String sA= editSoA.getText().toString();
        String sB= editSoB.getText().toString();
        //chuyen sang kieu so
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        int tong= a+b;
        //chuyen tong thanh chuoi
        String chuoiTong = String.valueOf(tong);

        // xuat KQ
        textViewKetQua.setText("Tong la: " +  chuoiTong);
        

    }
    public void XuLyTru(View v){
        String sA= editSoA.getText().toString();
        String sB= editSoB.getText().toString();
        //chuyen sang kieu so
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        int hieu= a-b;
        //chuyen tong thanh chuoi
        String chuoiHieu = String.valueOf(hieu);

        // xuat KQ
        textViewKetQua.setText("Hieu la: " +  chuoiHieu);

    }
    public void XuLyNhan(View v){
        String sA= editSoA.getText().toString();
        String sB= editSoB.getText().toString();
        //chuyen sang kieu so
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        int nhan= a*b;
        //chuyen tong thanh chuoi
        String chuoinhan = String.valueOf(nhan);

        // xuat KQ
        textViewKetQua.setText("Nhan la: " + chuoinhan);

    }
    public void XuLyChia(View v){
        String sA= editSoA.getText().toString();
        String sB= editSoB.getText().toString();
        //chuyen sang kieu so
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        int thuong= a/b;
        //chuyen tong thanh chuoi
        String chuoiThuong = String.valueOf(thuong);

        // xuat KQ
        textViewKetQua.setText("Thuong la: " +  chuoiThuong);

    }

}