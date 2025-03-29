package com.company.a7minutesworkout

import androidx.room.Entity
import androidx.room.PrimaryKey

/** Todo 3
 * Create an entity with @param [tableName]
 * Use @param [date] as primary key
 * */
@Entity(tableName = "histories")
data class HistoryEntity(
    @PrimaryKey
    val date:String)