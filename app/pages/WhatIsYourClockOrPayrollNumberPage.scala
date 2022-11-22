package pages

import play.api.libs.json.JsPath

case object WhatIsYourClockOrPayrollNumberPage extends QuestionPage[String] {

  override def path: JsPath = JsPath \ toString

  override def toString: String = "whatIsYourClockOrPayrollNumber"
}
