package aaa_sky.escapegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Stage1Activity extends AppCompatActivity {

    public static final String CLEAR_STATE = "clear_state_stage1";
    private int openCount = 0;
    private boolean isClear = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage1);
        Intent intent = super.getIntent();
        isClear = intent.getBooleanExtra(MainActivity.CLEAR_STATE, false);
    }

    public void openDoor(View view) {
        ImageView imageView = findViewById(R.id.doorImage);
        switch (openCount) {
            default:
                imageView.setImageResource(R.drawable.door1);
                openCount = 0;
                break;
            case 0:
                imageView.setImageResource(R.drawable.door2);
                openCount++;
                break;
            case 1:
                imageView.setImageResource(R.drawable.door3);
                openCount++;
                break;
            case 2:
                imageView.setImageResource(R.drawable.door4);
                isClear = true;
                showMessage();
                break;
        }
    }

    public void showMessage() {
        Toast toast = Toast.makeText(this, "Stage1 Clear", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    public void toMain(View view) {
        Intent intent = new Intent();
        intent.putExtra(CLEAR_STATE, isClear);
        super.setResult(RESULT_OK, intent);
        super.finish();
    }
}
