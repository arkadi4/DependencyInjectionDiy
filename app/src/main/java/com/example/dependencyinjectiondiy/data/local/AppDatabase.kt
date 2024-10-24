package com.example.dependencyinjectiondiy.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.dependencyinjectiondiy.data.entities.ItemDataEntity
import com.example.dependencyinjectiondiy.data.local.dao.ItemDao

@Database(version = 1, entities = [ItemDataEntity::class])
abstract class AppDatabase : RoomDatabase() {
    abstract fun itemDao(): ItemDao
}
