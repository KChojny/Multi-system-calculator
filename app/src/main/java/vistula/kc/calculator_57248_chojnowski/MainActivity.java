package vistula.kc.calculator_57248_chojnowski;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;


import static vistula.kc.calculator_57248_chojnowski.CalculatorTools.count;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @SuppressLint("SetTextI18n")
    public void calculate(View view){
        EditText num1 = findViewById(R.id.num1);
        EditText num2 = findViewById(R.id.num2);
        EditText result = findViewById(R.id.result);

        EditText num3 = findViewById(R.id.num3);
        EditText num4 = findViewById(R.id.num4);
        EditText result1 = findViewById(R.id.result1);

        EditText num5 = findViewById(R.id.num5);
        EditText num6 = findViewById(R.id.num6);
        EditText result2 = findViewById(R.id.result2);


        Spinner operator = findViewById(R.id.operator);
        Spinner base = findViewById(R.id.base);
        Spinner base1 = findViewById(R.id.base1);

        String str1 = num1.getText().toString();
        String str2 = num2.getText().toString();
        int numBase = Integer.parseInt(base.getSelectedItem().toString());
        int numBase1 = Integer.parseInt(base1.getSelectedItem().toString());
        String  str0 = operator.getSelectedItem().toString();

        int n1 = Integer.parseInt(str1, numBase);
        int n2 = Integer.parseInt(str2, numBase);
        int output = count(n1, n2, str0);

        result.setText(Integer.toString(output,numBase));

        int n3 = Integer.parseInt(str1,10);
        int n4 = Integer.parseInt(str2,10);

        num3.setText(Integer.toString(n3));
        num4.setText(Integer.toString(n4));
        result1.setText(Integer.toString(output,10));

        int n5 = Integer.parseInt(str1,numBase1);
        int n6 = Integer.parseInt(str2,numBase1);

        num5.setText(Integer.toString(n5));
        num6.setText(Integer.toString(n6));
        result2.setText(Integer.toString(output,numBase1));
    }
}