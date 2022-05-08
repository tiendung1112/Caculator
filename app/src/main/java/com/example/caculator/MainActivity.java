package com.example.caculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bt0, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9;
    Button bang, cong, tru, nhan, chia, c, ce, btdot, dau;
    TextView mainscreen, secondscreen;
    String tinhtoan;
    String pheptoan;
    boolean checkDot = false, checkBang = false;
    double so1, so2, ketqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                secondscreen.setText("");
                mainscreen.setText("");
                tinhtoan = "";
                pheptoan = "";
                checkBang = false;
                checkDot = false;
            }
        });
        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checkBang) {
                    tinhtoan = mainscreen.getText().toString();
                    mainscreen.setText(tinhtoan + "0");
                }
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checkBang) {
                    tinhtoan = mainscreen.getText().toString();
                    mainscreen.setText(tinhtoan + "1");
                }
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checkBang) {
                    tinhtoan = mainscreen.getText().toString();
                    mainscreen.setText(tinhtoan + "2");
                }
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checkBang) {
                    tinhtoan = mainscreen.getText().toString();
                    mainscreen.setText(tinhtoan + "3");
                }
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checkBang) {
                    tinhtoan = mainscreen.getText().toString();
                    mainscreen.setText(tinhtoan + "4");
                }
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checkBang) {
                    tinhtoan = mainscreen.getText().toString();
                    mainscreen.setText(tinhtoan + "5");
                }
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checkBang) {
                    tinhtoan = mainscreen.getText().toString();
                    mainscreen.setText(tinhtoan + "6");
                }
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checkBang) {
                    tinhtoan = mainscreen.getText().toString();
                    mainscreen.setText(tinhtoan + "7");
                }
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checkBang) {
                    tinhtoan = mainscreen.getText().toString();
                    mainscreen.setText(tinhtoan + "8");
                }
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checkBang) {
                    tinhtoan = mainscreen.getText().toString();
                    mainscreen.setText(tinhtoan + "9");
                }
            }
        });
        btdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checkBang) {
                    if (!checkDot) {
                        tinhtoan = mainscreen.getText().toString();
                        mainscreen.setText(tinhtoan + ".");
                        checkDot = true;
                    }
                }
            }
        });
        cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mainscreen.getText() == ""){
                    so1 = 0;
                    secondscreen.setText("0 + ");
                    mainscreen.setText("");
                }
                else {
                    so1 = Double.parseDouble(mainscreen.getText()+"");
                    secondscreen.setText(mainscreen.getText().toString() + " + ");
                    mainscreen.setText("");
                    tinhtoan="";
                    pheptoan="+";
                }
                checkDot = false;
                checkBang = false;
            }
        });
        tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mainscreen.getText() == ""){
                    so1 = 0;
                    secondscreen.setText("0 - ");
                }
                else {
                    so1 = Double.parseDouble(mainscreen.getText()+"");
                    secondscreen.setText(mainscreen.getText().toString() + " - ");
                    mainscreen.setText("");
                    tinhtoan="";
                    pheptoan="-";
                    checkDot = false;
                    checkBang = false;
                }
            }
        });
        nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mainscreen.getText() == ""){
                    so1 = 0;
                    secondscreen.setText("0 * ");
                }
                else {
                    so1 = Double.parseDouble(mainscreen.getText()+"");
                    secondscreen.setText(mainscreen.getText().toString() + " * ");
                    mainscreen.setText("");
                    tinhtoan="";
                    pheptoan="*";
                    checkDot = false;
                    checkBang = false;
                }
            }
        });
        chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mainscreen.getText() == ""){
                    so1 = 0;
                    secondscreen.setText("0 / ");
                }
                else {
                    so1 = Double.parseDouble(mainscreen.getText()+"");
                    secondscreen.setText(mainscreen.getText().toString() + " / ");
                    mainscreen.setText("");
                    tinhtoan="";
                    pheptoan="/";
                    checkDot = false;
                    checkBang = false;
                }
            }
        });
        dau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mainscreen.getText() == "0"){
                    mainscreen.setText("0");
                }
                else {
                    String val = mainscreen.getText().toString();
                    if (val.startsWith("-")) {
                        val = val.replace("-", "+");
                    }
                    else if (val.startsWith("+")) {
                        val  = val.replace("+", "-");
                    }
                    else {
                        val = "+".concat(val);
                    }
                    mainscreen.setText(val);
                }
            }
        });
        bang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checkBang) {
                    checkDot = false;
                    tinhtoan = mainscreen.getText().toString();
                    so2 = Double.parseDouble(mainscreen.getText() + "");
                    secondscreen.setText(secondscreen.getText().toString() + mainscreen.getText().toString() + "");
                    mainscreen.setText("");
                    if (pheptoan == "+")
                        ketqua = so1 + so2;
                    else if (pheptoan == "-")
                        ketqua = so1 - so2;
                    else if (pheptoan == "*")
                        ketqua = so1 * so2;
                    else if (pheptoan == "/")
                        ketqua = so1 / so2;
                    checkBang = true;
                    mainscreen.setText(ketqua + "");
                }
                pheptoan = "";
            }
        });
        ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkBang){
                    String val = mainscreen.getText().toString();
                    if (!val.isEmpty()) {
                        val = val.substring(0, val.length() - 1);
                        mainscreen.setText(val);
                    }
                }
            }
        });
    }

    protected  void  anhxa() {
        bt0 = findViewById(R.id.so0);
        bt1 = findViewById(R.id.so1);
        bt2 = findViewById(R.id.so2);
        bt3 = findViewById(R.id.so3);
        bt4 = findViewById(R.id.so4);
        bt5 = findViewById(R.id.so5);
        bt6 = findViewById(R.id.so6);
        bt7 = findViewById(R.id.so7);
        bt8 = findViewById(R.id.so8);
        bt9 = findViewById(R.id.so9);
        bang = findViewById(R.id.bang);
        btdot = findViewById(R.id.btdot);
        cong = findViewById(R.id.cong);
        tru = findViewById(R.id.tru);
        nhan = findViewById(R.id.nhan);
        chia = findViewById(R.id.chia);
        c = findViewById(R.id.c);
        ce = findViewById(R.id.ce);
        dau = findViewById(R.id.dau);
        mainscreen = findViewById(R.id.man_hinh);
        secondscreen = findViewById(R.id.man_hinh_phu);
    }
}