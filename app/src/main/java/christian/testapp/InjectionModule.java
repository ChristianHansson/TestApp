package christian.testapp;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

import christian.testapp.repo.Persons;

/**
 * Created by crisse on 2015-11-30.
 */
public class InjectionModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Ione.class).to(TestClass.class);
        bind(IPersons.class).to(Persons.class);
    }
}
