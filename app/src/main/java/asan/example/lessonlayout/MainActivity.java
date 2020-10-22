package asan.example.lessonlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private ImageView imageView;
    private EditText editText;
    private Button btnChange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        textView = findViewById(R.id.tV);
        imageView = findViewById(R.id.imView);
        editText = findViewById(R.id.edText);
        btnChange = findViewById(R.id.btnChange);

        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = editText.getText().toString();
                textView.setText(text);
                if (editText.length() != 0 && editText.length() > 0) {
                    textView.setText("Успешно!");
                    imageView.setImageResource(R.drawable.ic_baseline_how_to_reg_24);
                }
                if (editText.length() > 5) {
                    editText.setError("Ограничение");
                    textView.setText("Вы ввели не правильные данные");
                } else if (editText.length() == 0) {
                    textView.setText("Вы ввели не правильные данные");

                    editText.setError("ошибка");
                }

            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("");
                editText.setText("");
            }
        });

    }
}