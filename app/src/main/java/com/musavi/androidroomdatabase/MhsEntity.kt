package com.musavi.androidroomdatabase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "mahasiswa")
data class MhsEntity(
    @PrimaryKey(autoGenerate = true) var nim:Int,
    @ColumnInfo(name = "nama") var nama:String,
    @ColumnInfo(name = "alamat") var alamat:String
)