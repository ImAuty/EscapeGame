package aaa_sky.escapegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public static final String CLEAR_STATE = "clear_state";
    private static final int REQUEST_CODE = 0;
    private boolean isClearStage1 = false;
    private boolean isClearStage2 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showState();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK && intent != null) {
            isClearStage1 = intent.getBooleanExtra(Stage1Activity.CLEAR_STATE, isClearStage1);
        }
        showState();
    }

    public void showState() {
        if (isClearStage1) {
            ImageView imageView = findViewById(R.id.clearStateStage1);
            imageView.setVisibility(View.VISIBLE);
        }
        if (isClearStage2) {
            ImageView imageView = findViewById(R.id.clearStateStage2);
            imageView.setVisibility(View.VISIBLE);
        }
    }

    public void toStage1(View view) {
        Intent intent = new Intent(MainActivity.this, Stage1Activity.class);
        intent.putExtra(CLEAR_STATE, isClearStage1);
        super.startActivityForResult(intent, REQUEST_CODE);
    }

    public void toStage2(View view) {
        Intent intent = new Intent(MainActivity.this, Stage2Activity.class);
        intent.putExtra(CLEAR_STATE, isClearStage2);
        super.startActivityForResult(intent, REQUEST_CODE);
    }
}
