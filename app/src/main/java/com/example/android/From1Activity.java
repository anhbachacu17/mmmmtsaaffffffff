package com.example.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class From1Activity extends AppCompatActivity {
    private EditText editText;
    private Button btnHello;
    private Button btnChao;
    private Button btnClear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_from1);
        XuLyOnclick();

    }
    public void XuLyOnclick(){
    btnHello = (Button) findViewById(R.id.btn_hello);
    btnChao = (Button) findViewById(R.id.btn_chao);
    btnClear = (Button) findViewById(R.id.btn_clear);

    btnChao.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        editText = (EditText) findViewById(R.id.edit_txt);
        String name = String.valueOf(editText.getText());
        String Kq = " Chào " + name;
        Toast.makeText(getApplicationContext(),Kq,Toast.LENGTH_LONG).show();
        }
    });
    btnHello.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            editText = (EditText) findViewById(R.id.edit_txt);
            String name = String.valueOf(editText.getText());
            String kq = "Hello " + name;
            Toast.makeText(getApplicationContext(),kq,Toast.LENGTH_LONG).show();
        }
    });
    btnClear.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            editText = (EditText) findViewById(R.id.edit_txt);
            String name = String.valueOf(editText.getText());
            editText.setText("");
        }
    });
    }
}
