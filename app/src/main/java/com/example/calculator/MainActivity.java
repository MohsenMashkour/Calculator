package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    TextView txtResult;
    Animation zoomIn;

    String string;

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0;
    Button btnDev,btnMul,btnSub,btnAdd,btnC,btnAc,btnEq,btnPolar,btnDot,btnPrcnt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intro();
        anim();
        txtResult.setText("0.0");


    }

    private void anim() {

        zoomIn = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_in);
        txtResult.setAnimation(zoomIn);
    }

    public void btnClicked(View view){

        int id = view.getId();
        if (id== R.id.btn0) {

            String st = txtResult.getText().toString().trim();

            if(!st.equalsIgnoreCase("0.0")) {
                txtResult.startAnimation(zoomIn);
                //txtResult.setText(string + "0");
                txtResult.append("0");
            }


        }
        else if (id == R.id.btn1)
        showNumber(1);
        else if (id == R.id.btn2)
        showNumber(2);
        else if (id == R.id.btn3)
        showNumber(3);
        else if (id == R.id.btn4)
        showNumber(4);
        else if (id == R.id.btn5)
        showNumber(5);
        else if (id == R.id.btn6)
        showNumber(6);
        else if (id == R.id.btn7)
        showNumber(7);
        else if (id == R.id.btn8)
        showNumber(8);
        else if (id == R.id.btn9)
        showNumber(9);


    }

    public void showNumber(int number){

        string = txtResult.getText().toString();
        txtResult.startAnimation(zoomIn);

        if (string.equals("0.0") )
            txtResult.setText(number + "");

        //else if(string.equals("0.0")&& number == 0)
          //  txtResult.setText(string);

        else


        txtResult.setText(string + number);


    }

    private void intro() {

        txtResult = findViewById(R.id.txtResult);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btnDev = findViewById(R.id.btnDev);
        btnMul = findViewById(R.id.btnMul);
        btnSub = findViewById(R.id.btnSub);
        btnAdd = findViewById(R.id.btnAdd);
        btnC = findViewById(R.id.btnC);
        btnAc = findViewById(R.id.btnAc);
        btnEq = findViewById(R.id.btnEq);
        btnPolar = findViewById(R.id.btnPolar);
        btnDot = findViewById(R.id.btnDot);
        btnPrcnt = findViewById(R.id.btnPrcnt);

    }
}
