package com.example.ch.databindingdome;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;

import static com.example.ch.databindingdome.BR.user;


/**
 * Created by ch on 2017/8/21.
 */

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.Holder> {
    private Activity mActivity;
    private ArrayList<User2> mModel;
    private LayoutInflater mInflater;

    public ItemAdapter(Activity mActivity, ArrayList<User2> mModel) {
        this.mActivity = mActivity;
        this.mModel = mModel;
        this.mInflater = LayoutInflater.from(mActivity);
        if (mModel == null) {
            this.mModel = new ArrayList<>();
        }
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewDataBinding binding = DataBindingUtil.inflate(mInflater, R.layout.itemadapter, parent, false);
        return new Holder(binding);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        holder.getBinding().setVariable(user, mModel.get(position));
        holder.getBinding().executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return mModel.size();
    }

    public void setUser() {
        if (mModel.size()>0){
            mModel.get(0).setSex("女");
            mModel.get(0).setName("姐姐");
            mModel.get(0).setAge("18");
            notifyDataSetChanged();
        }

    }

    public void addUser() {
        mModel.add(0,new User2("ch","1","男"));
        notifyDataSetChanged();
    }

    public class Holder extends RecyclerView.ViewHolder {
        private ViewDataBinding binding;

        public Holder(ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public ViewDataBinding getBinding() {
            return binding;
        }

        public void setBinding(ViewDataBinding binding) {
            this.binding = binding;
        }
    }
}
