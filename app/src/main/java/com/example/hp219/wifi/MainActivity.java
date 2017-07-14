package com.example.hp219.wifi;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends WifiBaseActivity {
    Button enableButton,disableButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    protected int getSecondsTimeout() {
        return 10;
    }

    @Override
    protected String getWifiSSID() {
        return "TravelTab";
    }

    @Override
    protected String getWifiPass() {
        return "123456789";
    }
}
