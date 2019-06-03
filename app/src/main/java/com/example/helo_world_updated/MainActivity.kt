package com.example.helo_world_updated

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        world.visibility = View.INVISIBLE
        button.setOnClickListener {
            if (world.visibility == View.VISIBLE) {
                world.visibility = View.INVISIBLE
            }
            else {
                world.visibility = View.VISIBLE
            }
        }
    }
}
