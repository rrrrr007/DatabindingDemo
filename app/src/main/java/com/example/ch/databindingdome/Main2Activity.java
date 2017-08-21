package com.example.ch.databindingdome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class Main2Activity extends AppCompatActivity {
    private RecyclerView mRv;
    private ItemAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mRv = (RecyclerView) findViewById(R.id.rv);
        mRv.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new ItemAdapter(this,null);
        mRv.setAdapter(mAdapter);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.btn1:
                mAdapter.addUser();
                break;
            case R.id.btn2:
                mAdapter.setUser();
                break;
        }
    }
}
