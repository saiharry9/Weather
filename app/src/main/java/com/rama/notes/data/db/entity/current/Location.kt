package com.rama.notes.data.db.entity.current

import androidx.room.Entity


@Entity(tableName = "location")
data class Location(
    val country: String,
    val lat: String,
    val localtime: String,
    val localtime_epoch: Int,
    val lon: String,
    val name: String,
    val region: String,
    val timezone_id: String,
    val utc_offset: String
)