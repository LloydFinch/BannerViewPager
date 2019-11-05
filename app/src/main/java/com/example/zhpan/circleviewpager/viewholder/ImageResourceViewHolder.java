package com.example.zhpan.circleviewpager.viewholder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.zhpan.circleviewpager.R;
import com.example.zhpan.circleviewpager.imageloader.ImageLoaderManager;
import com.example.zhpan.circleviewpager.imageloader.ImageLoaderOptions;
import com.example.zhpan.circleviewpager.net.BannerData;
import com.example.zhpan.circleviewpager.view.CornerImageView;
import com.zhpan.bannerview.holder.ViewHolder;

/**
 * <pre>
 *   Created by zhangpan on 2019-08-14.
 *   Description:
 * </pre>
 */
public class ImageResourceViewHolder implements ViewHolder<Integer> {
    private CornerImageView mImageView;

    @Override
    public View createView(ViewGroup viewGroup, Context context, int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_slide_mode, viewGroup, false);
        mImageView = view.findViewById(R.id.banner_image);
        return view;
    }

    @Override
    public void onBind(Context context, Integer data, int position, int size) {
        mImageView.setImageResource(data);
    }
}
