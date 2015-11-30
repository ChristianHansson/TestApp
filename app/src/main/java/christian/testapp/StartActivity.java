package christian.testapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import javax.inject.Inject;

import christian.testapp.dto.Person;
import christian.testapp.repo.Persons;
import roboguice.activity.RoboActivity;
import roboguice.inject.ContentView;
import roboguice.inject.InjectView;

@ContentView(R.layout.activity_start)
public class StartActivity extends RoboActivity{

    @InjectView(R.id.largeText)
    TextView textView;
    @InjectView (R.id.btn1)
    Button button;
    @Inject
    Ione ione;
    @Inject
    IPersons iPersons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //ione.doIt(); //Kallar på en metod via interface.


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iPersons.setPerson(new Person("Christian", 28));

            }
        });

    }
}
