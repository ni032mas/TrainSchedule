package ru.trainschedule

import android.app.Application
import di.DI

internal class App : Application() {

    internal lateinit var di: DI

    override fun onCreate() {
        super.onCreate()
        di = DI(this.applicationContext)
    }
}