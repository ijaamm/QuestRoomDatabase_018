package com.example.praktikum9.repository

import com.example.praktikum9.Data.dao.MahasiswaDao
import com.example.praktikum9.Data.entity.Mahasiswa

class LocalRepositoryMhs (
    private val mahasiswaDao: MahasiswaDao
) : RepositoryMhs {
    override suspend fun insertMhs(mahasiswa: Mahasiswa) {
        mahasiswaDao.insertMahasiswa(mahasiswa)
    }

}