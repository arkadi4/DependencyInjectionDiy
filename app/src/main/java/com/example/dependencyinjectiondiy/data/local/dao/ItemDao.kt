package com.example.dependencyinjectiondiy.data.local.dao


import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.dependencyinjectiondiy.data.entities.ItemDataEntity

@Dao
interface ItemDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertItem(itemDataEntity: ItemDataEntity)

    @Query("SELECT * FROM items")
    suspend fun getAllItems(): List<ItemDataEntity>
}
