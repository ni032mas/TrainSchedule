package ru.trainschedule.data.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
internal class SegmentResponse(
    @SerialName("arrival")
    val arrival: String,
    @SerialName("arrival_platform")
    val arrivalPlatform: String,
    @SerialName("arrival_terminal")
    val arrivalTerminal: String?,
    @SerialName("departure")
    val departure: String,
    @SerialName("departure_platform")
    val departurePlatform: String,
    @SerialName("departure_terminal")
    val departureTerminal: String?,
    @SerialName("duration")
    val duration: Float,
    @SerialName("from")
    val from: SegmentStationResponse,
    @SerialName("has_transfers")
    val hasTransfers: Boolean,
    @SerialName("start_date")
    val startDate: String,
    @SerialName("stops")
    val stops: String,
    @SerialName("thread")
    val thread: SegmentThreadResponse,
    @SerialName("tickets_info")
    val ticketsInfo: TicketsInfoResponse,
    @SerialName("to")
    val to: SegmentStationResponse,
)