package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Integer> listaNumeros = new ArrayList<>();
    List<Character> listaOperaciones = new ArrayList<>();
    TextView pantalla;
    Button btnUnidades;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pantalla = this.findViewById(R.id.pantalla);
    }

    public void btn_0_click(View v) {
        if(pantalla.getText() != "0")
            pantalla.setText(pantalla.getText() + "0");
    }

    public void btn_1_click(View v) {
        if(pantalla.getText() == "0")
            pantalla.setText("1");
        else
            pantalla.setText(pantalla.getText() + "1");
    }

    public void btn_2_click(View v) {
        if(pantalla.getText() == "0")
            pantalla.setText("2");
        else
            pantalla.setText(pantalla.getText() + "2");
    }

    public void btn_3_click(View v) {
        if(pantalla.getText() == "0")
            pantalla.setText("3");
        else
            pantalla.setText(pantalla.getText() + "3");
    }

    public void btn_4_click(View v) {
        if(pantalla.getText() == "0")
            pantalla.setText("4");
        else
            pantalla.setText(pantalla.getText() + "4");
    }

    public void btn_5_click(View v) {
        if(pantalla.getText() == "0")
            pantalla.setText("5");
        else
            pantalla.setText(pantalla.getText() + "5");
    }

    public void btn_6_click(View v) {
        if(pantalla.getText() == "0")
            pantalla.setText("6");
        else
            pantalla.setText(pantalla.getText() + "6");
    }

    public void btn_7_click(View v) {
        if(pantalla.getText() == "0")
            pantalla.setText("7");
        else
            pantalla.setText(pantalla.getText() + "7");
    }

    public void btn_8_click(View v) {
        if(pantalla.getText() == "0")
            pantalla.setText("8");
        else
            pantalla.setText(pantalla.getText() + "8");
    }

    public void btn_9_click(View v) {
        if(pantalla.getText() == "0")
            pantalla.setText("9");
        else
            pantalla.setText(pantalla.getText() + "9");
    }

    public void btn_clear_click(View v) {
        pantalla.setText("0");
        listaNumeros.clear();
        listaOperaciones.clear();
    }

    public void btn_mas_click(View v) {
        listaNumeros.add(Integer.parseInt((String) pantalla.getText()));
        listaOperaciones.add('+');
        pantalla.setText("0");
    }

    public void btn_menos_click(View v) {
        listaNumeros.add(Integer.parseInt((String) pantalla.getText()));
        listaOperaciones.add('-');
        pantalla.setText("0");
    }

    public void btn_por_click(View v) {
        listaNumeros.add(Integer.parseInt((String) pantalla.getText()));
        listaOperaciones.add('*');
        pantalla.setText("0");
    }

    public void btn_entre_click(View v) {
        listaNumeros.add(Integer.parseInt((String) pantalla.getText()));
        listaOperaciones.add('/');
        pantalla.setText("0");
    }

    public void btn_igual_click(View v) {
        int lastNum = Integer.parseInt((String) pantalla.getText());
        int res = listaNumeros.get(0);
        for(int i = 1; i < listaNumeros.size(); i++) {
            if(listaOperaciones.get(i-1) == '+')
                res = res + listaNumeros.get(i);
            else if(listaOperaciones.get(i-1) == '-')
                res = res - listaNumeros.get(i);
            else if(listaOperaciones.get(i-1) == '*')
                res = res * listaNumeros.get(i);
            else if(listaOperaciones.get(i-1) == '/')
                res = res / listaNumeros.get(i);
        }
        if(listaOperaciones.get(listaOperaciones.size() - 1) == '+')
            res = res + lastNum;
        else if(listaOperaciones.get(listaOperaciones.size() - 1) == '-')
            res = res - lastNum;
        else if(listaOperaciones.get(listaOperaciones.size() - 1) == '*')
            res = res * lastNum;
        else if(listaOperaciones.get(listaOperaciones.size() - 1) == '/')
            res = res / lastNum;
        String text = res + "";
        pantalla.setText(text);
        listaOperaciones.clear();
        listaNumeros.clear();
    }

    public void btn_unidades_click(View v) {
        if(btnUnidades.getText() == "DEG")
            btnUnidades.setText("RAD");
        else btnUnidades.setText("DEG");
    }

    public void btn_sin_click(View v) {
        double angle;
        if(btnUnidades.getText().equals("DEG"))
            angle = Math.toRadians(listaNumeros.get(listaNumeros.size() - 1));
        else angle = listaNumeros.get(listaNumeros.size() - 1);
        double res = Math.sin(angle);
        pantalla.setText(res + "");
        listaOperaciones.clear();
        listaNumeros.clear();
    }

    public void btn_cos_click(View v) {
        double angle;
        if(btnUnidades.getText() == "DEG")
            angle = Math.toRadians(listaNumeros.get(listaNumeros.size() - 1));
        else angle = listaNumeros.get(listaNumeros.size() - 1);
        double res = Math.cos(angle);
        pantalla.setText(res + "");
        listaOperaciones.clear();
        listaNumeros.clear();
    }

    public void btn_tan_click(View v) {
        double angle;
        if(btnUnidades.getText() == "DEG")
            angle = Math.toRadians(listaNumeros.get(listaNumeros.size() - 1));
        else angle = listaNumeros.get(listaNumeros.size() - 1);
        double res = Math.tan(angle);
        pantalla.setText(res + "");
        listaOperaciones.clear();
        listaNumeros.clear();
    }
}