package com.joelespinal.codelabs.daos

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.joelespinal.codelabs.entities.TABLE_WORD
import com.joelespinal.codelabs.entities.Word

@Dao
interface WordDao {

    @Query("SELECT * FROM $TABLE_WORD ORDER BY word ASC")
    fun getAlphabetizedWords(): LiveData<List<Word>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(word: Word)

    @Query("DELETE FROM $TABLE_WORD")
    suspend fun deleteAll()
}