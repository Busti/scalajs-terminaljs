package org.scalajs

import scala.scalajs.js

package object terminaljs {
  val Terminal = js.Dynamic.global.Terminal.asInstanceOf[TerminalJSStatic]
}
