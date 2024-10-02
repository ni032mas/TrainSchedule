package ru.trainschedule.domain.models

class Settlement(
    val codes: SettlementCodes,
    val stations: List<Station>,
    val title: String,
)