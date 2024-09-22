package ru.trainschedule.domain.models

internal class SegmentThread(
    val carrier: Carrier,
    val expressType: ExpressType?,
    val number: String,
    val shortTitle: String,
    val threadMethodLink: String,
    val title: String,
    val transportSubtype: TransportSubtype,
    val transportType: TransportType,
    val uid: String,
    val vehicle: String?,
)