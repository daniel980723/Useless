package com.example.useless

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface UsefulDao {
    @Insert suspend fun insertUseful(useful: Useful)
    @Query("SELECT * FROM Useful")
    suspend fun getAllUseful():LiveData<List<Useful>>
    @Query("SELECT * FROM useful WHERE id = :useful_id")
    suspend fun getAuseful(useful_id:Int)

    @Update
    suspend fun updateUseful(useful: Useful)

    @Delete
    suspend fun deleteUseful(useful: Useful)
}