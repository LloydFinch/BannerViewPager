package com.zhpan.bannerview.holder;

import android.view.View;

import androidx.annotation.LayoutRes;

/**
 * Created by zhpan on 2017/10/30.
 * Description:
 */

public interface ViewHolder<T> {

    @LayoutRes int getLayoutId();

//    void createView(View itemView,int position);

    /**
     * @param itemView  ViewPager item View
     * @param data     实体类对象
     * @param position 当前位置
     * @param size     页面个数
     */
    void onBind(View itemView, T data, int position, int size);
}
