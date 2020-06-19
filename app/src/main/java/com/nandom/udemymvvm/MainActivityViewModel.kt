package com.nandom.udemymvvm

import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    private var count = 0

    fun getCurrentcount(): Int {
        return count
    }

    fun addToSum(number: Int) {
        Log.d(TAG, "addToSum: ${number}")
         count += number
    }
}