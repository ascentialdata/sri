package sri.mobile.components.ios

import chandu0101.macros.tojs.JSMacro
import sri.core.React
import sri.mobile.ReactNative

import scala.scalajs.js


@deprecated("ActivityIndicatorIOS deprecated use ActivityIndicator instead")
case class ActivityIndicatorIOS(size: js.UndefOr[ActivityIndicatorIOSSize] = js.undefined,
                                hidesWhenStopped: js.UndefOr[Boolean] = js.undefined,
                                style: js.UndefOr[js.Any] = js.undefined,
                                onLayout: js.UndefOr[js.Function] = js.undefined,
                                ref: js.UndefOr[ActivityIndicatorIOSM => _] = js.undefined,
                                color: js.UndefOr[String] = js.undefined,
                                key: js.UndefOr[String] = js.undefined,
                                animating: js.UndefOr[Boolean] = js.undefined) {

  def apply() = {
    val props = JSMacro[ActivityIndicatorIOS](this)
    React.createElement(ReactNative.ActivityIndicatorIOS,props)
  }

}


class ActivityIndicatorIOSSize private(val value: String) extends AnyVal

object ActivityIndicatorIOSSize {

  val SMALL = new ActivityIndicatorIOSSize("small")
  val LARGE = new ActivityIndicatorIOSSize("large")

  def newSize(size: String) = new ActivityIndicatorIOSSize(size)
}

@js.native
trait ActivityIndicatorIOSM extends js.Object