package com.miempresa.lab09_02.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.miempresa.lab09_02.model.Stopwatch

@Database(entities = [Stopwatch:: class], version = 1, exportSchema = false)
abstract class StopwatchDataBase : RoomDatabase() {
    abstract fun stopDao() : StopwatchDataDao
}