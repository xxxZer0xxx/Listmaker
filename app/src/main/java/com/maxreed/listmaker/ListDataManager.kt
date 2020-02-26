package com.maxreed.listmaker

import android.content.Context
import androidx.preference.PreferenceManager

class ListDataManager (private val context: Context){
    fun saveList(list: Tasklist){
        val sharedPresentException = PreferenceManager.getDefaultSharedPreferences(context).edit()
    }
}