package com.example.nasha_igra

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.PointF
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gamepad.setOnTouchListener(object : View.OnTouchListener {
            override fun onTouch(p0: View?, p1: MotionEvent?): Boolean {


            }
        })
    }
}
var x =
var y = 0
class fon (c : Context, attrs: AttributeSet) : View(c, attrs) {
    fun move(v: Float){

    }
    class charapter {
        var position : PointF = PointF()
    }
    var paint: Paint = Paint()
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.drawCircle(100f, 100f, 60f, paint)
    }
}
class jostik (c : Context, attrs: AttributeSet) : View(c, attrs) {

     override fun onDraw(canvas: Canvas) {
         super.onDraw(canvas)

     }
}