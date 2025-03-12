package io.github.noma_t.kvision_test

import io.kvision.Application
import io.kvision.CoreModule
import io.kvision.BootstrapModule
import io.kvision.BootstrapCssModule
import io.kvision.core.Background
import io.kvision.core.Color
import io.kvision.html.div
import io.kvision.module
import io.kvision.panel.root
import io.kvision.startApplication
import io.kvision.utils.px

class App : Application() {
    override fun start() {
        root("kvapp") {
            div {
                +"This page was created by KVision"
                fontSize = 24.px
                color = Color.hex(0x0000FF)
                background = Background(color = Color.hex(0xFFFF00))
            }
        }
    }
}

fun main() {
    startApplication(
        ::App,
        module.hot,
        BootstrapModule,
        BootstrapCssModule,
        CoreModule
    )
}
