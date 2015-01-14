package eagle.abhishekravi.abhishek.eagle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Abhishek on 1/11/2015.
 */
public class secondScreen extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout);

        Intent activityThatCalled = getIntent();



    }

}
