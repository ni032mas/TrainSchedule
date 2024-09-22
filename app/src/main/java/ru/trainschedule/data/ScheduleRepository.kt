package ru.trainschedule.data

import android.content.Context
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.decodeFromStream
import ru.trainschedule.R
import ru.trainschedule.data.response.AllStationResponse

@OptIn(ExperimentalSerializationApi::class)
internal class ScheduleRepository(
    private val appContext: Context,
) {

    private var allStation: AllStationResponse? = null

    suspend fun getAllStations(): AllStationResponse =
        allStation ?: withContext(Dispatchers.IO) {
            allStation = readJsonFromRaw()
            checkNotNull(allStation)
        }

    private fun readJsonFromRaw(): AllStationResponse =
        Json.decodeFromStream<AllStationResponse>(
            stream = appContext.resources.openRawResource(R.raw.allstation),
        )
}
