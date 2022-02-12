package com.example.bai10_appdangonngu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnSubmit;
    EditText editTextHoTen, editTextEmail, editTextSoDT;
    TextView textViewThongBao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String HoTen = editTextHoTen.getText().toString().trim();
                String Email = editTextEmail.getText().toString().trim();
                String SoDT = editTextSoDT.getText().toString().trim();

                String xinChao = getResources().getString(R.string.text_HoTen);
                String email = getResources().getString(R.string.text_Email);
                String sodt  = getResources().getString(R.string.text_DT);
                if(HoTen.equals("")|| Email.equals("") || SoDT.equals("")){
                    textViewThongBao.setText("Vui lòng điền đủ thông tin !!!");
                }else{
                    textViewThongBao.setText(xinChao+" "+HoTen+"\n"+email+" "+Email+"\n"+sodt+" "+SoDT);
                }
            }
        });
    }

    private void AnhXa() {
        btnSubmit = (Button) findViewById(R.id.buttonSubmit);
        editTextHoTen = (EditText) findViewById(R.id.editTextHoten);
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextSoDT = (EditText) findViewById(R.id.editTextDT);
        textViewThongBao = (TextView) findViewById(R.id.textViewThongBao);
    }
}