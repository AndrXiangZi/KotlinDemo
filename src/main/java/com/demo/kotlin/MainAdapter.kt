package com.demo.kotlin

import android.content.Context
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_main.view.*

/**
 * Create：xiangzi
 * Time：2018/11/23 15:16
 * Email: fengxiang@3wchina.net
 */
class MainAdapter(context: Context) : BaseAdapter<String>() {

    private var mContext = context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<String> {
        val itemView = LayoutInflater.from(mContext).inflate(R.layout.item_main, null)
        return MainHolder(itemView)
    }

    class MainHolder(itemView: View) : BaseViewHolder<String>(itemView) {

        override fun setViewData(t: String) {
            Glide.with(itemView).load(Uri.parse(t)).into(itemView.item_iv)
        }
    }
}

