package com.company.a7minutesworkout

import android.app.Application
//Todo 6 create the application class
class WorkOutApp: Application() {

    val db:HistoryDatabase by lazy {
        HistoryDatabase.getInstance(this)
    }
}