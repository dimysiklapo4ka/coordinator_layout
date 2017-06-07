package ua.init.team.layoutmaster;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import ua.init.team.layoutmaster.fragments.MainFragment;

/**
 * Created by dev on 02.06.17.
 */

public class SecondActivity extends AppCompatActivity implements OnButtonClick{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        InterfaceUtils.getInterfaceUtils().setOnButtonClick(this);

        getSupportActionBar().setTitle("second");



        getSupportFragmentManager().beginTransaction()
                .replace(R.id.main_container, new MainFragment())
                .commit();
    }

    @Override
    public void click() {

        startActivity(new Intent(this, MainActivity.class));
        finish();

    }
}
