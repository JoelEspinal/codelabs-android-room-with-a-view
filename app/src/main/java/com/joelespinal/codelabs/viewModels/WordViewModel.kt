package com.joelespinal.codelabs.viewModels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.joelespinal.codelabs.db.WordRoomDatabase
import com.joelespinal.codelabs.repositories.WordRepository

class WordViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: WordRepository

    init {
        val wordsDao = WordRoomDatabase.getDatabase(application).wordDao()
        repository = WordRepository(wordsDao)
    }

}