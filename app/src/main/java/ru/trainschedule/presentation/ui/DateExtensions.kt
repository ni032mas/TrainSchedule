package ru.trainschedule.presentation.ui

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.TimeZone

fun Long.formatDate(): String =
    SimpleDateFormat("d MMMM yyyy", Locale.getDefault()).format(Date(this))

fun String.formatDate(): String {
    val inputFormat = SimpleDateFormat(DATE_FORMAT, Locale.getDefault())
    val outputFormat = SimpleDateFormat(TIME_FORMAT, Locale.getDefault())
    inputFormat.timeZone = TimeZone.getTimeZone(TIME_ZONE_UTC)
    outputFormat.timeZone = TimeZone.getTimeZone(TIME_ZONE)
    return outputFormat.format(checkNotNull(inputFormat.parse(this)))
}

private const val DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ssXXX"
private const val TIME_FORMAT = "HH:mm"
private const val TIME_ZONE = "Europe/Moscow"
private const val TIME_ZONE_UTC = "UTC"