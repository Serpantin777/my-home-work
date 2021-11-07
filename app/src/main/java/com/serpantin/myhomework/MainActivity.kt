package com.serpantin.myhomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

private const val MY_TAG = "MyTag"

class MainActivity<view> : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val showButton: Button = findViewById(R.id.button_end)
        showButton.setOnClickListener {
            showSnackbar(it)
        }
    }

    private fun showSnackbar(view: View){
        Snackbar.make(this, view, "Ничего тут нет!", Snackbar.LENGTH_INDEFINITE)
            .setAction("Жми!"){
                Toast.makeText(this, "Good bye!", Toast.LENGTH_LONG).show()
            }
            .show()
    }

}