
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
    <link href=""""),_display_(/*13.18*/routes/*13.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*13.65*/("""" rel="stylesheet" />
</head>

<body>

    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="/">List of Employee</a>
            </div>

            <ul class="nav navbar-nav">

                <li """),_display_(/*26.22*/if(title=="Employee" )/*26.44*/{_display_(Seq[Any](format.raw/*26.45*/("""class="active"""")))}),format.raw/*26.60*/(""">
                    <a href="#">About</a>
                </li>

                <li>
                    <a href=""""),_display_(/*31.31*/routes/*31.37*/.HomeController.department),format.raw/*31.63*/("""">Department</a>
                </li>

                <li>
                    <a href="#">Services</a>
                </li>

                <li>
                    <a href="#">Contact</a>
                </li>
                <li """),_display_(/*41.22*/if(title=="Login")/*41.40*/{_display_(Seq[Any](format.raw/*41.41*/("""class="active"""")))}),format.raw/*41.56*/(""">
                    """),_display_(/*42.22*/if(user != null)/*42.38*/ {_display_(Seq[Any](format.raw/*42.40*/("""
                        """),format.raw/*43.25*/("""<a href=""""),_display_(/*43.35*/routes/*43.41*/.LoginController.logout()),format.raw/*43.66*/("""">Logout """),_display_(/*43.76*/user/*43.80*/.getName()),format.raw/*43.90*/("""</a>
                    """)))}/*44.23*/else/*44.28*/{_display_(Seq[Any](format.raw/*44.29*/("""
                        """),format.raw/*45.25*/("""<a href=""""),_display_(/*45.35*/routes/*45.41*/.LoginController.login()),format.raw/*45.65*/("""">Login</a>
                    """)))}),format.raw/*46.22*/("""

                """),format.raw/*48.17*/("""</li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            <div class="col-md-12">
                """),_display_(/*58.18*/content),format.raw/*58.25*/("""
            """),format.raw/*59.13*/("""</div>
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
    <script src=""""),_display_(/*73.19*/routes/*73.25*/.Assets.versioned("javascripts/main.js")),format.raw/*73.65*/(""""></script>
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
                  DATE: Fri Mar 09 20:27:02 GMT 2018
                  SOURCE: /home/brandon/Documents/sdevCA/app/views/main.scala.html
                  HASH: 0670c0fc14d767e36d4a1503a0a3e73820bfdc4d
                  MATRIX: 970->1|1121->57|1149->59|1275->159|1300->164|1512->349|1527->355|1589->396|1925->705|1956->727|1995->728|2041->743|2186->861|2201->867|2248->893|2512->1130|2539->1148|2578->1149|2624->1164|2674->1187|2699->1203|2739->1205|2792->1230|2829->1240|2844->1246|2890->1271|2927->1281|2940->1285|2971->1295|3016->1322|3029->1327|3068->1328|3121->1353|3158->1363|3173->1369|3218->1393|3282->1426|3328->1444|3491->1580|3519->1587|3560->1600|3873->1886|3888->1892|3949->1932
                  LINES: 28->1|33->1|35->3|41->9|41->9|45->13|45->13|45->13|58->26|58->26|58->26|58->26|63->31|63->31|63->31|73->41|73->41|73->41|73->41|74->42|74->42|74->42|75->43|75->43|75->43|75->43|75->43|75->43|75->43|76->44|76->44|76->44|77->45|77->45|77->45|77->45|78->46|80->48|90->58|90->58|91->59|105->73|105->73|105->73
                  -- GENERATED --
              */
          