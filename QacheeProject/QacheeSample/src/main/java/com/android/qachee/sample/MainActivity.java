package com.android.qachee.sample;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.android.qachee.sample.fragment.CharacterListFragment;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, CharacterListFragment.newInstance())
                    .commit();
        }
    }


}
