package com.example.graphview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Color.*
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class GraphView :View{
    var values :Array<Int>? =null

    constructor(context :Context) :super(context)
    {}
    constructor(context: Context, attributeSet: AttributeSet):super(context,attributeSet)
    {}

    override fun onDraw(canvas: Canvas?)
    {
        super.onDraw(canvas)
        if(values==null)
        {
            return
        }

        var paint= Paint()
        paint.color= Color.RED

        var left=0
        var barWidth=height/values?.size!!
        var heightPerc=height/100

        for(i in 0..(values?.size!!-1))
        {
            canvas?.drawRect(
                left.toFloat(),
                (height-(values!![i]*heightPerc)).toFloat(),
                (left+barWidth).toFloat(),
                height.toFloat(),paint)

            left=left+barWidth
        }
    }
}
