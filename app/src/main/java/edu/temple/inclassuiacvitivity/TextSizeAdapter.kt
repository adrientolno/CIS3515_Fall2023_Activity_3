package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(private val context: Context, private val textSises: Array<Int>): BaseAdapter (){
    override fun getCount() = textSises.size

    override fun getItem(position: Int) = textSises[position]

    override fun getItemId(position: Int) = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

       return (getDropDownView(position, convertView, parent) as TextView).apply {
           textSises
       }
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView: TextView
        if(convertView != null) {
            textView = convertView as TextView
        } else {
            textView = TextView(context)
            textView.setPadding(5, 10, 0, 10)
        }

        textView.text = textSises[position].toString()
        textView.textSize = textSises[position].toFloat()

        return textView
    }

}