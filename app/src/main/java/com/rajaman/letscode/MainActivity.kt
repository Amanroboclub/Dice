package com.rajaman.letscode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import androidx.annotation.MainThread
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {

            for (i in 0..20) {
                Thread.sleep(10)
                Run.after(2000){
                    Thread.sleep(1)
                    chalbsdk()
                }
            }
            final()


        }
    }

    class Run {
        companion object {
            fun after(delay: Long, process: () -> Unit) {
                Handler().postDelayed({
                    process()
                }, delay)
            }


        }
    }

    fun chalbsdk() {


            var X = Random.nextInt(1, 7)
            if (X == 1) {
                imageView.setImageResource(R.drawable.one)
            }
            if (X == 2) {
                imageView.setImageResource(R.drawable.two)
            }
            if (X == 3) {
                imageView.setImageResource(R.drawable.three)
            }
            if (X == 4) {
                imageView.setImageResource(R.drawable.four)
            }
            if (X == 5) {
                imageView.setImageResource(R.drawable.five)
            }
            if (X == 6) {
                imageView.setImageResource(R.drawable.six)
            }

    }
    fun final(){
        var X = Random.nextInt(1, 7)
        if (X == 1) {
            imageView.setImageResource(R.drawable.one)
            Toast.makeText(this, "Answer", Toast.LENGTH_SHORT).show()
        }
        if (X == 2) {
            imageView.setImageResource(R.drawable.two)
            Toast.makeText(this, "Answer", Toast.LENGTH_SHORT).show()
        }
        if (X == 3) {
            imageView.setImageResource(R.drawable.three)
            Toast.makeText(this, "Answer", Toast.LENGTH_SHORT).show()
        }
        if (X == 4) {
            imageView.setImageResource(R.drawable.four)
            Toast.makeText(this, "Answer", Toast.LENGTH_SHORT).show()
        }
        if (X == 5) {
            imageView.setImageResource(R.drawable.five)
            Toast.makeText(this, "Answer", Toast.LENGTH_SHORT).show()
        }
        if (X == 6) {
            imageView.setImageResource(R.drawable.six)
            Toast.makeText(this, "Answer", Toast.LENGTH_SHORT).show()
        }
    }
}
