package com.company.a7minutesworkout

import androidx.room.*
import androidx.room.Insert
import kotlinx.coroutines.flow.Flow

//Todo 4 create a dao interface with insert method
@Dao
interface HistoryDao {

    @Insert
    suspend fun insert(historyEntity: HistoryEntity)

    //Todo 1: create a query to fetch the entries
    @Query("Select * from `histories`")
    fun fetchALlDates(): Flow<List<HistoryEntity>>
}