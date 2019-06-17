package com.zzx.assistent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.zzx.assistent.ui.main.FruitAdapter;
import com.zzx.assistent.ui.main.FruitDO;

import java.util.ArrayList;
import java.util.List;

public class ListViewClick extends AppCompatActivity {

    List<FruitDO> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_click);
        initFruits();

        FruitAdapter adapter = new FruitAdapter(ListViewClick.this, R.layout.activity_list_view_click, list);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        //添加点击事件
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                FruitDO fruitDO = list.get(position);
                Toast.makeText(ListViewClick.this, "您刚刚选择了水果：" + fruitDO.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initFruits() {

        for (int i = 0; i < 2; i++) {
            FruitDO apple = new FruitDO("XiangJiao", R.drawable.xiangjiao);
            FruitDO caomei = new FruitDO("CaoMei", R.drawable.caomei);
            FruitDO juzi = new FruitDO("JuZi", R.drawable.juzi);
            FruitDO mihoutao = new FruitDO("MiHouTao", R.drawable.mihoutao);
            FruitDO ningmeng = new FruitDO("NingMeng", R.drawable.ningmeng);
            FruitDO pingguo = new FruitDO("PingGuo", R.drawable.pingguo);
            FruitDO putao = new FruitDO("PuTao", R.drawable.putao);
            FruitDO xigua = new FruitDO("XiGua", R.drawable.xigua);
            FruitDO yingtao = new FruitDO("YingTao", R.drawable.yingtao);
            list.add(apple);
            list.add(caomei);
            list.add(juzi);
            list.add(mihoutao);
            list.add(ningmeng);
            list.add(pingguo);
            list.add(putao);
            list.add(xigua);
            list.add(yingtao);

        }
    }
}
