package zw.ac.alc4phase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button about, profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        about = findViewById(R.id.aboutALC);
        profile = findViewById(R.id.myProfile);


        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityB();
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityC();
            }
        });
    }


    public void openActivityB(){

        Intent intent = new Intent(this, aboutALC.class);
        startActivity(intent);
    }

    public void openActivityC(){

        Intent intent = new Intent(this, myProfile.class);
        startActivity(intent);
    }
}
