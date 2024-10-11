package ru.trainschedule.data

import android.content.Context
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.decodeFromStream
import ru.trainschedule.R
import ru.trainschedule.data.response.AllStationResponse
import ru.trainschedule.domain.models.Country
import ru.trainschedule.domain.models.Station

@OptIn(ExperimentalSerializationApi::class)
internal class ScheduleRepository(
    private val appContext: Context,
) {

    private var country: Country? = null

    suspend fun getCountry(): Country =
        country ?: withContext(Dispatchers.IO) {
            country =
                readJsonFromRaw().toDomain().find { it.codes.yandexCode == COUNTRY_YANDEX_CODE_RU }
            checkNotNull(country)
        }

    private fun readJsonFromRaw(): AllStationResponse =
        Json.decodeFromStream<AllStationResponse>(
            stream = appContext.resources.openRawResource(R.raw.allstation),
        )

    suspend fun getStation(stationString: String): Station? {
        return getCountry().regions
            .flatMap { it.settlements }
            .flatMap { it.stations }
            .find { it.title == stationString }
    }

    companion object {
        private const val COUNTRY_YANDEX_CODE_RU = "l225"
    }
}
