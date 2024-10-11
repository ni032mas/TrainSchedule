package ru.trainschedule.domain.models

internal data class IntervalSegment(
    val arrivalPlatform: String,
    val arrivalTerminal: String?,
    val departurePlatform: String,
    val departureTerminal: String?,
    val duration: Float,
    val from: SegmentStation,
    val hasTransfers: Boolean,
    val startDate: String,
    val stops: String,
    val thread: IntervalSegmentThread,
    val ticketsInfo: TicketsInfo,
    val to: SegmentStation,
)