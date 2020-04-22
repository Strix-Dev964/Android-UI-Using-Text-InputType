package strix.app.strix_ui_usingtextinputtypes;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/*
Created by Strix - http://strixdev.co.uk
*/

public class MainActivity extends AppCompatActivity {

    private EditText password;
    private Button btnSubmit;
    Context context;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        CreateButtonListener();

    }

    public void CreateButtonListener() {

        password = findViewById(R.id.EdittxtPassword);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(context, "Password: "+password.getText(),
                        Toast.LENGTH_SHORT).show();

            }

        });

    }
}