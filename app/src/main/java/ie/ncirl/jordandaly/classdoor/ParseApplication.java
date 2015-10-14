package ie.ncirl.jordandaly.classdoor;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by jdaly on 06/10/2015.
 */
public class ParseApplication extends Application {
    public static final String YOUR_APPLICATION_ID = "";
    public static final String YOUR_CLIENT_KEY = "";




    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(College.class);
        ParseObject.registerSubclass(College_Review.class);
        ParseObject.registerSubclass(Course.class);
        ParseObject.registerSubclass(Course_Review.class);
        ParseObject.registerSubclass(Club_Soc.class);
        ParseObject.registerSubclass(Club_Soc_Review.class);
        ParseObject.registerSubclass(Module.class);
        ParseObject.registerSubclass(Module_Review.class);


        /*
        Enable Local Datastore.
        Add your initialization code here
        */
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, YOUR_APPLICATION_ID, YOUR_CLIENT_KEY);

        // ...
    }
}
