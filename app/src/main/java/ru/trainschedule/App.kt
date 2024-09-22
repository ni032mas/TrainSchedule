package ru.trainschedule

import android.app.Application
import di.DI

internal class App : Application() {

    override fun onCreate() {
        super.onCreate()
        di = DI(this.applicationContext)
    }

    companion object {
        internal lateinit var di: DI
    }
}