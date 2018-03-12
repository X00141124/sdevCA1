
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
"""),format.raw/*4.1*/("""<div class="col-sm-2"></div>
  <div class="col-sm-8">
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
          <th>Eir Code</th>
          <th>Country</th>
        </tr>
      </thead>

      <tbody>

          <tr>
              """),_display_(/*26.16*/if(env.resource("public/images/employeeImages/" + e.getId + ".jpg").isDefined)/*26.94*/ {_display_(Seq[Any](format.raw/*26.96*/("""
                """),format.raw/*27.17*/("""<td><img src="/assets/images/employeeImages/"""),_display_(/*27.62*/(e.getId + ".jpg")),format.raw/*27.80*/(""""/></td>
            """)))}/*28.15*/else/*28.20*/{_display_(Seq[Any](format.raw/*28.21*/("""
                """),format.raw/*29.17*/("""<td><img src="/assets/images/employeeImages/noImage.jpg"/></td>
            """)))}),format.raw/*30.14*/("""
            """),format.raw/*31.13*/("""<td class="numeric">"""),_display_(/*31.34*/e/*31.35*/.getId()),format.raw/*31.43*/("""</td>
            <td class="String">"""),_display_(/*32.33*/e/*32.34*/.getName()),format.raw/*32.44*/("""</td>
            <td class="String">"""),_display_(/*33.33*/e/*33.34*/.getAddress().getStreet()),format.raw/*33.59*/("""</td>
            <td class="String">"""),_display_(/*34.33*/e/*34.34*/.getAddress().getEirCode()),format.raw/*34.60*/("""</td>
            <td class="String">"""),_display_(/*35.33*/e/*35.34*/.getAddress().getCountry()),format.raw/*35.60*/("""</td>
            
          </tr>
        
      </tbody>

    </table>

    
  </div>
</div>
""")))}),format.raw/*46.2*/("""
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
                  DATE: Mon Mar 12 16:00:49 GMT 2018
                  SOURCE: /home/wdd/webapps/sdevCA1/app/views/employeeDetails.scala.html
                  HASH: 11607d04f8fc9279165964c99e5755a28e3a5044
                  MATRIX: 1006->1|1171->71|1199->74|1231->98|1270->100|1297->101|1452->231|1492->263|1531->265|1566->274|1637->319|1650->324|1685->339|1721->348|1765->362|1799->369|2077->620|2164->698|2204->700|2249->717|2321->762|2360->780|2401->803|2414->808|2453->809|2498->826|2606->903|2647->916|2695->937|2705->938|2734->946|2799->984|2809->985|2840->995|2905->1033|2915->1034|2961->1059|3026->1097|3036->1098|3083->1124|3148->1162|3158->1163|3205->1189|3331->1285
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|44->12|58->26|58->26|58->26|59->27|59->27|59->27|60->28|60->28|60->28|61->29|62->30|63->31|63->31|63->31|63->31|64->32|64->32|64->32|65->33|65->33|65->33|66->34|66->34|66->34|67->35|67->35|67->35|78->46
                  -- GENERATED --
              */
          