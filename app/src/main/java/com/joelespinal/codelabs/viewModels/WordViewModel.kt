package com.joelespinal.codelabs.viewModels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.joelespinal.codelabs.db.WordRoomDatabase
import com.joelespinal.codelabs.entities.Word
import com.joelespinal.codelabs.repositories.WordRepository

class WordViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: WordRepository

    val allWords: LiveData<List<Word>>

    init {
        val wordsDao = WordRoomDatabase.getDatabase(application).wordDao()
        repository = WordRepository(wordsDao)

        allWords = repository.allWords
    }

}