package ru.trainschedule.data.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
internal class SearchResponse(
    @SerialName("date")
    val date: String,
    @SerialName("from")
    val from: SearchFromResponse,
    @SerialName("to")
    val to: SearchToResponse,
)