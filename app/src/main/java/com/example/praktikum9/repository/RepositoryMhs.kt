package com.example.praktikum9.repository

import com.example.praktikum9.Data.entity.Mahasiswa

interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa)
}