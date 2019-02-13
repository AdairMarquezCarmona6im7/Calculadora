package adair_marquez.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button number9;
    private Button number8;
    private Button number7;
    private Button number6;
    private Button number5;
    private Button number4;
    private Button number3;
    private Button number2;
    private Button number1;
    private Button number0;

    private Button change;
    private Button del;
    private Button dot;
    private Button equal;

    private Button plus;
    private Button minus;
    private Button times;
    private Button division;
    private Button to;
    private Button sqrt;

    private float first_number  = 0;
    private String operation = "";
    private float second_number= 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number9 = (Button) findViewById(R.id.button9);
        number8 = (Button) findViewById(R.id.button8);
        number7 = (Button) findViewById(R.id.button7);
        number6 = (Button) findViewById(R.id.button6);
        number5 = (Button) findViewById(R.id.button5);
        number4 = (Button) findViewById(R.id.button4);
        number3 = (Button) findViewById(R.id.button3);
        number2 = (Button) findViewById(R.id.button2);
        number1 = (Button) findViewById(R.id.button1);
        number0 = (Button) findViewById(R.id.Button0);

        change = (Button) findViewById(R.id.change);
        del = (Button) findViewById(R.id.delete);
        dot = (Button) findViewById(R.id.dot);
        equal = (Button) findViewById(R.id.equal);

        division = (Button) findViewById(R.id.division);
        plus = (Button) findViewById(R.id.addition);
        minus = (Button) findViewById(R.id.substraction);
        times = (Button) findViewById(R.id.multiply);
        to = (Button) findViewById(R.id.potencia);
        sqrt = (Button) findViewById(R.id.raiz);

        number9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClicked("9");
            }
        });
        number8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClicked("8");
            }
        });
        number7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClicked("7");
            }
        });
        number6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClicked("6");
            }
        });
        number5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClicked("5");
            }
        });
        number4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClicked("4");
            }
        });
        number3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClicked("3");
            }
        });
        number2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClicked("2");
            }
        });
        number1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClicked("1");
            }
        });
        number0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClicked("0");
            }
        });

        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClicked("change");
            }
        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClicked("del");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClicked("dot");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClicked("equal");
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClicked("division");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClicked("addition");
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClicked("substract");
            }
        });
        times.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClicked("multiplication");
            }
        });
        to.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClicked("potencia");
            }
        });
        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClicked("sqrt");
            }
        });

    }
    public  void onClicked (String pressed){
        String action = pressed;
        TextView forNumber = (TextView) findViewById(R.id.textView3);

        if(operation.equals("over")){
            if(action.equals("0")||action.equals("1")||action.equals("2")||action.equals("3")||action.equals("4")||action.equals("5")||action.equals("6")||action.equals("7")||action.equals("8")||action.equals("9")){
                forNumber.setText(action);
                operation = "";
                second_number = 0;
                return;
            }
            if(action.equals("del")){
                forNumber.setText("0");
                operation ="";
                second_number= 0;
                return;
            }
        }

        if(action.equals("sqrt")){
            float tempnumber = Float.parseFloat(forNumber.getText().toString());
            tempnumber = (float)Math.sqrt(tempnumber);
            forNumber.setText("" + tempnumber);
            second_number = tempnumber;
            operation = "over";
            return;
        }

        if(action.equals("del")){

            String chain = forNumber.getText().toString();
            if(!chain.equals("0")){
                String resultchain = "";
                for(int i = 0; i < chain.length()-1; i++){
                    resultchain += chain.charAt(i);
                }
                if(chain.length()-1 == 0){
                    resultchain = "0";
                }
                forNumber.setText(resultchain);
                return;
            }

        }

        if(action.equals("0")){
            String chain = forNumber.getText().toString();
            if(!chain.equals("0")){
                chain = chain + "0";
            }
            forNumber.setText(chain);
            return;
        }

        if(action.equals("1")||action.equals("2")||action.equals("3")||action.equals("4")||action.equals("5")||action.equals("6")||action.equals("7")||action.equals("8")||action.equals("9")){
            String chain = forNumber.getText().toString();
            if(!chain.equals("0")){
                chain = chain + action;
            }else{
                chain = action;
            }
            forNumber.setText(chain);
            return;
        }

        if(action.equals("dot")){
            String chain = forNumber.getText().toString();
            if(!chain.contains(".")){
                chain = chain + ".";
                forNumber.setText(chain);
            }
            return;
        }

        if(action.equals("change")){
            String chain = forNumber.getText().toString();
            if(!chain.equals("0")){
                if(chain.contains("-")){
                    String resultchain ="";
                    for(int i= 1; i<chain.length(); i++){
                        resultchain += chain.charAt(i);
                    }
                    forNumber.setText(resultchain);
                }else {
                    String resultchain = "-";
                    for (int i = 0; i < chain.length(); i++) {
                        resultchain += chain.charAt(i);
                    }
                    forNumber.setText(resultchain);
                }
            }
            return;
        }

        if(second_number == 0){
            if(!action.equals("equal")){
                if(action.equals("division")){
                    operation = "/";
                    second_number = Float.parseFloat(forNumber.getText().toString());
                    forNumber.setText("0");
                }
                if(action.equals("multiplication")){
                    operation ="*";
                    second_number = Float.parseFloat(forNumber.getText().toString());
                    forNumber.setText("0");
                }
                if(action.equals("addition")){
                    operation ="+";
                    second_number = Float.parseFloat(forNumber.getText().toString());
                    forNumber.setText("0");
                }
                if(action.equals("substract")){
                    operation="-";
                    second_number = Float.parseFloat(forNumber.getText().toString());
                    forNumber.setText("0");
                }
                if(action.equals("potencia")){
                    operation = "p";
                    second_number = Float.parseFloat(forNumber.getText().toString());
                    forNumber.setText("0");
                }
            }
        }else {
            if(action.equals("equal")){
                float result = second_number;
                if(operation.equals("/")){
                    result = result / Float.parseFloat(forNumber.getText().toString());
                }
                if(operation.equals("*")){
                    result = result * Float.parseFloat(forNumber.getText().toString());
                }
                if(operation.equals("+")){
                    result = result + Float.parseFloat(forNumber.getText().toString());
                }
                if(operation.equals("-")){
                    result = result- Float.parseFloat(forNumber.getText().toString());
                }
                if(operation.equals("p")){
                    result = (float)Math.pow(result, Float.parseFloat(forNumber.getText().toString()));
                }
                if(operation.equals("over")){
                    return;
                }

                operation = "over";
                second_number = result;
                if(Math.ceil(result) == result){
                    forNumber.setText("" + Math.ceil(result));
                }else{
                    forNumber.setText("" + result);
                }
            }else{
                if(action.equals("division")){
                    if(operation.equals("/")){
                        second_number = second_number / Float.parseFloat(forNumber.getText().toString());
                    }
                    if(operation.equals("*")){
                        second_number = second_number * Float.parseFloat(forNumber.getText().toString());
                    }
                    if(operation.equals("+")){
                        second_number = second_number + Float.parseFloat(forNumber.getText().toString());
                    }
                    if(operation.equals("-")){
                        second_number = second_number- Float.parseFloat(forNumber.getText().toString());
                    }
                    if(operation.equals("p")){
                        second_number = (float)Math.pow(second_number, Float.parseFloat(forNumber.getText().toString()));
                    }
                    operation = "/";
                    forNumber.setText("0");
                }
                if(action.equals("multiplication")){
                    if(operation.equals("/")){
                        second_number = second_number / Float.parseFloat(forNumber.getText().toString());
                    }
                    if(operation.equals("*")){
                        second_number = second_number * Float.parseFloat(forNumber.getText().toString());
                    }
                    if(operation.equals("+")){
                        second_number = second_number + Float.parseFloat(forNumber.getText().toString());
                    }
                    if(operation.equals("-")){
                        second_number = second_number- Float.parseFloat(forNumber.getText().toString());
                    }
                    if(operation.equals("p")){
                        second_number = (float)Math.pow(second_number, Float.parseFloat(forNumber.getText().toString()));
                    }
                    operation ="*";
                    forNumber.setText("0");
                }
                if(action.equals("addition")){
                    if(operation.equals("/")){
                        second_number = second_number / Float.parseFloat(forNumber.getText().toString());
                    }
                    if(operation.equals("*")){
                        second_number = second_number * Float.parseFloat(forNumber.getText().toString());
                    }
                    if(operation.equals("+")){
                        second_number = second_number + Float.parseFloat(forNumber.getText().toString());
                    }
                    if(operation.equals("-")){
                        second_number = second_number- Float.parseFloat(forNumber.getText().toString());
                    }
                    if(operation.equals("p")){
                        second_number = (float)Math.pow(second_number, Float.parseFloat(forNumber.getText().toString()));
                    }
                    operation ="+";
                    forNumber.setText("0");
                }
                if(action.equals("substract")){
                    if(operation.equals("/")){
                        second_number = second_number / Float.parseFloat(forNumber.getText().toString());
                    }
                    if(operation.equals("*")){
                        second_number = second_number * Float.parseFloat(forNumber.getText().toString());
                    }
                    if(operation.equals("+")){
                        second_number = second_number + Float.parseFloat(forNumber.getText().toString());
                    }
                    if(operation.equals("-")){
                        second_number = second_number- Float.parseFloat(forNumber.getText().toString());
                    }
                    if(operation.equals("p")){
                        second_number = (float)Math.pow(second_number, Float.parseFloat(forNumber.getText().toString()));
                    }
                    operation="-";
                    forNumber.setText("0");
                }
                if(action.equals("potencia")){
                    if(operation.equals("/")){
                        second_number = second_number / Float.parseFloat(forNumber.getText().toString());
                    }
                    if(operation.equals("*")){
                        second_number = second_number * Float.parseFloat(forNumber.getText().toString());
                    }
                    if(operation.equals("+")){
                        second_number = second_number + Float.parseFloat(forNumber.getText().toString());
                    }
                    if(operation.equals("-")){
                        second_number = second_number- Float.parseFloat(forNumber.getText().toString());
                    }
                    if(operation.equals("p")){
                        second_number = (float)Math.pow(second_number, Float.parseFloat(forNumber.getText().toString()));
                    }
                    operation = "p";
                    forNumber.setText("0");
                }
            }
        }
    }
}
