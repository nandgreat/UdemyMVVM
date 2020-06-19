package com.nandom.udemymvvm

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    private var count = 0

    fun getCurrentcount(): Int {
        return count
    }

    fun getUpdatedCount(): Int {
        return ++count
    }
}