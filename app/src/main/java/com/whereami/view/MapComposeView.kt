package com.whereami.view

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import com.whereami.ui.theme.WhereAmITheme
import ru.dgis.sdk.map.MapView

@Composable
fun MapComposeView() {
    AndroidView(
        modifier = Modifier
            .fillMaxSize(),
        factory = { context ->
            MapView(context)
        },
        update = { map ->

        }
    )
}

@Preview
@Composable
fun MapComposeViewPreview() {
    WhereAmITheme {
        MapComposeView()
    }
}