package ru.trainschedule.data.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
internal class IntervalSegmentThreadResponse(
    @SerialName("carrier")
    val carrier: CarrierResponse,
    @SerialName("express_type")
    val expressType: ExpressTypeResponse?,
    @SerialName("interval")
    val interval: IntervalResponse,
    @SerialName("number")
    val number: String,
    @SerialName("short_title")
    val shortTitle: String,
    @SerialName("thread_method_link")
    val threadMethodLink: String,
    @SerialName("title")
    val title: String,
    @SerialName("transport_subtype")
    val transportSubtype: TransportSubtypeResponse,
    @SerialName("transport_type")
    val transportType: String,
    @SerialName("uid")
    val uid: String,
    @SerialName("vehicle")
    val vehicle: String,
)