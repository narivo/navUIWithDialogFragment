package com.example.navuiwithdialogfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var backPressedListener: OnBackPressedListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        backPressedListener?.backHaveBeenPressed()
    }
}

interface OnBackPressedListener {
    fun backHaveBeenPressed()
}