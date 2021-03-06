package cobrascales

import scala.util.control.NonFatal
import java.lang.NoSuchMethodError 

object TestTry {
  def handleThrowable(ex: Throwable): Unit = {
    println( "Failure detected:")
    ex.printStackTrace()
  }

  def apply(someFun: () => Unit): Unit = {
    try { someFun() }
    catch {
      case NonFatal(ex)          => handleThrowable(ex)
      case ex: NoSuchMethodError => handleThrowable(ex)

    }
  }
}