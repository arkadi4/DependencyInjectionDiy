package com.example.dependencyinjectiondiy

import android.app.Application
import androidx.room.Room
import com.example.dependencyinjectiondiy.data.local.AppDatabase

//import androidx.room.Room
//import com.example.dependencyinjectiondiy.data.local.AppDatabase

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        val database = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "my_database"
        ).build()
    }

}
