
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User )(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.58*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">

<head>
    <meta charset="utf-8">
    <title>List of Employee - """),_display_(/*9.32*/title),format.raw/*9.37*/("""</title>
    <!-- Bootstrap Core CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />

    <!-- Custom CSS -->
    <link href=""""),_display_(/*14.18*/routes/*14.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.65*/("""" rel="stylesheet" />
</head>

<body>

    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="/">List of Employee</a>
            </div>

            <ul class="nav navbar-nav">
                
                <li class="nav-item">
                    <a href=""""),_display_(/*28.31*/routes/*28.37*/.HomeController.department),format.raw/*28.63*/("""">Department</a>
                </li>

                <li """),_display_(/*31.22*/if(title=="Login")/*31.40*/{_display_(Seq[Any](format.raw/*31.41*/("""class="active"""")))}),format.raw/*31.56*/(""">
                    """),_display_(/*32.22*/if(user != null)/*32.38*/ {_display_(Seq[Any](format.raw/*32.40*/("""
                        """),format.raw/*33.25*/("""<a href=""""),_display_(/*33.35*/routes/*33.41*/.LoginController.logout()),format.raw/*33.66*/("""">Logout """),_display_(/*33.76*/user/*33.80*/.getName()),format.raw/*33.90*/("""</a>
                    """)))}/*34.23*/else/*34.28*/{_display_(Seq[Any](format.raw/*34.29*/("""
                        """),format.raw/*35.25*/("""<a href=""""),_display_(/*35.35*/routes/*35.41*/.LoginController.login()),format.raw/*35.65*/("""">Login</a>
                    """)))}),format.raw/*36.22*/("""
                """),format.raw/*37.17*/("""</li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            <div class="col-md-12">
                """),_display_(/*47.18*/content),format.raw/*47.25*/("""
            """),format.raw/*48.13*/("""</div>
        </row>
    </container>
<br>
    <container>
        <footer>
        <row>
            <div class="col-md-12">
                Copyright
                <strong>Easy Company Ltd</strong>
            </div>
        </row>
    </footer>
    </container>
    <script src=""""),_display_(/*62.19*/routes/*62.25*/.Assets.versioned("javascripts/main.js")),format.raw/*62.65*/(""""></script>
</body>

</html>
"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 12 18:20:52 GMT 2018
                  SOURCE: /home/wdd/webapps/sdevCA1/app/views/main.scala.html
                  HASH: e756664696eee0a88b48d0b093cfd00f959bf4e6
                  MATRIX: 970->1|1121->57|1149->59|1275->159|1300->164|1513->350|1528->356|1590->397|1989->769|2004->775|2051->801|2139->862|2166->880|2205->881|2251->896|2301->919|2326->935|2366->937|2419->962|2456->972|2471->978|2517->1003|2554->1013|2567->1017|2598->1027|2643->1054|2656->1059|2695->1060|2748->1085|2785->1095|2800->1101|2845->1125|2909->1158|2954->1175|3117->1311|3145->1318|3186->1331|3499->1617|3514->1623|3575->1663
                  LINES: 28->1|33->1|35->3|41->9|41->9|46->14|46->14|46->14|60->28|60->28|60->28|63->31|63->31|63->31|63->31|64->32|64->32|64->32|65->33|65->33|65->33|65->33|65->33|65->33|65->33|66->34|66->34|66->34|67->35|67->35|67->35|67->35|68->36|69->37|79->47|79->47|80->48|94->62|94->62|94->62
                  -- GENERATED --
              */
          