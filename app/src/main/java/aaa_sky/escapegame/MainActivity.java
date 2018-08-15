package aaa_sky.escapegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toStage1(View view) {
        Intent intent = new Intent(MainActivity.this, Stage1Activity.class);
        startActivity(intent);
    }

    public void toStage2(View view) {
        Intent intent = new Intent(MainActivity.this, Stage2Activity.class);
        startActivity(intent);
    }
}
