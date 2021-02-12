package android.game.activitylauncher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final static String TEXT = "PARAM";

    private Button btnCalc;
    private Button btnThisApp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initAndSetListeners();
    }

    private void initAndSetListeners() {
        btnCalc = findViewById(R.id.btnCalc);
        btnThisApp = findViewById(R.id.btnThisApp);
        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("calc://intent");
                Intent runEchoIntent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(runEchoIntent);
            }
        });
        btnThisApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("example://intent");
                Intent runEchoIntent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(runEchoIntent);
            }
        });
    }
}
