package com.example.android.color_my_views

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> =
            listOf(
                box_1, box_2, box_3, box_4, box_5, constraint_, red_button, yellow_button, green_button
            )
        for (item in clickableViews) {
            item.setOnClickListener { makeColoured(it) }
        }
    }

    private fun makeColoured(view: View) {
        when(view.id) {
            R.id.box_1 -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_2 -> view.setBackgroundColor(Color.GRAY)
            R.id.box_3 -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_4 -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_5 -> view.setBackgroundResource(android.R.color.holo_green_light)

            R.id.red_button -> view.setBackgroundColor(Color.RED)
            R.id.yellow_button -> view.setBackgroundColor(Color.YELLOW)
            R.id.green_button -> view.setBackgroundColor(Color.GREEN)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

}
