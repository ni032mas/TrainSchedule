package ru.trainschedule.domain.models

internal data class IntervalSegmentThread(
    val carrier: Carrier,
    val expressType: ExpressType?,
    val interval: Interval,
    val number: String,
    val shortTitle: String,
    val threadMethodLink: String,
    val title: String,
    val transportSubtype: TransportSubtype,
    val transportType: String,
    val uid: String,
    val vehicle: String,
)