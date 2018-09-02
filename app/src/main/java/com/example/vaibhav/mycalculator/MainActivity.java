package com.example.vaibhav.mycalculator;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Context context;
    Button zero,one,two,three,four,five,six,seven,eight,nine,decimal,equals,plus,minus,multiply,divide,clear_All;
    TextView result;
    float int1,int2,ans;
    int count;
    boolean flag,dec;
    char operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.context = this;

        //initialize all buttons and the result area

        zero= (Button)findViewById(R.id.zero);
        one= (Button)findViewById(R.id.one);
        two= (Button)findViewById(R.id.two);
        three= (Button)findViewById(R.id.three);
        four= (Button)findViewById(R.id.four);
        five= (Button)findViewById(R.id.five);
        six= (Button)findViewById(R.id.six);
        seven= (Button)findViewById(R.id.seven);
        eight= (Button)findViewById(R.id.eight);
        nine= (Button)findViewById(R.id.nine);
        decimal= (Button)findViewById(R.id.decimal);
        equals= (Button)findViewById(R.id.equals);
        plus= (Button)findViewById(R.id.plus);
        minus= (Button)findViewById(R.id.minus);
        multiply= (Button)findViewById(R.id.multiply);
        divide= (Button)findViewById(R.id.divide);
        result= (TextView)findViewById(R.id.result);
        clear_All = (Button)findViewById(R.id.clearAll);
        int1=0;
        int2=0;
        ans=0;
        count=1;
        flag=true;
        dec=false;
        operator='n';
        //add onClick listeners

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.append("" +0);
                if(flag){
                    if(!dec)int1=int1*10+0;
                    else {
                        double k = Math.pow(10, count);
                        int1 += 0 / k;
                        count++;
                    }
                }
                else {
                    if(!dec)int2=int2*10+0;
                    else {
                        double k=Math.pow(10,count);
                        int2+=0/k;
                        count++;
                    }
                }
                //result.setText("" + int1);
            }

        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag){
                    if(!dec)int1=int1*10+1;
                    else {
                        double k = Math.pow(10, count);
                        int1 += 1 / k;
                        count++;
                    }
                }
                else {
                    if(!dec)int2=int2*10+1;
                    else {
                        double k=Math.pow(10,count);
                        int2+=1/k;
                        count++;
                    }
                }
                result.append("" +1);
                //result.setText("" + int1);
            }

        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag){
                    if(!dec)int1=int1*10+2;
                    else {
                        double k = Math.pow(10, count);
                        int1 += 2 / k;
                        count++;
                }
            }

                else {
                    if(!dec)int2=int2*10+02;
                    else {
                        double k=Math.pow(10,count);
                        int2+=02/k;
                        count++;
                    }
                }
                result.append("" +2);
                //result.setText("" + int1);
            }

        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.append("" +3);
                if(flag){
                    if(!dec)int1=int1*10+3;
                    else {
                        double k = Math.pow(10, count);
                        int1 += 3 / k;
                        count++;
                    }
                }

                else {
                    if(!dec)int2=int2*10+03;
                    else {
                        double k=Math.pow(10,count);
                        int2+=03/k;
                        count++;
                    }
                }
                //result.setText("" + int1);
            }

        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag){
                    if(!dec)int1=int1*10+4;
                    else {
                        double k = Math.pow(10, count);
                        int1 += 4 / k;
                        count++;
                    }
                }

                else {
                    if(!dec)int2=int2*10+04;
                    else {
                        double k=Math.pow(10,count);
                        int2+=04/k;
                        count++;
                    }
                }
                result.append("" +4);
            }

        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.append("" +5);
                if(flag){
                    if(!dec)int1=int1*10+5;
                    else {
                        double k = Math.pow(10, count);
                        int1 += 5 / k;
                        count++;
                    }
                }

                else {
                    if(!dec)int2=int2*10+05;
                    else {
                        double k=Math.pow(10,count);
                        int2+=05/k;
                        count++;
                    }
                }
            }

        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag){
                    if(!dec)int1=int1*10+6;
                    else {
                        double k = Math.pow(10, count);
                        int1 += 6 / k;
                        count++;
                    }
                }

                else {
                    if(!dec)int2=int2*10+6;
                    else {
                        double k=Math.pow(10,count);
                        int2+=6/k;
                        count++;
                    }
                }
                result.append("" +6);
            }

        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag){
                    if(!dec)int1=int1*10+7;
                    else {
                        double k = Math.pow(10, count);
                        int1 += 7 / k;
                        count++;
                    }
                }

                else {
                    if(!dec)int2=int2*10+7;
                    else {
                        double k=Math.pow(10,count);
                        int2+=7/k;
                        count++;
                    }
                }
                result.append("" +7);
            }

        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag){
                    if(!dec)int1=int1*10+8;
                    else {
                        double k = Math.pow(10, count);
                        int1 += 8 / k;
                        count++;
                    }
                }

                else {
                    if(!dec)int2=int2*10+8;
                    else {
                        double k=Math.pow(10,count);
                        int2+=8/k;
                        count++;
                    }
                }
                result.append("" +8);
            }

        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag){
                    if(!dec)int1=int1*10+9;
                    else {
                        double k = Math.pow(10, count);
                        int1 += 9 / k;
                        count++;
                    }
                }

                else {
                    if(!dec)int2=int2*10+9;
                    else {
                        double k=Math.pow(10,count);
                        int2+=9/k;
                        count++;
                    }
                }
                result.append("" +9);
            }

        });
        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.append(".");
                dec=true;
            }

        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.append("+");
                flag=false;
                dec=false;
                count=1;
                operator='+';
            }

        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.append("-");
                dec=false;
                flag=false;
                count=1;
                operator='-';
            }

        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.append("x");
                dec=false;
                flag=false;
                count=1;
                operator='*';
            }

        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.append("/");
                dec=false;
                flag=false;
                count=1;
                operator='/';
            }

        });
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operator=='+')
                    int1=int1+int2;
                else if(operator=='-')
                    int1=int1-int2;
                else if(operator=='*')
                    int1=int1*int2;
                else if(operator=='/')
                    int1=int1/int2;
                result.setText("answer = "+int1);

                int2=0;
                count=1;
                dec=false;
                //flag=true;
            }

        });
        clear_All.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("");
                int1=0;
                int2=0;
                count=1;
                dec=false;
                flag=true;
            }
        });

    }
}
