package com.joelespinal.codelabs.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.joelespinal.codelabs.entities.TABLE_WORD
import com.joelespinal.codelabs.entities.Word

@Dao
interface WordDao {

    // TODO Getting all words ordered alphabetically

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(word: Word)

    //TODO Deleting all words
    @Query("DELETE FROM $TABLE_WORD")
    suspend fun deleteAll()
}