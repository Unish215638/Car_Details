package com.createcar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnCreateCar, btnDiesel;
    private EditText etMake, etYear, etColor, etPrice, etSize;
    private TextView tvOutput;
    private int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etMake = findViewById(R.id.etMake);
        etYear = findViewById(R.id.etYear);
        etColor = findViewById(R.id.etColor);
        etPrice = findViewById(R.id.etPrice);
        etSize = findViewById(R.id.etSize);
        tvOutput = findViewById(R.id.tvOutput);
        btnCreateCar = findViewById(R.id.btnCreateCar);
        btnDiesel = findViewById(R.id.btnDiesel);

        btnCreateCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                String manuf = etMake.getText().toString();
                int year = Integer.parseInt(etYear.getText().toString());
                float price = Float.parseFloat(etPrice.getText().toString());
                float size = Float.parseFloat(etSize.getText().toString());
                tvOutput.append("This is vehicle no. " + i + "\n" + "Manufacturer: " + manuf +
                        "Current value: " + price + "Effective engine size: " + size + "\n");
            }
        });
    }
}
