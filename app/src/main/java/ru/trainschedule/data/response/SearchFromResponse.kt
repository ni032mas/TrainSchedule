package ru.trainschedule.data.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
internal class SearchFromResponse(
    @SerialName("code")
    val code: String,
    @SerialName("popular_title")
    val popularTitle: String,
    @SerialName("short_title")
    val shortTitle: String,
    @SerialName("title")
    val title: String,
    @SerialName("type")
    val type: String,
)