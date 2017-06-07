package ua.init.team.layoutmaster;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import ua.init.team.layoutmaster.fragments.MainFragment;

public class MainActivity extends AppCompatActivity implements OnButtonClick {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        InterfaceUtils.getInterfaceUtils().setOnButtonClick(this);
//        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setTitle("first");

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.main_container, new MainFragment())
                .commit();
//        setTitle("its work");




    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case android.R.id.home:

                Toast.makeText(this, "Back press", Toast.LENGTH_SHORT).show();

                break;

        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void click() {

        startActivity(new Intent(this, SecondActivity.class));
        finish();
    }
}
