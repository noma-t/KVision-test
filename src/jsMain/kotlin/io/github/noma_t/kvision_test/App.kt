package io.github.noma_t.kvision_test

import io.kvision.Application
import io.kvision.CoreModule
import io.kvision.BootstrapModule
import io.kvision.BootstrapCssModule
import io.kvision.html.div
import io.kvision.module
import io.kvision.panel.root
import io.kvision.startApplication

class App : Application() {
    override fun start() {
        root("kvapp") {
            div {
                +"This page was created by KVision"
                
            }
            // TODO
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
