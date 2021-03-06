package com.example.trailmobile.app.Presenters;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;

import com.example.trailmobile.app.Classes.DataSource;
import com.example.trailmobile.app.Interfaces.IManager;
import com.example.trailmobile.app.Interfaces.IObserver;
import com.example.trailmobile.app.Interfaces.IPresenter;

/**
 * Created by Cesar Ferreira on 09/03/2016.
 */
public class NewsPresenter implements IPresenter,IObserver {
    private Activity activity;


    @Override
    public void attachActivity(Activity a) {
        activity = a;
    }
    @Override
    public void attachFragment(Fragment a) {

    }

    @Override
    public void attachTrialManager(IManager rep) {

    }

    @Override
    public boolean getCompetitionStatus() {
        return DataSource.getInstance().getCompetitionStatus();
    }

    @Override
    public void startService(int pos, Intent intent) {

    }

    @Override
    public void stopService(int pos, Intent intent) {

    }


    @Override
    public void update() {

    }
}
