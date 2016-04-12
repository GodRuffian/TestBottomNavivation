package com.example.imgod.testbottomnavivation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;

public class MainActivity extends AppCompatActivity {

    private TextView txt_main;
    private BottomNavigationBar bottom_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initEvent();
    }

    private void initEvent() {
        bottom_bar.setTabSelectedListener(new BottomNavigationBar.OnTabSelectedListener() {
            @Override
            public void onTabSelected(int position) {
                switch (position) {
                    case 0:
                        txt_main.setText(getString(R.string.home));
                        break;
                    case 1:
                        txt_main.setText(getString(R.string.info));
                        break;
                    case 2:
                        txt_main.setText(getString(R.string.mine));
                        break;
                    case 3:
                        txt_main.setText(getString(R.string.cart));
                        break;
                }
            }

            @Override
            public void onTabUnselected(int position) {

            }

            @Override
            public void onTabReselected(int position) {

            }
        });
    }

    private void initView() {
        txt_main = (TextView) findViewById(R.id.txt_main);
        bottom_bar = (BottomNavigationBar) findViewById(R.id.bottom_bar);
        bottom_bar.addItem(new BottomNavigationItem(R.mipmap.tab_home_passed, getString(R.string.home)))
                .addItem(new BottomNavigationItem(R.mipmap.tab_info_passed, getString(R.string.info)))
                .addItem(new BottomNavigationItem(R.mipmap.tab_mine_passed, getString(R.string.mine)))
                .addItem(new BottomNavigationItem(R.mipmap.tab_cart_passed, getString(R.string.cart)))
                .initialise();
        txt_main.setText(getString(R.string.home));
    }
}
