package ru.trainschedule.data.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
internal class TransportSubtypeResponse(
    @SerialName("code")
    val code: String?,
    @SerialName("color")
    val color: String?,
    @SerialName("title")
    val title: String?,
)