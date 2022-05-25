package sg.edu.rp.c346.id21020978.psp04mymodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvC105, tvC203, tvC206, tvC218, tvC346;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvC105 = findViewById(R.id.firstMod);
        tvC346 = findViewById(R.id.fifthMod);
        tvC203 = findViewById(R.id.secondMod);
        tvC218 = findViewById(R.id.fourthMod);
        tvC206 = findViewById(R.id.thirdMod);
        tvC105.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = new Intent (MainActivity.this, AnswerActivity1.class);
                intent.putExtra("Module", "C105");
                startActivity(intent);

            }
        });


        tvC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent (MainActivity.this, AnswerActivity1.class);
                intent.putExtra("Module", "C206");
                startActivity(intent);

            }
        });

        tvC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent (MainActivity.this, AnswerActivity1.class);
                intent.putExtra("Module", "C203");
                startActivity(intent);

            }
        });
        tvC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent (MainActivity.this, AnswerActivity1.class);
                intent.putExtra("Module", "C218");
                startActivity(intent);

            }
        });
        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent (MainActivity.this, AnswerActivity1.class);
                intent.putExtra("Module", "C346");
                startActivity(intent);

            }
        });

    }
}