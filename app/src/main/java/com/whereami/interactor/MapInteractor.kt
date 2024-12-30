package com.whereami.interactor

import ru.dgis.sdk.Context
import ru.dgis.sdk.directory.SearchManager
import ru.dgis.sdk.map.MyLocationMapObjectSource

class MapInteractor(
    private val sdkContext: Context,
    private val searchManager: SearchManager
) {


    fun foo() {
        // Создание источника данных
        val source = MyLocationMapObjectSource(
            sdkContext
        )

        source.item.userData
    }
}