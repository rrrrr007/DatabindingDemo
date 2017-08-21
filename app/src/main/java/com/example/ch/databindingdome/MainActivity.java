package com.example.ch.databindingdome;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.ch.databindingdome.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    private String name = "ch";
    private int age = 12;
    private String sex = "男";
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        user = new User(name, age, sex);
        binding.setUser(user);
        user.setUrl("https://www.baidu.com/img/bd_logo1.png");
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.name:
                user.setName(user.getName() + "x");
                break;
            case R.id.age:
                user.setAge(user.getAge() + 1);
                break;
            case R.id.sex:
                user.setSex(user.getSex().equals("男") ? "女" : "男");
                break;
            case R.id.image:
                startActivity(new Intent(this, Main2Activity.class));
                break;
        }
    }
}

