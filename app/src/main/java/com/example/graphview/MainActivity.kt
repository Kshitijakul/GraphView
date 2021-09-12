package com.example.graphview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var graphView:GraphView
    private var marks=arrayOf(90,55,86,30,80)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       init()
        graphView.values=marks
    }

    private fun init()
    {
        graphView=findViewById(R.id.graphView)
    }
}