package com.kishor.android.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerview=findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerview.setLayoutManager(layoutManager);

        List<ModelClass> modelClassList=new ArrayList<>();
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"user one","hello this is Kishor"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"user two","hello this is Kishor"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"user three","hello this is Kishor"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"user four","hello this is Kishor"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"user five","hello this is Kishor"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"user six","hello this is Kishor"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"user seven","hello this is Kishor"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"user eight","hello this is Kishor"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"user nine","hello this is Kishor"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"user ten","hello this is Kishor"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"user eleven","hello this is Kishor"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"user twelve","hello this is Kishor"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"user thirteen","hello this is Kishor"));

       Adapter adapter=new Adapter(modelClassList);
       recyclerview.setAdapter(adapter);
       adapter.notifyDataSetChanged();
    }
}