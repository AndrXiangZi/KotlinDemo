package com.demo.kotlin

import android.support.v7.widget.RecyclerView
import android.view.View

/**
 * Create：xiangzi
 * Time：2018/11/23 16:45
 * Email: fengxiang@3wchina.net
 */
abstract class BaseViewHolder<T>(itemView: View) : RecyclerView.ViewHolder(itemView) {
    abstract fun setViewData(t: T)
}