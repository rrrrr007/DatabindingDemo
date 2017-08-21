package com.example.ch.databindingdome;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.RequestOptions;

/**
 * Created by ch on 2017/8/21.
 */

public class ImageLoader {
    @BindingAdapter({"imageUr"})
    public static void load(ImageView view,String url){
        RequestOptions options = new RequestOptions()
                .centerCrop()
                .placeholder(R.mipmap.ic_launcher_round)
                .error(R.mipmap.ic_launcher)
                .priority(Priority.HIGH)
                .diskCacheStrategy(DiskCacheStrategy.NONE);

        Glide.with(view.getContext()).applyDefaultRequestOptions(options).load(url).transition(new DrawableTransitionOptions().crossFade(1000)).into(view);

    }
}
