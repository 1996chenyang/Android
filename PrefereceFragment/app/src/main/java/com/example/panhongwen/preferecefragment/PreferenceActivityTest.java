package com.example.panhongwen.preferecefragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;
import android.widget.Button;

import java.util.List;

/**
 * Created by panhongwen on 2018/5/7.
 */

public class PreferenceActivityTest extends PreferenceActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        if(hasHeaders())
        {
            Button button = new Button(this);
            button.setText("设置操作");
            setListFooter(button);
        }
    }
    @SuppressLint("ResourceType")
    @Override
    public void onBuildHeaders(List<Header> target)
    {
        loadHeadersFromResource(R.layout.preference_headers,target);
    }
    @Override
    public boolean isValidFragment(String fragmentName)
    {
        return true;
    }
    public static class Prefs1Fragment extends PreferenceFragment
    {
        @SuppressLint("ResourceType")
        @Override
        public void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.layout.preferences);
        }
    }
    public static class Prefs2Fragment extends PreferenceFragment
    {
        @Override
        public void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);

        }
    }
}
