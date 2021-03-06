package com.example.gook.network.model.networksearchedvolumescontainer

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ListPriceX(
    val amountInMicros: Long = 0,
    val currencyCode: String = ""
)