package com.example.ch.databindingdome;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by ch on 2017/8/21.
 */

public class User2 extends BaseObservable {
    private String name;
    private String age;
    private String sex;

    public User2(String name, String age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        //notifyPropertyChanged(BR.name);  和User 区别
    }
    @Bindable
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
        //notifyPropertyChanged(BR.age);
    }
    @Bindable
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
        //notifyPropertyChanged(BR.sex);
    }
}
