package com.example.simple.show.popmenu.utility

import android.content.Context
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast
import com.example.simple.show.popmenu.R

class ShowPopupMenu {

     fun showPopMenu(context: Context, view: View) {

        val pop = PopupMenu(context, view)
        pop.inflate(R.menu.pop_menu_button)
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.Q) {
            pop.setForceShowIcon(true)
        }

        pop.setOnMenuItemClickListener {
            when (it!!.itemId) {
                R.id.popMenu_Edit -> {
                    Toast.makeText(context, "item Edite", Toast.LENGTH_SHORT).show()
                }
                R.id.popMenu_Delete -> {
                    Toast.makeText(context, "item Delete", Toast.LENGTH_SHORT).show()
                }
                R.id.popMEnu_Shared -> {
                    Toast.makeText(context, "item Shared", Toast.LENGTH_SHORT).show()
                }

            }
            true
        }

        pop.show()

    }

}