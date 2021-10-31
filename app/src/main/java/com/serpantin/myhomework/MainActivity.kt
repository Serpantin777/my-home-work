package com.serpantin.myhomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val MY_TAG = "MyTag"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(MY_TAG, "onCreate()")
    }

    override fun onStart() {
        super.onStart()
        Log.d(MY_TAG, "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(MY_TAG, "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d(MY_TAG, "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d(MY_TAG, "onStop()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(MY_TAG, "onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(MY_TAG, "onDestroy()")
    }

}