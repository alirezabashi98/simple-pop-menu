package com.example.simple.show.popmenu.activity

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.simple.show.popmenu.R
import com.example.simple.show.popmenu.utility.ShowPopupMenu


class MainActivity : AppCompatActivity() {

    lateinit var buttonShowPopupMenu: Button
    val showPopMenu = ShowPopupMenu()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Cast()

        buttonShowPopupMenu.setOnClickListener {
            showPopMenu.showPopMenu(this, it)
        }

    }

    private fun Cast() {
        buttonShowPopupMenu = findViewById(R.id.button)
    }

}