package aaa_sky.escapegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Stage1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage1);
    }

    public void toMain(View view) {
        finish();
    }
}
