package mcm.edu.ph.burgos_operators;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display;
        display = findViewById(R.id.context);


        //Arithmetic Operators
        //Assignment Operators
        //Logical Operators
        //Comparison Operators


        //Addition
        //Subtraction
        //Multiplication
        //Division
        //Modulo (Division Operation Remainder)

        double x = 0;
        double y = 0;
        double z = 0;


        x = 500;
        y = 250;

        display.setText(
                "The value of :" +
                        String.valueOf(x) +
                        "and" +
                        String.valueOf(y) +
                        "is" +
                        String.valueOf(x - y));
        //Concentration

        display = findViewById(R.id.context2);

        x = 500;
        y = 250;

        //increment and decrement operators
        display.setText(String.valueOf(++x - y));

        display = findViewById(R.id.context3);

        x = 500;
        y = 250;
        z = 390;


        if (x > z || y < z) {
            display.setText(String.valueOf("true"));
        } else {
            display.setText(String.valueOf("false"));




                display = findViewById(R.id.textView2);

                int birthYear = 2002;
                int birthMonth = 12;
                int birthDay = 6;

                int currentYear = 2021;
                int currentMonth = 4;
                int currentDay = 16;

                int ageInYears, ageInMonths, ageInDays;

                if (birthMonth > currentMonth) {
                    currentMonth += 12;
                    currentYear -= 1;
                }

                if (birthDay > currentDay) {
                    currentDay += 30;
                    currentMonth -= 1;

                }

                ageInYears = currentYear - birthYear;
                ageInMonths = currentMonth - birthMonth;
                ageInDays = currentDay - birthDay;

                display.setText("The Time that I've been on this Earth is" + String.valueOf(ageInYears)+"Years, \b" + String.valueOf(ageInMonths) + "Months and\b" + String.valueOf(ageInDays) + "Days");
            }
        }
    }
















