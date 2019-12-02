package com.joelespinal.codelabs.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

const val TABLE_WORD = "word_table"

@Entity(tableName = TABLE_WORD)
data class Word(
    @PrimaryKey @ColumnInfo(name = "word") val word: String
)