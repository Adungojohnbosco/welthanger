package com.johnbosco.welthanger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import java.time.Year
import java.util.*

class homewelt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homewelt)
    }
    fun bn(View:View){
        val DOB=findViewById<EditText>(R.id.jo)
        val SHOWAGE=findViewById<TextView>(R.id.TXT1)
        val userDOB: String=DOB.text.toString()
        if(userDOB.toInt()==0){
            SHOWAGE.text="inValid input"
            return
        }
        val year:Int=Calendar.getInstance().get(Calendar.YEAR)
        val myAge=year-userDOB.toInt()
        SHOWAGE.text="your age is $myAge"

    }
}
