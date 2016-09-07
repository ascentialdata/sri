package sri.universal.components

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactElement}
import sri.universal.ReactUniversal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.Dynamic.{literal => json}


case class SwipeableListView[T, H](zoomScale: js.UndefOr[Int] = js.undefined,
                                   scrollRenderAheadDistance: js.UndefOr[Int] = js.undefined,
                                   renderFooter: js.UndefOr[() => ReactElement] = js.undefined,
                                   contentContainerStyle: js.UndefOr[js.Any] = js.undefined,
                                   contentInset: js.UndefOr[EdgeInsets] = js.undefined,
                                   alwaysBounceVertical: js.UndefOr[Boolean] = js.undefined,
                                   pageSize: js.UndefOr[Int] = js.undefined,
                                   decelerationRate: js.UndefOr[Int] = js.undefined,
                                   minimumZoomScale: js.UndefOr[Double] = js.undefined,
                                   scrollsToTop: js.UndefOr[Boolean] = js.undefined,
                                   renderHeader: js.UndefOr[() => ReactElement] = js.undefined,
                                   keyboardDismissMode: js.UndefOr[keyboardDismissMode] = js.undefined,
                                   style: js.UndefOr[js.Any] = js.undefined,
                                   renderRow: (T, String | Int, String | Int, js.Function2[String | Int, String | Int, _]) => ReactElement,
                                   horizontal: js.UndefOr[Boolean] = js.undefined,
                                   contentOffset: js.UndefOr[PointProp] = js.undefined,
                                   centerContent: js.UndefOr[Boolean] = js.undefined,
                                   bounceFirstRowOnMount: Boolean,
                                   maxSwipeDistance: Double,
                                   renderQuickActions: js.Function,
                                   removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
                                   onEndReachedThreshold: js.UndefOr[Int] = js.undefined,
                                   ref: js.UndefOr[SwipeableListViewM => _] = js.undefined,
                                   onScroll: js.UndefOr[() => Unit] = js.undefined,
                                   dataSource: SwipeableListViewDataSource[T, H],
                                   scrollEventThrottle: js.UndefOr[Int] = js.undefined,
                                   throttleScrollCallbackMS: js.UndefOr[Int] = js.undefined,
                                   showsHorizontalScrollIndicator: js.UndefOr[Boolean] = js.undefined,
                                   key: js.UndefOr[String] = js.undefined,
                                   scrollEnabled: js.UndefOr[Boolean] = js.undefined,
                                   bouncesZoom: js.UndefOr[Boolean] = js.undefined,
                                   renderScrollComponent: js.UndefOr[js.Dynamic => ReactElement] = js.undefined,
                                   alwaysBounceHorizontal: js.UndefOr[Boolean] = js.undefined,
                                   bounces: js.UndefOr[Boolean] = js.undefined,
                                   maximumZoomScale: js.UndefOr[Double] = js.undefined,
                                   onEndReached: js.UndefOr[() => Unit] = js.undefined,
                                   automaticallyAdjustContentInsets: js.UndefOr[Boolean] = js.undefined,
                                   initialListSize: js.UndefOr[Int] = js.undefined,
                                   onScrollAnimationEnd: js.UndefOr[() => Unit] = js.undefined,
                                   stickyHeaderIndices: js.UndefOr[js.Array[Int]] = js.undefined,
                                   directionalLockEnabled: js.UndefOr[Boolean] = js.undefined,
                                   keyboardShouldPersistTaps: js.UndefOr[Boolean] = js.undefined,
                                   renderSeparator: js.UndefOr[(String, String, Boolean) => ReactElement] = js.undefined,
                                   onChangeVisibleRows: js.UndefOr[(VisibleRows, VisibleRows) => Unit] = js.undefined,
                                   pagingEnabled: js.UndefOr[Boolean] = js.undefined,
                                   renderSectionHeader: js.UndefOr[(H, String) => ReactElement] = js.undefined,
                                   canCancelContentTouches: js.UndefOr[Boolean] = js.undefined,
                                   showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.undefined,
                                   scrollIndicatorInsets: js.UndefOr[EdgeInsets] = js.undefined) {

  def apply() = {
    val props = JSMacro[SwipeableListView[T, H]](this)
    React.createElement(ReactUniversal.SwipeableListView, props)
  }

}

object SwipeableListView {
  def SwipeableListView[R, H](): SwipeableListViewDataSource[R, H] = ReactUniversal.SwipeableListView.asInstanceOf[js.Dynamic].getNewDataSource().asInstanceOf[SwipeableListViewDataSource[R, H]]
}

//case class VisibleRows(sectionID: VisibleSection) {
//  val toJS = JSMacro[VisibleRows](this)
//}
//
//object VisibleRows {
//  def fromJson(obj: js.Dynamic) = VisibleRows(sectionID = VisibleSection.fromJson(obj.sectionID))
//}
//
//case class VisibleSection(rowID: Boolean) {
//  val toJS = JSMacro[VisibleSection](this)
//}
//
//object VisibleSection {
//  def fromJson(obj: js.Dynamic) = VisibleSection(rowID = obj.rowID.asInstanceOf[Boolean])
//}

@js.native
trait SwipeableListViewM extends js.Object {

  def getScrollResponder(): ScrollViewM = js.native

  def scrollTo(destY: Double = 0, destX: Double = 0): Unit = js.native
}