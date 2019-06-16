package com.zzx.assistent;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListActive extends AppCompatActivity {
    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText("");
                    return true;
                case R.id.navigation_dashboard:
                    Intent intent_index=new Intent(ListActive.this,IndexActive.class);
                    startActivity(intent_index);
                    return true;
                case R.id.navigation_notifications:
                    Intent intent_register=new Intent(ListActive.this,RegisterActive.class);
                    startActivity(intent_register);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        String[] data={"成都","南充","绵阳","乐山","简阳","自贡","宜宾","内江","西昌","眉山","马尔康",
                "康定","德阳","遂宁","广安","梁山","泸州","攀枝花","雅安","营山","阆中","高坪","顺庆"};

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(ListActive.this,android.R.layout.simple_list_item_1,data);
        ListView view=findViewById(R.id.list_one);
        view.setAdapter(arrayAdapter);
    }

}
