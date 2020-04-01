package com.example.calculatovu;

import androidx.appcompat.app.AppCompatActivity;

import static java.lang.Math.cos;
import static java.lang.Math.log;
import static java.lang.Math.pow;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;
import static java.lang.Math.tan;
import java.util.Arrays;
import java.util.Stack;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {
    TextView view1;
    TextView textview_top;
    String line_Bot = "";
    String line_Top = "";


    Button perCent, cE, c, bS, praction, power2, sQRT, division, num7,
            num8, num9, multiply, num4, num5, num6, plus, num1, num2, num3, minus, plusMinus, dot, num0, equal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view1 = findViewById(R.id.view1);
        textview_top = findViewById(R.id.textview_top);
        cE = findViewById(R.id.cE);
        c = findViewById(R.id.c);
        bS = findViewById(R.id.bS);
        perCent = findViewById(R.id.perCent);
        praction = findViewById(R.id.praction);
        power2 = findViewById(R.id.power2);
        sQRT = findViewById(R.id.sQRT);
        division = findViewById(R.id.division);
        num7 = findViewById(R.id.num7);
        num8 = findViewById(R.id.num8);
        num9 = findViewById(R.id.num9);
        multiply = findViewById(R.id.multiply);
        num4 = findViewById(R.id.num4);
        num5 = findViewById(R.id.num5);
        num6 = findViewById(R.id.num6);
        plus = findViewById(R.id.plus);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        minus = findViewById(R.id.minus);
        plusMinus = findViewById(R.id.plusMinus);
        dot = findViewById(R.id.dot);
        num0 = findViewById(R.id.num0);
        equal = findViewById(R.id.equal);
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (line_Bot == "0") {
                    line_Bot = "1";
                } else {
                    line_Bot += "1";
                }
                view1.setText(line_Bot);

            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (line_Bot == "0") {
                    line_Bot = "2";
                } else {
                    line_Bot += "2";
                }
                view1.setText(line_Bot);

            }
        });

        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (line_Bot == "0") {
                    line_Bot = "3";
                } else {
                    line_Bot += "3";
                }
                view1.setText(line_Bot);

            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (line_Bot == "0") {
                    line_Bot = "4";
                } else {
                    line_Bot += "4";
                }
                view1.setText(line_Bot);

            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (line_Bot == "0") {
                    line_Bot = "5";
                } else {
                    line_Bot += "5";
                }
                view1.setText(line_Bot);

            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (line_Bot == "0") {
                    line_Bot = "6";
                } else {
                    line_Bot += "6";
                }
                view1.setText(line_Bot);

            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (line_Bot == "0") {
                    line_Bot = "7";
                } else {
                    line_Bot += "7";
                }
                view1.setText(line_Bot);

            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (line_Bot == "0") {
                    line_Bot = "8";
                } else {
                    line_Bot += "8";
                }
                view1.setText(line_Bot);

            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (line_Bot == "0") {
                    line_Bot = "9";
                } else {
                    line_Bot += "9";
                }
                view1.setText(line_Bot);

            }
        });
        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (line_Bot == "0") {
                    line_Bot = "0";
                } else {
                    line_Bot += "0";
                }
                view1.setText(line_Bot);

            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (line_Bot == "0") {
                    line_Bot = "0";
                } else {
                    line_Bot += "+";
                }
                view1.setText(line_Bot);

            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (line_Bot == "0") {
                    line_Bot = "0";
                } else {
                    line_Bot += "-";
                }
                view1.setText(line_Bot);

            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (line_Bot == "0") {
                    line_Bot = "0";
                } else {
                    line_Bot += "*";
                }
                view1.setText(line_Bot);

            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (line_Bot == "0") {
                    line_Bot = "0";
                } else {
                    line_Bot += "/";
                }
                view1.setText(line_Bot);

            }
        });
        bS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (line_Bot == "0") {
                    line_Bot = "0";
                } else {
                    int l = line_Bot.length();
                    if (l == 1) {
                        line_Bot = "0";
                    } else {
                        line_Bot = line_Bot.substring(0, l - 1);
                    }
                }
                view1.setText(line_Bot);
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                line_Bot = "0";
                line_Top = "";
                view1.setText(line_Bot);
                textview_top.setText(line_Top);
            }
        });
        power2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (line_Bot == "0") {
                    line_Bot = "0";
                } else {
                    line_Bot = "(" + line_Bot + ")^2";
                }
                view1.setText(line_Bot);
            }
        });
        sQRT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (line_Bot == "0") {
                    line_Bot = "0";
                } else {
                    line_Bot = "√(" + line_Bot + ")";
                }
                view1.setText(line_Bot);
            }
        });
        praction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (line_Bot == "0") {
                    line_Bot = "0";
                } else {
                    line_Bot = "1/(" + line_Bot + ")";
                }
                view1.setText(line_Bot);
            }
        });
        perCent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (line_Bot == "0") {
                    line_Bot = "0";
                } else {
                    line_Bot = "(" + line_Bot + ")%";
                }
                view1.setText(line_Bot);
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                line_Bot += ".";
                view1.setText(line_Bot);
            }
        });
        cE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (line_Bot == "0") {
                    line_Bot = "0";
                } else {
                    int l = line_Bot.length();
                    for(int i=l-1;i>-1;i--){
                        if(isOperator(line_Bot.charAt(i))){
                            break;
                        }else {
                            if (line_Bot.length() == 1) {
                                line_Bot = "0";
                                break;
                            } else if(line_Bot.length() > 1){
                                line_Bot = line_Bot.substring(0, line_Bot.length() - 1);
                            }
                        }
                    }
                }
                view1.setText(line_Bot);
            }
        });

        plusMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (line_Bot=="0"){
                    line_Bot = "0";
                }else{
                    if ((int)line_Bot.charAt(0) == 45){
                        line_Bot=line_Bot.substring(1);
                    }else{
                        line_Bot= "-("+line_Bot+")";
                    }
                }
                view1.setText(line_Bot);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                line_Top=line_Bot+"=";
                try {
                    if(line_Bot.substring(0,1).equals("√")){
                        Double sqrtTG= compute(line_Bot.substring(1));
                        line_Bot = ""+sqrt(sqrtTG);
                    }else{
                        if(line_Bot.substring(line_Bot.length()-1).equals("%")){
                            Double percentTG = compute(line_Bot.substring(0,line_Bot.length()-1))/100;
                            line_Bot=""+percentTG;
                        }else {
                            if(line_Bot.substring(0,1).equals("-")){
                                Double subTG= compute(line_Bot.substring(1));
                                line_Bot = "-"+subTG;}
                            else {
                                Double a = compute(line_Bot);
                                line_Bot = "" + a;
                            }
                        }
                    }
                }catch (Exception e){
                    line_Bot="input error";
                }

                view1.setText(line_Bot);
                textview_top.setText(line_Top);
            }
        });

    }
    public static String standardize(String math) {
        String newMath = "";
        int i;
        for (i = 0; i < math.length(); i++) {
            char c = math.charAt(i);
            if (!isOperator(c)) {
                newMath = newMath + c;
            } else {
                if (isOneOperator(c)) {
                    newMath = newMath + " " + c;
                    i += 2;
                } else {
                    newMath = newMath + " " + c + " ";
                }

            }
        }
        return newMath;
    }

    public static boolean isOperator(char c) {
        char op[] = {'+', '-', '*', '/', '^', '(', ')', 's', 'c', 't', 'l'};
        Arrays.sort(op);
        if (Arrays.binarySearch(op, c) > -1)
        {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isOneOperator(char c) {
        char op[] = {'s', 'c', 't', 'l'};
        Arrays.sort(op);
        if (Arrays.binarySearch(op, c) > -1) {
            return true;
        } else {
            return false;
        }
    }

    public static int priority(char c) {
        int priority = 0;
        if (c == '+' || c == '-') {
            priority = 4;
        }
        if (c == '*' || c == '/') {
            priority = 5;
        }
        if (c == '^' || c == 's' || c == 'c' || c == 't' || c == 'l') {
            priority = 6;
        }
        return priority;
    }

    public static String[] splitToken(String math) {
        String str = math.trim();                               //xoa dau cach o dau va cuoi dong
        str = str.replaceAll("\\s+", " ");                      //xoa ki tu " " thua
        String token[] = str.split(" ");

        return token;
    }

    public static String toPostfix(String math) {
        String postfix = "";
        String[] mathElement = splitToken(standardize(math));
        Stack<String> S = new Stack<String>();

        for (int i = 0; i < mathElement.length; i++) {
            char c = mathElement[i].charAt(0);

            if (!isOperator(c)) {
                postfix = postfix + mathElement[i] + " ";

            } else {
                if (c == '(') {
                    S.push(mathElement[i]);
                } else {
                    if (c == ')') {
                        char temp = ' ';
                        do {
                            temp = S.peek().charAt(0);
                            if (temp != '(') {
                                postfix = postfix + S.peek() + " ";

                            }
                            S.pop();

                        } while (temp != '(');

                    } else {
                        while (!S.isEmpty() && (priority(S.peek().charAt(0)) >= priority(c))) {
                            postfix = postfix + S.pop() + " ";

                        }
                        S.push(mathElement[i]);
                    }
                }

            }
        }
        while (!S.isEmpty()) {
            postfix = postfix + S.pop() + " ";
        }
        postfix = postfix.trim();
        postfix = postfix.replaceAll("\\s+", " ");

        return postfix;
    }

    public static double compute(String math) {
        String postfix = toPostfix(math);
        String[] mathElement = splitToken(postfix);
        for (int i = 0; i < mathElement.length; i++) {
        }
        Stack<Double> S = new Stack<Double>();
        double temp = 0f;
        for (int i = 0; i < mathElement.length; i++) {
            char c = mathElement[i].charAt(0);
            if (!isOperator(c)) {
                double value = Double.parseDouble(mathElement[i]);
                S.push(value);
            } else {
                if (!isOneOperator(c)) {
                    double num1 = (S.pop());
                    double num2 = (S.peek());
                    switch (c) {
                        case '+':
                            temp = num2 + num1;
                            break;
                        case '-':
                            temp = num2 - num1;
                            break;
                        case '*':
                            temp = num2 * num1;
                            break;
                        case '/':
                            temp = num2 / num1;
                            break;
                        case '^':
                            temp = pow(num2, num1);
                            break;
                        default:
                            break;

                    }
                    S.pop();
                    S.push(temp);

                } else {
                    switch (c) {
                        case 's':
                            temp = sin(S.peek());
                            break;
                        case 'c':
                            temp = cos(S.peek());
                            break;
                        case 't':
                            temp=  tan(S.peek());
                            break;
                        case 'l':
                            temp = log(S.peek());
                            break;

                        default:
                            break;

                    }

                    S.pop();
                    S.push(temp);
                }

            }
        }

        double result = S.pop();
        return result;
    }

}


