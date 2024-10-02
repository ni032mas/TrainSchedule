package di

import android.content.Context
import ru.trainschedule.data.ScheduleRepository

internal class DI(
    private val context: Context,
) {
    val scheduleRepository: ScheduleRepository by lazy {
        ScheduleRepository(context)
    }
}