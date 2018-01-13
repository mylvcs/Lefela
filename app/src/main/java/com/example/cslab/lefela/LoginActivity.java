package com.example.cslab.lefela;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

/**
 * Created by CSLab on 2018/1/13.
 */

public class LoginActivity extends Activity {
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mButton = (Button) findViewById(R.id.register);


    }
}
