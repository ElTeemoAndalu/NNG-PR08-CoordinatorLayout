package es.iessaldillo.nicol.nng_pr08_coordinatorlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import es.iessaldillo.nicol.nng_pr08_coordinatorlayout.ui.fragment1.Fragment1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, Fragment1.newInstance())
                    .commitNow();
        }
    }
}
