package com.gurcanataman.neumorphism

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import soup.neumorphism.ShapeType

class MainActivity : AppCompatActivity(), View.OnTouchListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnTouchListener(this)


    }

    override fun onTouch(p0: View?, event: MotionEvent?): Boolean {
        return when (event!!.action) {
            MotionEvent.ACTION_DOWN -> {
                setShapeType(ShapeType.PRESSED)
                true

            }

            MotionEvent.ACTION_UP -> {
                setShapeType(ShapeType.FLAT)
                true
            }

            else -> false
        }

    }


    private fun setShapeType(type: Int) {
        button.setShapeType(type)
    }
}