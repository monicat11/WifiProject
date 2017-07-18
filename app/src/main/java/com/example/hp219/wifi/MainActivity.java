package com.example.hp219.wifi;

import android.os.Bundle;

public class MainActivity extends WifiBaseActivity {

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
