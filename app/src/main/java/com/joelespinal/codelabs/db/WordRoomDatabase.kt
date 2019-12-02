package com.joelespinal.codelabs.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.joelespinal.codelabs.entities.Word

@Database(
    version = 1,
    entities = arrayOf(Word::class),
    exportSchema = false
)
abstract class WordRoomDatabase : RoomDatabase() {
}