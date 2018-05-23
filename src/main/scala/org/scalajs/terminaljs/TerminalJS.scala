package org.scalajs.terminaljs

import org.scalajs.dom.Element

import scala.scalajs.js

trait Terminal extends js.Object {
  /**
   * This is the top DOM element of the terminal instance.
   * If you want to modify styling via CSS, all instances belong to a .Terminal class.
   * The element will also get the ID from the constructor argument.
   */
  var html: Element = js.native

  /**
   * Prints a message on a new line.
   */
  def print(message: String) = js.native

  /**
   * Prints the message, and shows a prompt where the user can write.
   * When the user presses enter, the callback function fires.
   * The callback takes one argument, which is the user input.
   */
  def input(message: String, callback: js.Function1[String, Unit]) = js.native

  /**
   * The same as input but the input of the user will be hidden just like an old-fashioned terminal.
   */
  def password(message: String, callback: js.Function1[String, Unit]) = js.native

  /**
   * Displays a confirm message, with a " (y/n)" automatically appended at the end.
   * The callback receives the yes/no value as a boolean.
   */
  def confirm(message: String, callback: js.Function1[Boolean, Unit]) = js.native

  /**
   * Clears the screen.
   */
  def clear() = js.native

  /**
   * Plays a retro digital tone.
   */
  def beep() = js.native

  /**
   * Set to true by default.
   */
  def blinkingCursor(boolean: Boolean) = js.native

  def setTextSize(style: String) = js.native
  def setTextColor(style: String) = js.native
  def setBackgroundColor(style: String) = js.native
  def setWidth(style: String) = js.native
  def setHeight(style: String) = js.native

}

trait TerminalJSStatic {
  def apply(id: String): Terminal = js.native
  def apply()          : Terminal = js.native
}
