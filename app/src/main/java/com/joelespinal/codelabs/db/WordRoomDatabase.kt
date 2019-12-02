package com.joelespinal.codelabs.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.joelespinal.codelabs.daos.WordDao
import com.joelespinal.codelabs.entities.Word

const val DATABASE_WORD = "word_database"

@Database(
    version = 1,
    entities = arrayOf(Word::class),
    exportSchema = false
)
abstract class WordRoomDatabase : RoomDatabase() {

    abstract fun wordDao(): WordDao

    companion object {

        @Volatile
        private var INSTANCE: WordRoomDatabase? = null

        fun getDatabase(context: Context): WordRoomDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }

            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    WordRoomDatabase::class.java,
                    DATABASE_WORD
                ).build()

                INSTANCE = instance
                return instance
            }
        }
    }
}