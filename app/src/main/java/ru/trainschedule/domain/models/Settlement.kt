package ru.trainschedule.domain.models

internal data class Settlement(
    val codes: SettlementCodes,
    val stations: List<Station>,
    val title: String,
)