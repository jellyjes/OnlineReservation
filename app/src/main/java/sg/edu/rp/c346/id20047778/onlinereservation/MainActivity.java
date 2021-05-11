package sg.edu.rp.c346.id20047778.onlinereservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button btnReset, btnSubmit;
    EditText custName, noPax, phoneNo;
    TextView tvDate, tvTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.DatePicker);
        tp = findViewById(R.id.TimePicker);
        btnReset = findViewById(R.id.buttonReset);
        btnSubmit = findViewById(R.id.buttonSubmit);
        custName = findViewById(R.id.customerName);
        noPax = findViewById(R.id.noOfPax);
        phoneNo = findViewById(R.id.phoneNum);
        tvDate = findViewById(R.id.textViewdate);
        tvTime = findViewById(R.id.textViewTime);

        String date = dp.getDayOfMonth();
            tvDate.setText(date);


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}