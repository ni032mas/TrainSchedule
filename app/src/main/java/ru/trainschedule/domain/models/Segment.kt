package ru.trainschedule.domain.models

import kotlinx.serialization.Serializable

@Serializable
internal data class Segment(
    val arrival: String,
    val arrivalPlatform: String,
    val arrivalTerminal: String?,
    val departure: String,
    val departurePlatform: String,
    val departureTerminal: String?,
    val duration: Float,
    val from: SegmentStation,
    val hasTransfers: Boolean,
    val startDate: String,
    val stops: String?,
    val thread: SegmentThread,
    val ticketsInfo: TicketsInfo,
    val to: SegmentStation,
)