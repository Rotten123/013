package com.thishkt.a013;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private int[] imgId = {R.drawable.a01, R.drawable.a02, R.drawable.a03,
            R.drawable.a04, R.drawable.a05, R.drawable.a06,
            R.drawable.a07, R.drawable.a08, R.drawable.a09, R.drawable.a010};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText number = (EditText)findViewById(R.id.num);
                ImageView img = (ImageView)findViewById(R.id.imageView);
                int num = Integer.parseInt(number.getText().toString());

                if (num == 1){
                    img.setImageResource(imgId[0]);
                }
                else if (num == 2){
                    img.setImageResource(imgId[1]);
                }
                else if (num == 3){
                    img.setImageResource(imgId[2]);
                }
                else if (num == 4){
                    img.setImageResource(imgId[3]);
                }
                else if (num == 5){
                    img.setImageResource(imgId[4]);
                }
                else if (num == 6){
                    img.setImageResource(imgId[5]);
                }
                else if (num == 7){
                    img.setImageResource(imgId[6]);
                }
                else if (num == 8){
                    img.setImageResource(imgId[7]);
                }
                else if (num == 9){
                    img.setImageResource(imgId[8]);
                }
                else if (num == 10){
                    img.setImageResource(imgId[9]);
                }
            }
        });
    }
}