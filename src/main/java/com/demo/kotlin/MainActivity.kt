package com.demo.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var url = "http://img1.imgtn.bdimg.com/it/u=3357139565,1548309168&fm=26&gp=0.jpg"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mAdapter = MainAdapter(this)
        val data = ArrayList<String>()
        for (i in 0..10) {
            data.add(url)
        }

        with(this.recycleView) {
            layoutManager = LinearLayoutManager(this@MainActivity)
            addItemDecoration(DividerItemDecoration(baseContext, LinearLayout.VERTICAL))
            adapter = mAdapter
        }

        with(mAdapter) {
            addArray(data)
            addItemClickListener(object : OnItemClickListener<String> {
                override fun itemClick(t: String) {
                    Toast.makeText(this@MainActivity, t, Toast.LENGTH_SHORT).show()
                }
            })
        }
    }
}
