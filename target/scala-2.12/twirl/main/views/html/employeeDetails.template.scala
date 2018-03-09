
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

object employeeDetails extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[models.Employee,models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(e: models.Employee,user: models.users.User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.72*/("""

"""),_display_(/*3.2*/main("Full Image", user)/*3.26*/ {_display_(Seq[Any](format.raw/*3.28*/("""

  """),format.raw/*5.3*/("""<div class="col-sm-10">
    <table class="table table-bordered table-hover table-condensed">
      """),_display_(/*7.8*/if(flash.containsKey("success"))/*7.40*/ {_display_(Seq[Any](format.raw/*7.42*/("""
        """),format.raw/*8.9*/("""<div class="alert alert-success">
          """),_display_(/*9.12*/flash/*9.17*/.get("success")),format.raw/*9.32*/("""
        """),format.raw/*10.9*/("""</div>
      """)))}),format.raw/*11.8*/("""
      """),format.raw/*12.7*/("""<thead>
        <tr>
          <th>Image</th> 
          <th>ID</th> 
          <th>Name</th>
          <th>Address</th>
        </tr>
      </thead>

      <tbody>

          <tr>
              """),_display_(/*24.16*/if(env.resource("public/images/employeeImages/" + e.getId + ".jpg").isDefined)/*24.94*/ {_display_(Seq[Any](format.raw/*24.96*/("""
                """),format.raw/*25.17*/("""<td><img src="/assets/images/employeeImages/"""),_display_(/*25.62*/(e.getId + ".jpg")),format.raw/*25.80*/(""""/></td>
            """)))}/*26.15*/else/*26.20*/{_display_(Seq[Any](format.raw/*26.21*/("""
                """),format.raw/*27.17*/("""<td><img src="/assets/images/employeeImages/noImage.jpg"/></td>
            """)))}),format.raw/*28.14*/("""
            """),format.raw/*29.13*/("""<td class="numeric">"""),_display_(/*29.34*/e/*29.35*/.getId),format.raw/*29.41*/("""</td>
            <td class="String">"""),_display_(/*30.33*/e/*30.34*/.getName),format.raw/*30.42*/("""</td>
            <td  class="String">"""),_display_(/*31.34*/e/*31.35*/.getAddress.getName),format.raw/*31.54*/("""</td>
            
          </tr>
        
      </tbody>

    </table>

    
  </div>
</div>
""")))}),format.raw/*42.2*/("""
"""))
      }
    }
  }

  def render(e:models.Employee,user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(e,user,env)

  def f:((models.Employee,models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (e,user,env) => apply(e,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 09 11:26:03 GMT 2018
                  SOURCE: /home/wdd/webapps/sdevCA/app/views/employeeDetails.scala.html
                  HASH: 189b157027228d2d3fde8d1c65f74affe78e4ea4
                  MATRIX: 1006->1|1171->71|1199->74|1231->98|1270->100|1300->104|1425->204|1465->236|1504->238|1539->247|1610->292|1623->297|1658->312|1694->321|1738->335|1772->342|1995->538|2082->616|2122->618|2167->635|2239->680|2278->698|2319->721|2332->726|2371->727|2416->744|2524->821|2565->834|2613->855|2623->856|2650->862|2715->900|2725->901|2754->909|2820->948|2830->949|2870->968|2996->1064
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|44->12|56->24|56->24|56->24|57->25|57->25|57->25|58->26|58->26|58->26|59->27|60->28|61->29|61->29|61->29|61->29|62->30|62->30|62->30|63->31|63->31|63->31|74->42
                  -- GENERATED --
              */
          