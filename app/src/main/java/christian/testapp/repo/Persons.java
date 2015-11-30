package christian.testapp.repo;

import android.support.annotation.NonNull;
import android.util.Log;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import christian.testapp.IPersons;
import christian.testapp.dto.Person;

/**
 * Created by crisse on 2015-11-30.
 */
public class Persons implements IPersons{

    private ArrayList<Person> listOfPersons = new ArrayList<>();

    @Override
    public void setPerson(Person p) {
        try {

            listOfPersons.add(p);
        }catch (NullPointerException e){
            e.printStackTrace();
        }
        for(int i = 0; i < listOfPersons.size(); i++){
            Log.i("app", listOfPersons.get(i).getName());
        }
    }


    /*public Persons(String name, int age){
        listOfPersons.add(new Person(name,age));
        Log.i("app", listOfPersons.toString());
    }*/
}
