package christian.testapp;

import android.os.Bundle;
import android.util.Log;

import roboguice.activity.RoboActivity;
import roboguice.inject.ContentView;

/**
 * Created by crisse on 2015-11-30.
 */
public class TestClass implements Ione{
    @Override
    public void doIt() {
        Log.i("app", "TestClass doIt called");
    }
}
