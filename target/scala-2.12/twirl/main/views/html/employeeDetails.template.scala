
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
            """),format.raw/*31.13*/("""<td class="numeric">"""),_display_(/*31.34*/e/*31.35*/.getId),format.raw/*31.41*/("""</td>
            <td class="String">"""),_display_(/*32.33*/e/*32.34*/.getName),format.raw/*32.42*/("""</td>
            <td class="String">"""),_display_(/*33.33*/e/*33.34*/.getAddress.getName),format.raw/*33.53*/("""</td>
            <td class="String">"""),_display_(/*34.33*/e/*34.34*/.getAddress.getEirCode),format.raw/*34.56*/("""</td>
            <td class="String">"""),_display_(/*35.33*/e/*35.34*/.getAddress.getCountry),format.raw/*35.56*/("""</td>
            
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
                  DATE: Fri Mar 09 12:56:27 GMT 2018
                  SOURCE: /home/wdd/webapps/sdevCA/app/views/employeeDetails.scala.html
                  HASH: 78d56f7709fc18639948f8d479b3c19ba38668cf
                  MATRIX: 1006->1|1171->71|1199->74|1231->98|1270->100|1300->104|1425->204|1465->236|1504->238|1539->247|1610->292|1623->297|1658->312|1694->321|1738->335|1772->342|2050->593|2137->671|2177->673|2222->690|2294->735|2333->753|2374->776|2387->781|2426->782|2471->799|2579->876|2620->889|2668->910|2678->911|2705->917|2770->955|2780->956|2809->964|2874->1002|2884->1003|2924->1022|2989->1060|2999->1061|3042->1083|3107->1121|3117->1122|3160->1144|3286->1240
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|44->12|58->26|58->26|58->26|59->27|59->27|59->27|60->28|60->28|60->28|61->29|62->30|63->31|63->31|63->31|63->31|64->32|64->32|64->32|65->33|65->33|65->33|66->34|66->34|66->34|67->35|67->35|67->35|78->46
                  -- GENERATED --
              */
          