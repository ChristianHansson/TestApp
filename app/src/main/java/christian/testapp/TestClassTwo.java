package christian.testapp;

import android.util.Log;

/**
 * Created by crisse on 2015-11-30.
 */
public class TestClassTwo implements Ione {
    @Override
    public void doIt() {
        Log.i("app", "TestClassTwo called");
    }
}
