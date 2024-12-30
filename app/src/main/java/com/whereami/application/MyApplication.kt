package com.whereami.application

import android.app.Application
import ru.dgis.sdk.Context
import ru.dgis.sdk.DGis
import ru.dgis.sdk.platform.KeyFromString
import ru.dgis.sdk.platform.KeySource

class MyApplication: Application() {

    lateinit var sdkContext: Context

    override fun onCreate() {
        super.onCreate()

//        sdkContext = DGis.initialize(
//            appContext = this,
//            keySource = KeySource(
//                KeyFromString(
//                    "07faebec-b232-4e5d-8a6c-60a38cfd433e"
//                )
//            )
//        )
    }
}