package com.serpantin.myhomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val MY_TAG = "MyTag"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(MY_TAG, "1. Как грустны сумрачные дни \n" +
                "2. Беззвучной осени и хладной!")
    }

    override fun onStart() {
        super.onStart()
        Log.d(MY_TAG, "3. Какой истомой безотрадной \n" +
                "4. К нам в душу просятся они!")
    }

    override fun onResume() {
        super.onResume()
        Log.d(MY_TAG, "5. Но есть и дни, когда в крови \n" +
                "6. Золотолиственных уборов")
    }

    override fun onPause() {
        super.onPause()
        Log.d(MY_TAG, "7. Горящих осень ищет взоров \n" +
                "8. И знойных прихотей любви.")
    }

    override fun onStop() {
        super.onStop()
        Log.d(MY_TAG, "9. Молчит стыдливая печаль, \n" +
                "10. Лишь вызывающее слышно,")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(MY_TAG, "11. И, замирающей так пышно, \n" +
                "12. Ей ничего уже не жаль.")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(MY_TAG, "11. И, замирающей так пышно, \n" +
                "12. Ей ничего уже не жаль.")
    }

}