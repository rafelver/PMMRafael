package com.example.rafael.proyecto04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity implements MenuFragment.MenuFragmentListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Bundle bundle = getIntent().getExtras();


        WelcomeFragment firstFragment = new WelcomeFragment();

        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container, firstFragment).commit();

    }

    public void onListSelected(int position,String item){
        Toast.makeText(this, item, Toast.LENGTH_SHORT).show();
        //  Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        // intent.putExtra("so",item);
        //  startActivity(intent);

    }
}
