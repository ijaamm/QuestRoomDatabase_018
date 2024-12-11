package com.example.praktikum9.Data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.praktikum9.Data.dao.MahasiswaDao
import com.example.praktikum9.Data.entity.Mahasiswa

@Database(entities = [Mahasiswa::class], version = 1, exportSchema = false)
abstract class KrsDatabase : RoomDatabase(){
    abstract fun mahasiswaDao(): MahasiswaDao

    companion object {
        @Volatile
        private var Instance: KrsDatabase? = null

        fun getDatabase(context: Context): KrsDatabase {
            return (Instance ?: synchronized(this) {
                Room.databaseBuilder(
                    context.applicationContext,
                    KrsDatabase::class.java,
                    "krsDatabase"
                )
                    .build().also { Instance = it }
            })
        }
    }
}
