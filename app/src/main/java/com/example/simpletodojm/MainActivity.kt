package com.example.simpletodojm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    val listOfTasks = mutableListOf<String>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

 /*       findViewById<Button>(R.id.button).setOnClickListener{
            Log.i("Joe", "User clicked a button")

        }
 */
        listOfTasks.add("This")
        listOfTasks.add("Took")
        listOfTasks.add("Too")
        listOfTasks.add("Long")
        listOfTasks.add("JMatulewicz")

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val adapter = TaskItemAdapter(listOfTasks)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}