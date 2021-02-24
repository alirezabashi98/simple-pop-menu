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

        pop.setOnMenuItemClickListener {
            when (it!!.itemId) {
                R.id.popMenu_Edit -> {
                    Toast.makeText(context, "item Edite", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.popMenu_Delete -> {
                    Toast.makeText(context, "item Delete", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.popMEnu_Shared -> {
                    Toast.makeText(context, "item Shared", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false

            }
        }

         try {

             val fieldMpopup = PopupMenu::class.java.getDeclaredField("mPopup")
             fieldMpopup.isAccessible= true
             val mPopup = fieldMpopup.get(pop)
             mPopup.javaClass
                 .getDeclaredMethod("setFoeceShowIcon",Boolean::class.java)
                 .invoke(mPopup,true)

         }catch (e:Exception){

         }finally {
             pop.show()
         }

    }

}