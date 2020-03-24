package com.example.Calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.test.R;

public class MainActivity extends AppCompatActivity {

    private void toast(String str) {
        Toast.makeText(this, str, Toast.LENGTH_LONG).show();
    }

    // Метод, записывающий значения с циферблата в буффер
    private void saveValue() {
        Calculator.buffer = editT.getText().toString();
    }

    // Метод, очищающий циферблат
    private void clear() {
        editT.setText("");
    }

    // Метод, записывающий последний введённый оператор в буффер
    private void saveOperation(String value) {
        Calculator.bufferOperation = value;
    }

    // Метод, удаляющий последний символ в циферблате
    private void deleteValue() {
        StringBuffer str = new StringBuffer(editT.getText().toString());
        str.delete(str.length() - 1, str.length());

        editT.setText(str.toString());
    }


    private EditText editT;

    private Button plus;
    private Button minus;
    private Button mult;
    private Button div;
    private Button procent;
    private Button equally;

    private Button clear;
    private Button delete;

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Инициализация переменной циферблата
        editT = findViewById(R.id.editT);

        // Инициализация операторов
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        mult = findViewById(R.id.mult);
        div = findViewById(R.id.div);
        procent = findViewById(R.id.procent);
        equally = findViewById(R.id.equally);

        // Инициализация кнопок очистки и удаления
        clear = findViewById(R.id.clear);
        delete = findViewById(R.id.delete);

        // Инициализация кнопок 1-0
        btn1 = findViewById(R.id.one);
        btn2 = findViewById(R.id.two);
        btn3 = findViewById(R.id.three);
        btn4 = findViewById(R.id.four);
        btn5 = findViewById(R.id.five);
        btn6 = findViewById(R.id.six);
        btn7 = findViewById(R.id.seven);
        btn8 = findViewById(R.id.eight);
        btn9 = findViewById(R.id.nine);
        btn0 = findViewById(R.id.zero);

            // ==- Обработчики кнопок -==

        // Обработчики событий кнопок 1-0
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editT.setText(editT.getText() + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editT.setText(editT.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editT.setText(editT.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editT.setText(editT.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editT.setText(editT.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editT.setText(editT.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editT.setText(editT.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editT.setText(editT.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editT.setText(editT.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editT.setText(editT.getText() + "9");
            }
        });


        // Обработчики операторов
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveValue();
                clear();
                saveOperation("+");
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveValue();
                clear();
                saveOperation("-");
            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveValue();
                clear();
                saveOperation("*");
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveValue();
                clear();
                saveOperation("/");
            }
        });

        procent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveValue();
                clear();
                saveOperation("%");
            }
        });

        equally.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (Calculator.bufferOperation) {
                    case "+":
                        editT.setText(String.valueOf(Calculator.sum(Integer.parseInt(Calculator.buffer), Integer.parseInt(editT.getText().toString()))));
                        Calculator.buffer = "";
                        Calculator.bufferOperation = "";
                        break;

                    case "-":
                        editT.setText(String.valueOf(Calculator.sub(Integer.parseInt(Calculator.buffer), Integer.parseInt(editT.getText().toString()))));
                        Calculator.buffer = "";
                        Calculator.bufferOperation = "";
                        break;

                    case "*":
                        editT.setText(String.valueOf(Calculator.mult(Integer.parseInt(Calculator.buffer), Integer.parseInt(editT.getText().toString()))));
                        Calculator.buffer = "";
                        Calculator.bufferOperation = "";
                        break;

                    case "/":
                        editT.setText(String.valueOf(Calculator.div(Integer.parseInt(Calculator.buffer), Integer.parseInt(editT.getText().toString()))));
                        Calculator.buffer = "";
                        Calculator.bufferOperation = "";
                        break;

                    case "%":
                        editT.setText(String.valueOf(Calculator.procent(Integer.parseInt(Calculator.buffer), Integer.parseInt(editT.getText().toString()))));
                        Calculator.buffer = "";
                        Calculator.bufferOperation = "";
                        break;
                }
            }
        });


        // Кнопки очитски и удаления
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!editT.getText().toString().isEmpty()) deleteValue();
            }
        });
    }


}
