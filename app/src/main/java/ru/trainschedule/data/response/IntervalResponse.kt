package ru.trainschedule.data.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
internal class IntervalResponse(
    @SerialName("begin_time")
    val beginTime: String,
    @SerialName("density")
    val density: String,
    @SerialName("end_time")
    val endTime: String,
)