package ru.isu.mobile_2015.prj_03;

import android.app.Activity;
import android.os.Bundle;

public class GameActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new GameView(this));
    }
}
