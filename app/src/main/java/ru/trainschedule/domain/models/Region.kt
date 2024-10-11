package ru.trainschedule.domain.models

internal data class Region(
    val codes: RegionCodes,
    val settlements: List<Settlement>,
    val title: String,
)






