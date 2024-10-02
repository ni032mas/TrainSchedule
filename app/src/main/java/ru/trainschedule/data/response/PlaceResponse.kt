package ru.trainschedule.data.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
internal class PlaceResponse(
    @SerialName("currency")
    val currency: String,
    @SerialName("name")
    val name: String,
    @SerialName("price")
    val price: PriceResponse,
)