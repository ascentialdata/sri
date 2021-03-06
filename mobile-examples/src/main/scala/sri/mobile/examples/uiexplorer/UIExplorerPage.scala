package sri.mobile.examples.uiexplorer

import sri.core.ElementFactory._
import sri.core.{ReactComponent, _}
import sri.mobile.ReactNative
import sri.mobile.examples.Spinner
import sri.universal.components._
import sri.universal.styles.UniversalStyleSheet

import scala.scalajs.js
import scala.scalajs.js.{Function1, UndefOr}
import scala.scalajs.js.annotation.ScalaJSDefined

object UIExplorerPage {


  @ScalaJSDefined
  class Component extends ReactComponent[Unit, Unit] {


    def render() = {
      ScrollView(style = UniversalStyleSheet.wholeContainer, keyboardShouldPersistTaps = true,
        keyboardDismissMode = keyboardDismissMode.INTERACTIVE)(
          children
        )
    }

  }

  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

  def apply(children: ReactNode*) = createElementNoPropsWithChildren(ctor)(children: _*)

}
