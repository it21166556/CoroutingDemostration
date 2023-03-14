package com.example.coroutingdemostration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var tvCount: TextView

        CoroutineScope(Dispatchers.Main).launch {
            tvCount = findViewById(R.id.tvCount)
            counter(tvCount)
        }
    }

    suspend fun counter(view: TextView) {
        var count = 0
        while (true) {
            delay(1000)
            view.setText(count.toString())
            count++
            
        }


    }
}