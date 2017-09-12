
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Login Page")/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""
  """),format.raw/*4.3*/("""<script type='text/javascript' src='"""),_display_(/*4.40*/routes/*4.46*/.Assets.at("javascripts/index.js")),format.raw/*4.80*/("""'></script>
  <form method="POST" action=""""),_display_(/*5.32*/routes/*5.38*/.UserController.index()),format.raw/*5.61*/("""">
    """),_display_(/*6.6*/helper/*6.12*/.CSRF.formField),format.raw/*6.27*/("""
    """),format.raw/*7.5*/("""<h1>Sign in</h1>
    <input type="text" name="username" placeholder="Username"/> <br/>
    <input type="password" name="password" placeholder="Password"/> <br/>
    <button type="submit">Login</button>
  </form>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Sep 12 16:03:19 ICT 2017
                  SOURCE: E:/GITHUB/HappyTraining/thu/play-java-jpa-example-2.6.x/app/views/login.scala.html
                  HASH: 9b7dce5253c2e26fad16168c533e6b72cd4ac41d
                  MATRIX: 941->1|1037->3|1067->8|1093->26|1132->28|1162->32|1225->69|1239->75|1293->109|1363->153|1377->159|1420->182|1454->191|1468->197|1503->212|1535->218
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|36->4|36->4|36->4|37->5|37->5|37->5|38->6|38->6|38->6|39->7
                  -- GENERATED --
              */
          