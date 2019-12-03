package com.joelespinal.codelabs.repositories

import com.joelespinal.codelabs.daos.WordDao
import com.joelespinal.codelabs.entities.Word

class WordRepository(private val wordDao: WordDao) {

    val allWords = wordDao.getAlphabetizedWords()

    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}