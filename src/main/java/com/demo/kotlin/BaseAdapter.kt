package com.demo.kotlin

import android.support.v7.widget.RecyclerView

/**
 * Create：xiangzi
 * Time：2018/11/23 15:19
 * Email: fengxiang@3wchina.net
 */
abstract class BaseAdapter<T> : RecyclerView.Adapter<BaseViewHolder<T>>() {

    private var mData = ArrayList<T>()
    private lateinit var listener: OnItemClickListener<T>

    /**
     * 增加条目的点击事件
     */
    fun addItemClickListener(listener: OnItemClickListener<T>) {
        this.listener = listener
    }

    override fun getItemCount(): Int {
        return mData.size
    }

    /**
     * 绑定ViewHolder
     */
    override fun onBindViewHolder(holder: BaseViewHolder<T>, position: Int) {
        holder.setViewData(mData[position])
        holder.itemView.setOnClickListener {
            if (listener != null) {
                listener.itemClick(mData[position])
            }
        }
    }

    /**
     * 添加数据
     */
    fun addArray(data: ArrayList<T>) {
        mData.addAll(data)
        notifyDataSetChanged()
    }
}