package com.example.gook.network.model.networksearchedvolumescontainer

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Pdf(
    val acsTokenLink: String = "",
    val downloadLink: String = "",
    val isAvailable: Boolean = false
)