package aaa_sky.escapegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Stage2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage2);
    }

    public void toMain(View view) {
        super.finish();
    }
}
