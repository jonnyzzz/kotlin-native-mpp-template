package org.jonnyzzz.template.jvm

import io.ktor.application.call
import io.ktor.application.install
import io.ktor.features.DefaultHeaders
import io.ktor.features.PartialContent
import io.ktor.features.XForwardedHeaderSupport
import io.ktor.html.respondHtml
import io.ktor.response.respondText
import io.ktor.routing.Routing
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import kotlinx.html.body
import kotlinx.html.h1
import kotlinx.html.head
import kotlinx.html.title


fun main() {
  embeddedServer(Netty, 9232) {
    install(DefaultHeaders)
    install(PartialContent)
    install(XForwardedHeaderSupport)

    install(Routing)
    routing {
      get {
        call.respondHtml {
          head {
            title = "ktor!"
          }

          body {
            //TODO: Update the code!
            h1 { +"TODO: UPDATE ME!" }
          }
        }
      }

      get("/health") {
        call.respondText { "OK" }
      }
    }
  }.start(wait = true)
}