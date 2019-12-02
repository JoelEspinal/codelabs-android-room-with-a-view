package com.joelespinal.codelabs.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.joelespinal.codelabs.entities.Word

@Dao
interface WordDao {

    // TODO Getting all words ordered alphabetically

    // TODO Inserting a word
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(word: Word)

    //TODO Deleting all words

}